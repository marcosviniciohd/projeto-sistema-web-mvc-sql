package br.edu.iftm.estudante.recuperacao.controller;

import br.edu.iftm.estudante.recuperacao.model.Prova;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProvaController {
    @GetMapping("/prova")
    public String questao(Model model){
        List<Prova> provas = new ArrayList<Prova>();
        provas.add(new Prova("Javascript", "10.0", "9.0"));
        provas.add(new Prova("POO", "7.0", "5.0"));
        provas.add(new Prova("POO2", "6.0", "3.0"));
        model.addAttribute("lista", provas);
        return "prova";
    }
}
