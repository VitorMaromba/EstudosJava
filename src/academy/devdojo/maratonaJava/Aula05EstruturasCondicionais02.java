package academy.devdojo.maratonaJava;

public class Aula05EstruturasCondicionais02 {
    static void main(String[] args) {
       // Categoria de idades
        //idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 17;
        String categoria;
        if (idade < 15){
            categoria ="infantil";
        } else if (idade >=15 && idade < 18) {
             categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);


    }
}
