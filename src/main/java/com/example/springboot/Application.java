package com.example.springboot;

import java.io.*;
import java.util.List;

import com.example.springboot.model.Vehicle;
import com.example.springboot.service.VehicleService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}
	@Bean
	CommandLineRunner runner(VehicleService vehicleService) {
		return args -> {
			// reads json file and tries to create a list of vehicles
			File data = new File(System.getProperty("user.dir") + "/src/main/resources/data.json");
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Vehicle>> typeReference = new TypeReference<List<Vehicle>>(){};
			try {
				mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
				List<Vehicle> vehicles = mapper.readValue(data,typeReference);
				// tries to save the vehicles in the db
				vehicleService.save(vehicles);
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}
}
