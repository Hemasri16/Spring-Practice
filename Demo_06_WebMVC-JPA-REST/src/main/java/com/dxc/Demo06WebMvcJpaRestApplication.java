package com.dxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.dxc")
@SpringBootApplication
public class Demo06WebMvcJpaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo06WebMvcJpaRestApplication.class, args);
	}

}
