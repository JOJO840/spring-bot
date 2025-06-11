package org.lexicon.springbot;

import org.lexicon.springbot.entity.AppUser;
import org.lexicon.springbot.entity.Details;
import org.lexicon.springbot.repository.AppUserRepository;
import org.lexicon.springbot.repository.DetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class SpringBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBotApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(AppUserRepository userRepo, DetailsRepository detailsRepo) {
        return args -> {

            Details details = new Details(
                    "jojo@example.com",
                    "Josip Jovanovic",
                    LocalDate.of(2000, 1, 1)
            );

            AppUser user = new AppUser();
            user.setUsername("Hippo123");
            user.setPassword("pass123");
            user.setRegDate(LocalDate.now());
            user.setDetails(details); // link the one-to-one relationship

            userRepo.save(user);

            System.out.println("✅ User inserted into DB!");
        };
    }


}
