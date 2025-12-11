package com.jstudy.moduleThree.controller;


import com.jstudy.moduleThree.service.ThreeService;
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
@RequestMapping("/modThree")
public class ThreeController {

    private final ThreeService threeService;

    @GetMapping("/test")
    public ResponseEntity<?> testController(@RequestParam("name") String name) {
        log.info("[Mod3]before : " + name);
        String parsedName = threeService.parseName(name);
        log.info("[Mod3]after : " + parsedName);
        return ResponseEntity.ok(parsedName);
    }




}
