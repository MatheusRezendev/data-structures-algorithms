package com.matheusrezende.dsa.vetor.listaRev;

public class ListaSimplesRev<T> {
    private No1<T> primeiro;
    private No1<T> ultimo;
    int tamanho;

    public void adicionar(T dado){
        No1 novoNo = new No1<>(dado);
        this.primeiro = novoNo;
    }

    public void adicionalNoFinal(T dado){
        No1 novoNo = new No1<>(dado);
        if(tamanho == 0){                   //se tamanho igual a zero
             this.primeiro = novoNo;        //novo no e o primeiro dado da lista
        } else {
            this.ultimo.setProximo(novoNo);     //se nao setamos o ultimo como novo no
        }
        this.ultimo = novoNo;
        this.tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaSimplesRev{");
        sb.append("primeiro=").append(primeiro);
        sb.append('}');
        return sb.toString();
    }
}
