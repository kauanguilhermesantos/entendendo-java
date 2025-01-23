// Escreva um programa que verifique se um número fixo é par ou ímpar.

package exercicios;

public class ImparOuPar {
    public static void main (String[] args) {
        int numero = 3;

        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }
    }
}
