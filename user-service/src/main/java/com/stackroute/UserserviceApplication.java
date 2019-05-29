package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/* @SpringBootApplication -- > Either this or the below mentioned three annotations... */

//@ComponentScan
//@Configuration
//@EnableAutoConfiguration


@EnableEurekaClient
@SpringBootApplication

public class UserserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserserviceApplication.class, args);
	}

}
