package com.xuyj.springboot.repository;


import com.xuyj.springboot.entity.SysLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysLogRepository  extends JpaRepository<SysLogEntity,Integer> {
}
