package com.ziemo.baller.nbamanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NbaManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(NbaManagerApplication.class, args);
	}
}


/*
README
Use Spring Boot to create the project.
From 2 to 3 resources.
Between two of available resources, relation have to be defined.
You HAVE to use H2 or PostgreSQL database.
Keep separate concerns of your app - controller, service, repository. Make sure responsibilities are
not mixed, e.g. controller is responsible for operating on HTTP layer and passing data further,
only
 */