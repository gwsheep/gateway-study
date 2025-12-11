package com.jstudy.moduleOne.controller;


import com.jstudy.moduleOne.api.FeignInterface;
import com.jstudy.moduleOne.service.OneService;
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
@RequestMapping("/modOne")
public class OneController {

    private final OneService oneService;

    private final FeignInterface feignInterface;

    @GetMapping("/test")
    public ResponseEntity<?> testController(@RequestParam("name") String name) {
        log.info("[Mod1]before : " + name);
        String parsedName = oneService.parseName(name);
        log.info("[Mod1]after : " + parsedName);
        return ResponseEntity.ok(parsedName);
    }

    @GetMapping("/feign")
    public ResponseEntity<?> feignController(@RequestParam("name") String name) {
        log.info("[Mod1-Feign]before : " + name);
        String parsedNameWithTwo = feignInterface.test(name);
        log.info("[Mod1-Feign]after : " + parsedNameWithTwo);
        return ResponseEntity.ok(parsedNameWithTwo);
    }




}
