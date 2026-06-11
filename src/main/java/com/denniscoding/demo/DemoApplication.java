package com.denniscoding.demo;

import com.denniscoding.demo.models.Author;
import com.denniscoding.demo.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	){
		return args -> {
			var author = Author.builder()
					.firstName("Dennis")
					.lastName("Ikechukwu")
					.age(34)
					.email("okwuchukwudennis001@gmail.com")
					.build();
			repository.save(author);
		};
	}
}
