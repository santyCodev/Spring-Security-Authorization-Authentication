package com.santicodev.SpringSecurityauthorizationautentication.repository;

import com.santicodev.SpringSecurityauthorizationautentication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
