package org.sofka.radar.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfiguration {

    public WebClient webClient;

    @Bean
    public WebClient webClient(){
        WebClient webClient = WebClient
                .builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .defaultCookie("cookieKey", "cookieValue")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
        return webClient;
    }
}
