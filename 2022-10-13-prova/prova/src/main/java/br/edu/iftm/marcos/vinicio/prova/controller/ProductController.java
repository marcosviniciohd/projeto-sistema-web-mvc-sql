package br.edu.iftm.marcos.vinicio.prova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("produto")
    public String listaProdutos(){

        return "product";
    }

}
