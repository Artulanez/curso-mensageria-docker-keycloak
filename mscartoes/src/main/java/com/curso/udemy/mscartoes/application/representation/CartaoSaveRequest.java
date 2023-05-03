package com.curso.udemy.mscartoes.application.representation;
import com.curso.udemy.mscartoes.domain.BandeiraCartao;
import com.curso.udemy.mscartoes.domain.Cartao;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoSaveRequest {

    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limiteBasico;

    public Cartao toModel(){
        return new Cartao(nome,bandeira,renda,limiteBasico);
    }
}
