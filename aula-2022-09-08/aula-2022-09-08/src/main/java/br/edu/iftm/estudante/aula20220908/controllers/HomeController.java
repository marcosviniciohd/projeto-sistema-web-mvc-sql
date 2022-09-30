package br.edu.iftm.estudante.aula20220908.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/inicio")
    public String index(){
        return "index";
    }

}
