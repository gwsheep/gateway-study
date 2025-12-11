package com.jstudy.moduleOne.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//servlet application의 경우 활용할 수 있는 feign client
//reactive application이면 web client 활용 가능
@FeignClient(name = "module-two")
public interface FeignInterface {

    @GetMapping("/modTwo/test")
    String test(@RequestParam String name);


}
