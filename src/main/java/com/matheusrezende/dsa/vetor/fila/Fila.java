package com.matheusrezende.dsa.vetor.fila;

public class Fila {
    private int inicio;
    private int fim;
    private int tamanho;
    private int capacidadeMaxima;
    private int [] fila;

    public Fila(int capacidadeMaxima) {
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
        this.capacidadeMaxima = capacidadeMaxima;
        this.fila = new int[capacidadeMaxima];
    }

    public void inserir(int valor){
        if (estaCheia()){
            System.out.println("A fila esta CHEIA!");
            return;
        }

        fila[fim] = valor;
        tamanho++;
        fim++;

        System.out.println("Elemento " + valor + " inserido na fila");
    }

    public void remover(){
        if(estaVazia()){
            System.out.println("A fila esta VAZIA!");
        }

        System.out.println("Elemento " + fila[inicio] + " removido!");

        inicio++;
        tamanho--;
    }

    public void imprimir(){
        if(estaVazia()){
            System.out.println("A fila esta VAZIA!");
        } else {

            System.out.println("Elementos na fila: ");
            for (int i = inicio; i < fim; i++) {
                System.out.println(fila[i] + "");
            }
        }
        System.out.println();
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public boolean estaCheia(){
        return tamanho == capacidadeMaxima;
    }

    public static void main(String[] args) {
        Fila f = new Fila(5);

        f.inserir(10);
        f.inserir(20);
        f.inserir(30);
        f.inserir(40);
        f.inserir(50);
        f.inserir(60);

        f.imprimir();

        f.remover();
        f.remover();

        f.imprimir();

        f.remover();
        f.remover();
        f.remover();

        f.imprimir();
    }
}
