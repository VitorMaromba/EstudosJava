package academy.devdojo.maratonaJava;
//Os seguintes operadores aritmeticos sao esses +-/*
public class OperaçõesAritmeticas {
    static void main() {
        int n1 = 1500;
        int n2 = 1550;
        double s = n1/n2;
        System.out.println("A soma de "+n1+"com "+n2+ "é igual a "+s);

        //% Resto
        int resto = 21%6;
        System.out.println(resto);

        // < >, <=, >=, ==, /=
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDeDez "+isDezDiferenteDeDez);

        //Operadores Logicos : And &&, Or ||, !
        int idade = 30;
        float salario = 3500f;
        boolean isDentroDaleiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaleiMenorQueTrinta = idade >= 30 && salario >= 3381;

        System.out.println("isDentroDaleiMaiorQueTrinta "+isDentroDaleiMaiorQueTrinta);
        System.out.println("isDentroDaleiMenorQueTrinta "+isDentroDaleiMenorQueTrinta);

        double valotTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPScinco = 5000f;
        boolean isPScincoCompravel = valotTotalContaCorrente > valorPScinco || valorTotalContaPoupanca > valorPScinco;
        System.out.println("isPScincoCompravel "+isPScincoCompravel);

        // Atribuição/Atrubuir algum valor na sua variavel: =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("Você recebeu um bonus de 1000 reais, agora seu salario é "+bonus);int contador = 0;

        int contado = 0;
        contado += 1; //contador recebe contador mais 1
        contado++;
        System.out.println(contado);
        int contador1 = 2;
        System.out.println(++contador1);


    }


}
