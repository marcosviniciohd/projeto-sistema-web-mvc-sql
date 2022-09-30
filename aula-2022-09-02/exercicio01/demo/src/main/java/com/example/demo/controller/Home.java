package com.example.demo.controller;

import com.example.demo.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/home")
    public String home(Model model){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marcos");
        pessoa.setSobreNome("Vinício");
        model.addAttribute("p", pessoa);
        return "index";
    }
}
