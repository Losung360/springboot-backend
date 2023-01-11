package com.springbootrestfulservices.springbootbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("model.Employee")
@SpringBootApplication
public class SpringbootBackendApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

}
