package com.santicodev.SpringSecurityauthorizationautentication.repository;

import com.santicodev.SpringSecurityauthorizationautentication.entity.Role;
import com.santicodev.SpringSecurityauthorizationautentication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
