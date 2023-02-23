package com.xuyj.main.dao;


import com.xuyj.main.pojo.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDao extends CrudRepository<SecurityProperties.User,Long> {

    Optional<User> findByName(String name);
}