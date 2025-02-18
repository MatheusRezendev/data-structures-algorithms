package com.matheusrezende.dsa.vetor.vetorObject;

public class Aula10 {
    public static void main(String[] args) {
        VetorObject vetorObject = new VetorObject(3);

        Contato c1 = new Contato("Matheus", "965869369", "email@gmail.com");
        Contato c2 = new Contato("Joao", "1231241234", "email@gmail.com");
        Contato c3 = new Contato("Pedro", "1234345123", "email@gmail.com");

        vetorObject.adiciona(c1);
        vetorObject.adiciona(c2);
        vetorObject.adiciona(c3);

        System.out.println("Vetor: " + vetorObject.getTamanho());

        int pos = vetorObject.busca(c3);
        if(pos > -1){
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento nao existe no vetor");
        }

        System.out.println(vetorObject);
    }
}
