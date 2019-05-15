package com.movie.pncinema.server.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Boot 启动类（网关程序）
 * @author leiyongqi
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistrationCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationCenterApplication.class, args);
	}

	@EnableWebSecurity
	static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
					.authorizeRequests()
					.anyRequest()
					.authenticated()
					.and()
					.httpBasic();
		}
	}
}
