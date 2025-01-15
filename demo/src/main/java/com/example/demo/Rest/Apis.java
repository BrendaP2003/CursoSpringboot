package com.example.demo.Rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apis {


    private static final Logger logger = LoggerFactory.getLogger(Apis.class);

    @GetMapping("/")
    public String Hello() {
        logger.info("Mi Primera Api funciona");
        return "Hola mi nombre es Brenda";

    }
}
