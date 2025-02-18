package com.matheusrezende.dsa.vetor.vetor;

import com.matheusrezende.dsa.vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println(vetor);
    }
}
