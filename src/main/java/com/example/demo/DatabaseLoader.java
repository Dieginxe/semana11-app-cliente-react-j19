package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final InstrumentoRepository repository;

	@Autowired
	public DatabaseLoader(InstrumentoRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Instrumento("Guitara", "Cuerdas", "Tienes como 6 cuerdas de madera"));
		this.repository.save(new Instrumento("Ukelele", "Cuerdas", "De madera pequeña 4 cuerdas templadas"));
	}
}