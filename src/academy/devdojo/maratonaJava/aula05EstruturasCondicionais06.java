package academy.devdojo.maratonaJava;

public class aula05EstruturasCondicionais06 {
    static void main(String[] args) {
        int dia= 10;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opção Invalida");
                break;

        }
    }
}
