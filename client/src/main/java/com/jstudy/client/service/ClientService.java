package com.jstudy.client.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final RestClient restClient;

    public String getMessage(String name) {
        return restClient.get()
                .uri("http://localhost:9000/modOne/feign?name={name}", name)
                .retrieve()
                .body(String.class);
    }

}
