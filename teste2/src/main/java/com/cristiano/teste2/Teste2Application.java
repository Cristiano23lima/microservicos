package com.cristiano.teste2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Teste2Application {

	public static void main(String[] args) {
		SpringApplication.run(Teste2Application.class, args);
	}

}
