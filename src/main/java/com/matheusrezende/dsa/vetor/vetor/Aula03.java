package com.matheusrezende.dsa.vetor.vetor;

import com.matheusrezende.dsa.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(2);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
