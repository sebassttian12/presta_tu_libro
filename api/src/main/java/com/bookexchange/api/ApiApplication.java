package com.bookexchange.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ApiApplication {

  public static void main(String[] args) {

    Dotenv dotenv = Dotenv.load();
    dotenv.entries().forEach(vde -> System.setProperty(vde.getKey(), vde.getValue()));
    SpringApplication.run(ApiApplication.class, args);
  }

}
