package com.matheusrezende.dsa.vetor.fila;

public class FilaExercicio{
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidadeMaxima;
    private Usuario[] fila;

    public boolean estaCheia(){
        return tamanho == capacidadeMaxima;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public void inserir(Usuario usuario){
        if(estaCheia()){
            System.out.println("A fila esta CHEIA");
        }


        fila[fim] = usuario;
        tamanho++;
        fim++;
    }

    public void remover(){
        if (estaVazia()){
            System.out.println("A fila esta VAZIA!");
        }

        System.out.println("Elemento " + fila[inicio] + " removido");


    }

    public static void main(String[] args) {
        FilaExercicio fila = new FilaExercicio();


    }
}
