package br.edu.iftm.marcos.vinicio.prova.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Product {

    private String descrition;
    private Integer price;
    private Date availableFrom;


}



