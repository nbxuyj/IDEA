package com.xuyj.platform.aspect;


import com.xuyj.platform.db.entity.SysLogEntity;
import com.xuyj.platform.service.SysLogEntityService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 业务切片日志。
 */
@Aspect
@Component
public class LogDBAspect {
    @Resource
    SysLogEntityService logService;
        @Pointcut("@annotation(com.xuyj.platform.aspect.SysLog)")
    public void logDbPointCut() {}
    @Around(value= "logDbPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object result = point.proceed();
        long time = System.currentTimeMillis() - beginTime;
        try {
            //实现保存日志逻辑
            saveLog(point, time,result);
        } catch (Exception e) {

        }
        return result;
    }

    /**
     *
     * @param joinPoint
     * @param time  执行时间
     * @param res   执行结果。
     */
    private void saveLog(ProceedingJoinPoint joinPoint, long time,Object res) {

        // 获取方法的关键信息，类，包
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        StringBuilder sb=new StringBuilder();
        //操作类型、操作项目、操作内容、操作人.
        SysLogEntity sysLogEntity = new SysLogEntity();
        sysLogEntity.setExeuTime(time);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        sysLogEntity.setCreateDate(dateFormat.format(new Date()));
        SysLog sysLog = method.getAnnotation(SysLog.class);
        if(sysLog != null) {
            //注解上的描述
            sysLogEntity.setRemark(sysLog.value());
        }
        //请求的 类名、方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        sysLogEntity.setClassName(className);
        sysLogEntity.setMethodName(methodName);
        //请求的参数
        Object[] args = joinPoint.getArgs();
        try {
            List<String> list = new ArrayList<String>();
            for (Object o : args) {
                list.add(o.toString());
            }
            sysLogEntity.setParams(list.toString());
        } catch (Exception e){

        }
        logService.save(sysLogEntity);
    }


    }
