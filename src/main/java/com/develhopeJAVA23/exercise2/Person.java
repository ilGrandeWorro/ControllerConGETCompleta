package com.develhopeJAVA23.exercise2;

public class Person {
    private String nome;
    private String provincia;
    private String saluto;

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }

    public String getSaluto() {
        return saluto;
    }

    public String getNome() {
        return nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Person(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}
