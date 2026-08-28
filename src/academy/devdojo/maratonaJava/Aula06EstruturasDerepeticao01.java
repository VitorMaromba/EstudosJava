package academy.devdojo.maratonaJava;

public class Aula06EstruturasDerepeticao01 {
    static void main(String[] args) {
        //While, do While e for: Estruturas de repetição

        int count = 0;
        while (count <=10){
            System.out.println(count);
            count = count + 1;
        }
        count =0;
        do {

            System.out.println("Dentro do do-while "+ ++count);
        }while (count < 10);

        for (count=0; count < 10; count++){
            System.out.println(count);
        }
    }
}
