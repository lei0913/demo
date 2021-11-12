package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@SpringBootApplication标注这个类是SpringBoot的应用
@SpringBootApplication
public class DockertestApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(DockertestApplication.class);
		builder.headless(false).run(args);
		//SpringApplication.run(DockertestApplication.class, args);
	}

}
