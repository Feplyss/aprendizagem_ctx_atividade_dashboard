package com.senac.projetoIntegrador.atividade.exceptions;

public class StandardError {
     private long date;
     private int status;
     private String error;
     private String mensagem;
     private String path;

    public StandardError() {
    }

    public StandardError(long date, int status, String error, String message, String path) {
        this.date = date;
        this.status = status;
        this.error = error;
        this.mensagem = message;
        this.path = path;
    }

    public long getDate() {
        return this.date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}