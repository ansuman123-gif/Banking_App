package com.ansuman.banking_app;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot REST API Documentation",
				description = "Spring Boot REST API Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Ansuman",
						email = "ansuman@example.com",
						url = "https://www.ansuman.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.ansuman.com/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot Account Management Documentation",
				url = "https://www.ansuman.com/user_management.html"
		)
)
public class BankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppApplication.class, args);
	}

}
