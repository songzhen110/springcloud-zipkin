package com.songz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ZipkinBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinBootApplication.class, args);
	}
}
