package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		List<String> nombres = Arrays.asList("Juan", "María", "Pedro", "Juan", "María");
		Map<String, Long> conteo = nombres.stream()
				.collect(Collectors.groupingBy(nombre -> nombre, Collectors.counting()));
		System.out.println(conteo);

	}

}
