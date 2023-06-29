package com.senac.projetoIntegrador.atividade.exceptions;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String errorMsg){
        super(errorMsg);
    }

    public UserNotFoundException() {
    }
}
