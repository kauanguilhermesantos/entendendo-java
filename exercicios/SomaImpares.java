// Escreva um programa que calcule a soma de todos os números ímpares de 1 a 50 utilizando a estrutura de repetição while.

package exercicios;

public class SomaImpares {
    public static void main (String[] args) {
        int somaImpares = 0;

        int i = 1;
        while (i <= 50) {
            if (i % 2 != 0) {
                somaImpares += i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Soma do números ímpares: " + somaImpares);
    }
}
