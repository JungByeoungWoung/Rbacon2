package com.Rbacon2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.Rbacon2.mapper"})
@SpringBootApplication
public class Rbacon2Application {

	public static void main(String[] args) {
		SpringApplication.run(Rbacon2Application.class, args);
	}

}
