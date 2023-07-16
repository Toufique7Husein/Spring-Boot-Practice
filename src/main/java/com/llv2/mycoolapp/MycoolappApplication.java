package com.llv2.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.ll2.util",
		"com.ll2.mycoolapp"})
public class MycoolappApplication {


	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
