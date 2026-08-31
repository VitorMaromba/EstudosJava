package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        System.out.println(estudante.nome);
        estudante.nome = "Jhon Wick";
        estudante.sexo = 'M';
        estudante.idade = 42;

        estudante2.nome = "Jack Reacher";
        estudante2.sexo = 'M';
        estudante2.idade = 38;
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("-----------------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
