package com.matheusrezende.dsa.vetor.listaRev;

public class RevTest {

    public static void main(String[] args) {
        ListaSimplesRev lista = new ListaSimplesRev();

        lista.adicionalNoFinal(12);
        lista.adicionalNoFinal(15);

        System.out.println(lista);
    }
}
