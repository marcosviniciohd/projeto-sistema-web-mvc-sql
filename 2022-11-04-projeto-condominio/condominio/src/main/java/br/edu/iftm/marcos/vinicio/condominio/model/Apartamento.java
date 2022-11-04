package br.edu.iftm.marcos.vinicio.condominio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apartamento {
    private Integer idApartamento;
    private Integer qdtPortas;
    private Integer qdtQuartos;
    private String tipo;

}
