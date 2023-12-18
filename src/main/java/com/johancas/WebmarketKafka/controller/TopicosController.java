package com.johancas.WebmarketKafka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.johancas.WebmarketKafka.models.Topicos;

@RequestMapping("/ext/topicos")
@RestController
public class TopicosController {

    @GetMapping("")
    public Topicos[] enviarProductoExternoKafka(){
        return Topicos.values();
    }
}
