package academy.devdojo.maratonaJava;
// Operador ternario
public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        // Doar se salario for maior que 5000
        double salario= 6000;
        // (condição) ? Verdadeiro: Falso
        String mensagemDoar = "Eu vou doar 500 pila pro Dev Dojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println( resultado);
    }
}
