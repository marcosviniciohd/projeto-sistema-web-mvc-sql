package br.edu.iftm.marcos.vinicio.condominio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proprietario {
    private Integer idProprietario;
    private String nome;
    private String telefone;
}
