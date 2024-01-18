package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("inside main method11111111");
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("inside main method");
	}

}
