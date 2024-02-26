package com.haphuthinh.learn.spingboot.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class SpringInitApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringInitApplication.class, args);
		System.out.println("Hello World");
	}

}
