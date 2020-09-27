package com.dxc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@ComponentScan("com.dxc")
@RestController
@SpringBootApplication
public class Demo04WebMvcApplication {
	
	@GetMapping("/")
	public String home() {
		return "Welcome to DXC";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo04WebMvcApplication.class, args);
	}

}
