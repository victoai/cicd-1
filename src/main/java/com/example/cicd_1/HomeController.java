package com.example.cicd_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @ResponseBody
    @GetMapping("/hi")
    public  String hi(){
        return  "hi";
    }


    @ResponseBody
    @GetMapping("/hi2")
    public  String hi2(){
        return  "hi2";
    }
}
