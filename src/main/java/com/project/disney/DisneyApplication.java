package com.project.disney;

import com.project.disney.entities.DisneyMovieEntity;
import com.project.disney.repositories.DisneyMovieRepository;
import com.project.disney.services.DisneyMovieService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class DisneyApplication {

	private static final Logger log = LoggerFactory.getLogger(DisneyApplication.class);

	private DisneyMovieService disneyMovieService;

    public static void main(String[] args) {
        SpringApplication.run(DisneyApplication.class, args);
    }
}
