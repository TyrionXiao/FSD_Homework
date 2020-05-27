package com.ibm.tyrion.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.ibm.tyrion.persistence.repo")
@EntityScan("com.ibm.tyrion.persistence.model")
@SpringBootApplication(scanBasePackages = {"com.ibm.tyrion.controller"})
public class Application extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
