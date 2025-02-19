package com.teste.screenmatch_frases.controller;

import com.teste.screenmatch_frases.DTO.FraseDTO;
import com.teste.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/frases")
    public FraseDTO obterFrase() {
        return service.obterFrase();
    }

}
