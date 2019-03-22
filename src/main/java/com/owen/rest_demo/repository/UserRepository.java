package com.owen.rest_demo.repository;

import com.owen.rest_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @description
 * @autuor
 * @Date 2019-03-22 10:24
 */
@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, Long> {
}
