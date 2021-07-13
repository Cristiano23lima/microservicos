package com.cristiano.teste1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Teste1Application {

	public static void main(String[] args) {
		SpringApplication.run(Teste1Application.class, args);
	}

}
