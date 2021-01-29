package org.dis;

import com.google.gson.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ExamenDisApplication {

	private static final Logger log = LoggerFactory.getLogger(ExamenDisApplication.class);
	public static final String DOCUMENTO_JSON = System.getProperty("user.dir") + "/src/main/java/org/dis/data.json";
	public static List<IP> ips;

	public static void main(String[] args) {
		SpringApplication.run(ExamenDisApplication.class);
	}

	@Bean
	public CommandLineRunner loadData(IPRepository IPRepository, IPRepository actorRepository) {
		return (args) -> {
			//Cargamos las películas por defecto
			cargarIPJSON(IPRepository, INICIAL_JSON);
		};
	}


}