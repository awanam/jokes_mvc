package com.el.jokes_mvc.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.el.jokes_mvc.models.Joke;
import com.el.jokes_mvc.repositories.JokeRepository;

@Configuration
@Profile("development")
public class SeedData {
	
	public SeedData(JokeRepository jokeRepository) {
		jokeRepository.save(new Joke("Why did the chicken cross the road?", "To get to the other side.", 2));
		jokeRepository.save(new Joke("How do you make a tissue dance?", "Put a little boogie in it.", 5));
		jokeRepository.save(new Joke("Lorem ipsum dolor sut amet", "Hello World!", 7));
	}

}