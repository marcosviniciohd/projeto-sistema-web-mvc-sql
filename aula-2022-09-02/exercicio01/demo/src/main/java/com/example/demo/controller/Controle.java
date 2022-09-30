package com.example.demo.controller;

import com.example.demo.model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controle {

    @RequestMapping("/verproduto")
    public String exibirProduto(Model model){
        Produto produto = new Produto();
        model.addAttribute("prod", produto);
        produto.setNome("Notebook");
        produto.setPreco(5999.00);
        return "exibirProduto";
    }
}
