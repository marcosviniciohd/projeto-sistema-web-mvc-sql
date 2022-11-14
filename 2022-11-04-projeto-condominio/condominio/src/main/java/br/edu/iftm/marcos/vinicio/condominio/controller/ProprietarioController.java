package br.edu.iftm.marcos.vinicio.condominio.controller;

import br.edu.iftm.marcos.vinicio.condominio.model.Proprietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/proprietario")
public class ProprietarioController {

    @Autowired
    JdbcTemplate db;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("novo")
    public String exibeForm(Model model) {
        model.addAttribute("proprietario", new Proprietario());
        // trecho de código para alimentar o <select> do form
        List<Proprietario> proprietarios = db.query(
                "select * from proprietario",
                (res, rowNum) -> {
                    Proprietario proprietario = new Proprietario(
                            res.getInt("idProprietario"),
                            res.getString("nome"),
                    res.getString("telefone"));
                    return proprietario;
                });
        model.addAttribute("proprietarios", proprietarios);
        // fim do trecho
        return "formulario";
    }
}

