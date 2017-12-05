package com.example.springbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * --spring.profiles.active=staging
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.example.controller", "com.example.springbootdemo"})
//@ComponentScan("com.example.controller")
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		log.info("args={}",args);
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
}
