package academy.devdojo.maratonaJava;

public class Aula07Arrays02 {
    static void main(String[] args) {
        //byte, int, short, long, float, e double 0
        //char '\u0000' '  '
        //boolean false
        // String null

        String[]nome = new String[5];
        nome[0]= "Joel Miller";
        nome[1] = "Nathan Drake";
        nome[2] = "John Marston";
        nome[3] = "Leon S. Kennedy";

        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);

        }


    }
}
