package com.jstudy.moduleOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ModuleOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleOneApplication.class, args);
	}

}
