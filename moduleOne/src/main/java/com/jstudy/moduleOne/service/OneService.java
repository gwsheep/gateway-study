package com.jstudy.moduleOne.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OneService {


    public String parseName(String name) {

        String parsedName = name + " is pased by One Module";
        return parsedName;

    }



}
