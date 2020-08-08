package com.example.hibernatepractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class HibernatePracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernatePracticeApplication.class, args);
    }

}
