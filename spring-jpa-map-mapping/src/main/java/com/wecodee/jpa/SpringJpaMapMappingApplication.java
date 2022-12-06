package com.wecodee.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.wecodee.jpa.*")
@EnableJpaRepositories("com.wecodee.jpa.*")
public class SpringJpaMapMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMapMappingApplication.class, args);
	}
}
