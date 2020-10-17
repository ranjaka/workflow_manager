package com.personal.camundamanager;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication("camunda-manager")
public class CamundaManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaManagerApplication.class, args);
	}

}
