package com.cristiano.teste2;

import javax.print.attribute.standard.Media;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste2")
public class Controller {
    @GetMapping(value = "/get-data")
    public String getData() {
        return "Hello world do microserviço teste2";
    }

    @PostMapping(value = "/set-data")
    public String setData(@RequestParam String nome) {
        return nome;
    }

    @PostMapping(value = "/set-data2", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String setData2(@RequestBody String nome) {
        return nome;
    }
}