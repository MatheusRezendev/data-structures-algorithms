package com.matheusrezende.dsa.vetor.lista;

public class ListaSimplesTest {

    public static void main(String[] args) {
        ListaSimples<Integer> lista = new ListaSimples<>();
        lista.adiciona(1);
        lista.adicionaFinal(2);
        lista.adicionaFinal(3);

        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println(lista);
    }
}
