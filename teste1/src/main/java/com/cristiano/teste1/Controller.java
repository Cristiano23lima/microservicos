package com.cristiano.teste1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste1")

public class Controller {
    @GetMapping(value="/get-data")
    public String getData() {
        return "Hello world do microserviço teste1";
    }
}
