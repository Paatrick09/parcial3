package com.example.parcial3.Services;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Configuracion  implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry cors){
    cors.addMapping("/**").allowedMethods(
      "*"
    );
  }
}
