package com.matheusrezende.dsa.vetor.listaRev;

import com.matheusrezende.dsa.vetor.lista.No;

public class No1<T> {
    private T dado;
    private No1<T> proximo;

    public No1(T dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public No1(T dado, No<T> proximo) {
        this.dado = dado;
        this.proximo = null;
    }

    public T getDado() {
        return dado;
    }

    public No1<T> getProximo() {
        return proximo;
    }

    public void setProximo(No1<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("No1{");
        sb.append("dado=").append(dado);
        sb.append(", proximo=").append(proximo);
        sb.append('}');
        return sb.toString();
    }
}
