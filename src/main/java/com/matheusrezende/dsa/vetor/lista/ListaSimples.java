package com.matheusrezende.dsa.vetor.lista;

public class ListaSimples<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adiciona(T elemento){
        No<T> celula = new No<>(elemento); // celula = um Novo No
        this.inicio = celula;              // inicio aponta para o novo no
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionaFinal(T elemento){
        No<T> celula = new No<>(elemento);  //cria um novo no recebendo um elemento
        if(this.tamanho == 0){              //verifica se a lista esta vazia
            this.inicio = celula;           //caso sim, o primeiro no passa a ser esse novo no
        } else {
            this.ultimo.setProximo(celula); //caso nao, o ultimo no aponta para o novo no
        }
        this.ultimo = celula;               //atualiza a ref do ultimo no
        this.tamanho++;                     //incrementa tamanho da lista
    }



    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        //[1,2,3,4]

        if(this.tamanho == 0){
            return "[]";
        }

        final StringBuilder sb = new StringBuilder();

        No<T> atual = this.inicio;
        sb.append("[");
         sb.append(atual.getElemento()).append(",");
        while(atual.getProximo() != null){
            atual = atual.getProximo();
            sb.append(atual.getElemento()).append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
