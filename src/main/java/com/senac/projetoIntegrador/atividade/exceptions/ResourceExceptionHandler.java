package com.senac.projetoIntegrador.atividade.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<StandardError> userNotFound(UserNotFoundException ex, HttpServletRequest request){
        StandardError errors = new StandardError(System.currentTimeMillis(), HttpStatus.FORBIDDEN.value(), "Validation error", "Usuário não encontrado.", request.getRequestURI());
        
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errors);
    }
}
