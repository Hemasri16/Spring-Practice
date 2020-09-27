package com.dxc;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages="com.dxc")
@SpringBootApplication

public class Demo08SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo08SpringSecurityApplication.class, args);
	}

}
