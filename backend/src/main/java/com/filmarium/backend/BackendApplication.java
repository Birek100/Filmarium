package com.filmarium.backend;

import com.filmarium.backend.entities.User;
import com.filmarium.backend.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }
        @Bean
        CommandLineRunner run (UserRepository userRepository){
            return args -> {
                User user1 = new User();
                user1.setName("Alicja");
                user1.setEmail("alicja@gmail.com");
                userRepository.save(user1);
            };
        }

    }
