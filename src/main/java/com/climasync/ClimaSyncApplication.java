package com.climasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClimaSyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClimaSyncApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner runner() {
//        return args -> {
//            Locale locale = new Locale("en", "CV");
//
//            String countryName = locale.getDisplayCountry();
//
//            System.out.println(countryName);
//
//            System.out.println();
//        };
//    }

}
