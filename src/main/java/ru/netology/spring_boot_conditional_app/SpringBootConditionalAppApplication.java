package ru.netology.spring_boot_conditional_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootConditionalAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootConditionalAppApplication.class, args);
	}
}
