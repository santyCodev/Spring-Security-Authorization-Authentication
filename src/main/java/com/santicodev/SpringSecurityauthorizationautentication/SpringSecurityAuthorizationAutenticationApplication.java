package com.santicodev.SpringSecurityauthorizationautentication;

import com.santicodev.SpringSecurityauthorizationautentication.entity.Role;
import com.santicodev.SpringSecurityauthorizationautentication.entity.User;
import com.santicodev.SpringSecurityauthorizationautentication.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityAuthorizationAutenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAuthorizationAutenticationApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SPER_ADMIN"));

			userService.saveUser(new User(null, "Jhon Travolta", "jhon", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Will Smith", "will", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Jim Carrey", "jim", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Arnold Schwarzeegger", "arnold", "1234", new ArrayList<>()));

			userService.addRoleToUser("jhon", "ROLE_USER");
			userService.addRoleToUser("jhon", "ROLE_MANAGER");
			userService.addRoleToUser("will", "ROLE_MANAGER");
			userService.addRoleToUser("jim", "ROLE_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_ADMIN");
			userService.addRoleToUser("arnold", "ROLE_USER");
			userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");
		};
	};

}
