package com.sukriti.backend.billingorder.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.sukriti.backend.billingorder.controller")
@EntityScan("com.sukriti.backend.billingorder.entity")
@EnableJpaRepositories("com.sukriti.backend.billingorder.repository")
public class Application {

	private static final Logger log = LoggerFactory
			.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("!! Application BillingOrder Started !!");
	}

	/* To check what beans are configued by Spring-Boot !! */
	/*
	 * @Bean public CommandLineRunner commandLineRunner(ApplicationContext ctx)
	 * { return args -> {
	 * 
	 * System.out.println("Let's inspect the beans provided by Spring Boot:");
	 * 
	 * String[] beanNames = ctx.getBeanDefinitionNames();
	 * Arrays.sort(beanNames); for (String beanName : beanNames) {
	 * System.out.println(beanName); }
	 * 
	 * }; }
	 */

}