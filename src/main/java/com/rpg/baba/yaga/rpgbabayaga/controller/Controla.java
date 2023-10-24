package com.rpg.baba.yaga.rpgbabayaga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controla{

    @GetMapping("/minhapagina")
    public String minhaPagina() {
        return "index"; // Nome do arquivo HTML sem extensão
    }
}
