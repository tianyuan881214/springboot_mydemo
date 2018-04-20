package com.example.springboot_jpa_jsp_oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootJpaJspOracleApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootJpaJspOracleApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaJspOracleApplication.class, args);
	}
}
