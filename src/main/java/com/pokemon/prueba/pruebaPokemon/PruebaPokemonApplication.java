package com.pokemon.prueba.pruebaPokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.pokemon.prueba.pruebaPokemon.*" })
public class PruebaPokemonApplication {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PruebaPokemonApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(PruebaPokemonApplication.class, args);
	}

}
