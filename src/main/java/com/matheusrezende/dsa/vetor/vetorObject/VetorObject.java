package com.matheusrezende.dsa.vetor.vetorObject;

public class VetorObject {
    private Object[] elementos;
    private int tamanho;

    public VetorObject(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, Object elemento) {
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida!");
        }
        //move todos elementos
        for(int i = this.tamanho - 1; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] newElementos = new Object[this.elementos.length * 2];
            for (int i =0; i<this.elementos.length; i++){
                newElementos[i] = this.elementos[i];
            }
            this.elementos = newElementos;
        }
    }

    public Object busca(int posicao){
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[posicao];
    }

    public void remover(int posicao){
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao invalida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    public int busca(Object elemento){
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(",");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}
