package com.example.cadastro.dominio;

public class Formulario {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private boolean listaEmails;
    private String sexo;
    private String cidade;
    private String UF;

    public Formulario(String nomeCompleto, String telefone, String email, boolean listaEmails, String sexo, String cidade, String UF) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.listaEmails = listaEmails;
        this.sexo = sexo;
        this.cidade = cidade;
        this.UF = UF;
    }
}
