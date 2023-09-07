package com.javatechie.jenkin.api;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringJenkinsApplication
{

	@PostConstruct
	public void intt()
	{
		log.info("Application started.....");
	}

	public static void main(String[] args)
	{
		log.info("Application executed....................");
		log.info("Another log statement....................");
		log.info("Adding 3rd log statement....................");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
