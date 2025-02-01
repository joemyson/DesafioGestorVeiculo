package com.jsctech.desafiogestorveiculos.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Carro extends Veiculos {

    public int quantidadePorta;
    public String tipoCombustivel;


}
