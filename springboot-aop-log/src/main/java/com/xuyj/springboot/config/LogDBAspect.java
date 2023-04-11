package com.xuyj.springboot.config;

import com.xuyj.springboot.entity.SysLogEntity;
import com.xuyj.springboot.service.SysLogService;
import lombok.var;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.text.MessageFormat;
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
    SysLogService sysLogService;

    /**
     * 这里我们使用注解的形式
     * 当然，我们也可以通过切点表达式直接指定需要拦截的package,需要拦截的class 以及 method
     * 切点表达式:   execution(...)
     */
    @Pointcut("@annotation(com.xuyj.springboot.config.SysDbLog)")
    public void logDbPointCut() {}

//    @Around("logDbPointCut()")


    @Around(value= "logDbPointCut() && @annotation(opLog)")
    public Object around(ProceedingJoinPoint point,SysDbLog opLog) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object result = point.proceed();
        long time = System.currentTimeMillis() - beginTime;
        try {
            //实现保存日志逻辑
            saveLog(point, time,result,opLog);
        } catch (Exception e) {

        }
        return result;
    }

    /**
     *
     * @param joinPoint
     * @param time  执行时间
     * @param res   执行结果。
     * @param opLog 标识。
     */
    private void saveLog(ProceedingJoinPoint joinPoint, long time,Object res,SysDbLog opLog) {

        // 获取方法的关键信息，类，包
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        StringBuilder sb=new StringBuilder();
        var fullName=method.getDeclaringClass().getName();
        var  entityName=fullName.split("\\.")[fullName.split("\\.").length-1].replace("Service","");
        switch (opLog.method()){
            case 删除:
                //表删除Guid.
                sb.append(MessageFormat.format("删除表{0},参数:{1}",entityName,""));
            case 新增:
            case 更新:
        }

        SysLogEntity sysLogEntity = new SysLogEntity();
        sysLogEntity.setExeuTime(time);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        sysLogEntity.setCreateDate(dateFormat.format(new Date()));
        SysDbLog sysLog = method.getAnnotation(SysDbLog.class);





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
        sysLogService.save(sysLogEntity);
    }
}
