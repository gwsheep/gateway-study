package com.jstudy.moduleThree.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ThreeService {


    public String parseName(String name) {

        String parsedName = name + " is parsed by One Module";
        return parsedName;

    }



}
