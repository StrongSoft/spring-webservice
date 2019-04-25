package com.regur.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leeseungmin on 2019-04-25
 */
@RestController
public class WebRestController {
    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
}
