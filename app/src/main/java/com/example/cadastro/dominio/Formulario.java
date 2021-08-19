package com.example.cadastro.dominio;

public class Formulario {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private boolean listaEmails;
    private String sexo;
    private String cidade;
    private String UF;

    public Formulario(){}

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isListaEmails() {
        return listaEmails;
    }

    public void setListaEmails(boolean listaEmails) {
        this.listaEmails = listaEmails;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    @Override
    public String toString() {
        return "Formulario:\n" +
                "Nome Completo='" + nomeCompleto + "'\n" +
                "Telefone='" + telefone + "'\n" +
                "E-mail='" + email + "'\n" +
                "ListaEmails=" + listaEmails + "\n" +
                "Sexo='" + sexo + "'\n" +
                "Cidade='" + cidade + "'\n" +
                "UF='" + UF + '\'';
    }
}
