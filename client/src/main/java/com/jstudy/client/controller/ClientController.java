package com.jstudy.client.controller;

import com.jstudy.client.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/test")
    public ResponseEntity<?> getTest(@RequestParam("name") String name) {
        log.info("======= client start =========");
        String parsed = clientService.getMessage(name);
        log.info("======= client end =========");
        return ResponseEntity.ok(parsed);
    }


}
