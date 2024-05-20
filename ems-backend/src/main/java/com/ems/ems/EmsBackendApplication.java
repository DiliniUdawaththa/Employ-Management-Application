package com.ems.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.ems.ems.entity")
@EnableJpaRepositories(basePackages = "com.ems.ems.repository")
public class EmsBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmsBackendApplication.class, args);
	}
}
