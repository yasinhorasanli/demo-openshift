package com.ttnet.partner.openshiftdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftdemoApplication {

    @GetMapping("/")
    public String welcome(){
        return "Welcome Home Page";
    }
    @GetMapping("/{input}")
    public String congrats(@PathVariable String input){
        return "hi " + input + " successfuly deployed!";
    }
    public static void main(String[] args) {
        SpringApplication.run(OpenshiftdemoApplication.class, args);
    }

}
