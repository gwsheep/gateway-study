package com.jstudy.moduleTwo.controller;


import com.jstudy.moduleTwo.service.TwoService;
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
@RequestMapping("/modTwo")
public class TwoController {

    private final TwoService twoService;

    @GetMapping("/test")
    public ResponseEntity<?> testController(@RequestParam("name") String name) {
        log.info("[Mod2]before : " + name);
        String parsedName = twoService.parseName(name);
        log.info("[Mod2]after : " + parsedName);
        return ResponseEntity.ok(parsedName);
    }




}
