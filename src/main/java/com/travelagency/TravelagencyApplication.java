package com.travelagency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.travelagency"})
public class TravelagencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelagencyApplication.class, args);
    }

}
