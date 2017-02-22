package com.cetrinw.base.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Cetrin Wang on 2017/2/22.
 */
@SpringBootApplication
@EnableJpaRepositories("com.cetrinw")
@EntityScan("com.cetrinw")
@ComponentScan("com.cetrinw")
public class SpringBootSpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSpaApplication.class);
    }
}
