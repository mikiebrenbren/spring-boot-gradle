package com.mike;

import com.mike.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@SpringBootApplication
public class Application extends AbstractSecurityWebApplicationInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public Application() {
        super(SecurityConfig.class);
    }

}