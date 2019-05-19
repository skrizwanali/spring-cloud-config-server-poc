package com.configserver.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigPocApplication.class, args);
	}

}
