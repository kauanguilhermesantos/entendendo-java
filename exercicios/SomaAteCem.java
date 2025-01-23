// Escreva um programa que calcule a soma de todos os números de 1 a 100
package exercicios;

public class SomaAteCem {
    public static void main (String[] args) {
        int soma = 0;

        for (int a = 0; a <= 100; a++) {
            soma += a;
        }

        System.out.println("Soma: " + soma);
    }
}

