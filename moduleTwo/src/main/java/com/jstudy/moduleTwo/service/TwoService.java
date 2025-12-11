package com.jstudy.moduleTwo.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TwoService {


    public String parseName(String name) {

        String parsedName = name + " is parsed by Two Module";
        return parsedName;

    }



}
