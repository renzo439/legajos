package com.ms.legajos;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info= @Info(title= "Legajos API", version="1.0", description = "Orquestador Legajos"))
public class LegajosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegajosApplication.class, args);
	}

}
