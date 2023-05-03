package com.curso.udemy.msavaliadorcredito.application.ex;

import lombok.Getter;

public class ErroComunicacaoMicroservicesException extends Exception{

    @Getter
    private Integer status;

    public ErroComunicacaoMicroservicesException(String mensagem, Integer status){
        super(mensagem);
        this.status = status;
    }
}
