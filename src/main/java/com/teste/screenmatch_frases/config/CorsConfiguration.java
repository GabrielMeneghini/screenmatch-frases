package com.teste.screenmatch_frases.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry)  {
            registry.addMapping("/**") // Aplica CORS a todos os endpoints
                    .allowedOrigins("http://127.0.0.1:5501") // Define as origens permitidas
                    .allowedMethods("GET", "POST", "PUT", "DELETE"); // Define os headers permitidos
    }
}
