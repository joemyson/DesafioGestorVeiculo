package com.jsctech.desafiogestorveiculos.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Veiculos {
    public long id;
    public String modelo;
    public String fabricante;
    public int ano;


}
