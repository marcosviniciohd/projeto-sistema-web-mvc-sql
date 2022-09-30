package br.edu.iftm.estudante.exercicio02.exercicio02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class GeradorSorteio {

    @GetMapping("/sorteio")
    public String geraSorteio(Model model){
        List<Integer> nroSorteados = new ArrayList<>();
        Random geraNumeros = new Random();
        for (int i = 1; i <= 6; i++){
            Integer numero = geraNumeros.nextInt(59)+1;
            nroSorteados.add(numero);
        }
        model.addAttribute("numero", nroSorteados);
        return "sorteio";
    }

}
