package com.mibeargui.petshop.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final Contact DEFAULT_CONTACT = new Contact(
            "Guilherme Graebim", "https://github.com/Graebim", "guigraebim3@gmail.com");

    private static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
            "PetShop API", "Sistema de controle de atendimentos de uma petshop", "1.0",
            "urn:tos", DEFAULT_CONTACT,
            "SpringToolSuite4", "https://spring.io/blog/2021/06/21/spring-tools-4-11-0-released", Collections.emptyList()
    );

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .build();
    }
}