package com.example.Douban;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.Douban.mapper")
public class DoubanApplication {
	public static void main(String[] args) {
		SpringApplication.run(DoubanApplication.class, args);
	}
}
