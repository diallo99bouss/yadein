package com.yadein;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.yadein.entity")

public class YadeinApplication {

	public static void main(String[] args) {

		SpringApplication.run(YadeinApplication.class, args);
	}

}
