package com.xuyj.springboot.service;

import com.xuyj.springboot.entity.SysLogEntity;
import com.xuyj.springboot.repository.SysLogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class SysLogService {
    @Resource
    SysLogRepository sysLogRepository;
    public boolean save(SysLogEntity sysLogEntity){
        SysLogEntity save = sysLogRepository.save(sysLogEntity);
        // 这里就不做具体实现了
        log.info(sysLogEntity.getParams());
        return true;
    }
}
