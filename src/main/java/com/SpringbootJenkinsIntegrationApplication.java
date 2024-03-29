package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootJenkinsIntegrationApplication {

	Logger log = LoggerFactory.getLogger(SpringbootJenkinsIntegrationApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("Application started......");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsIntegrationApplication.class, args);
	}
	
	

	 @PreDestroy
	public void destroy(){
		log.info("application destroyed...");
	 }
	 

}
