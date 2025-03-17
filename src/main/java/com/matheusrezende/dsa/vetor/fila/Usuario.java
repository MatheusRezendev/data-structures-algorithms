package com.matheusrezende.dsa.vetor.fila;

public class Usuario {
    private int id;
    private String nome;
    private int idade;
    private String email;

    public Usuario(int id, String nome, int idade, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usuario{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", idade=").append(idade);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
