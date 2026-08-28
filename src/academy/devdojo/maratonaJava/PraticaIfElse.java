package academy.devdojo.maratonaJava;

public class PraticaIfElse {
    static void main(String[] args) {

        int mediaAluno =10;

        if (mediaAluno >= 6) {
            System.out.println("Aprovado");
        } else if (mediaAluno < 6 && mediaAluno >= 3) {
            System.out.println("Recuperação");
        } else{
            System.out.println("Reprovado");
        }
    }
}


