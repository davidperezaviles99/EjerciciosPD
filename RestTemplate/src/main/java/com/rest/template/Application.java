package com.rest.template;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {
 
    public static void main(String[] args) {
 
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }
 
    @Override
    public void run(String... arg0) throws Exception {
 
        RestTemplate plantilla = new RestTemplate();
        String resultado = plantilla.getForObject("http://localhost:8080/hola", String.class);
        System.out.println(resultado);
 
    }
}
