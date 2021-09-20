package com.santicodev.SpringSecurityauthorizationautentication.service;

import com.santicodev.SpringSecurityauthorizationautentication.entity.Role;
import com.santicodev.SpringSecurityauthorizationautentication.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
