package com.example.springboot_eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootEurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaclientApplication.class, args);
	}
}
