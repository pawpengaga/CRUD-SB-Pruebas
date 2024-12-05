package com.pawpengaga.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pawpengaga.main.modelo.Dvd;

@SpringBootApplication
public class CrudSbApplication{

	public static void main(String[] args) {
		SpringApplication.run(CrudSbApplication.class, args);
	}

	// Aqui irian un monton de objetos dvd para trabajarse por consola

}
