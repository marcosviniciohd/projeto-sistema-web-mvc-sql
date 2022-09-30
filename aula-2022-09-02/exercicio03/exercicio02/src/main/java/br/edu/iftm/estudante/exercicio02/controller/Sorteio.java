package br.edu.iftm.estudante.exercicio02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class Sorteio {

    @GetMapping (value = "/sorteio")
    public String geraSorteio(Model model){
        List<Integer> nroSorteados = new ArrayList<>();
        Random geraNumeros = new Random();
        for (int i = 1; i <= 6; i++){
            Integer numero = geraNumeros.nextInt(60)+1;
            nroSorteados.add(numero);
        }
        model.addAttribute("numero", nroSorteados);
        return "sorteio";
    }
}
