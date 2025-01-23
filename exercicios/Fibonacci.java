// Escreva um programa que imprima os 10 primeiros números da sequência de Fibonacci.

package exercicios;

public class Fibonacci {
    public static void main (String[] args) {
        int valorAnterior = 1;
        int valorAtual = 1;
    
        // 1 1 2 3 5 8 13 21 34 55...
        for (int i = 0; i < 10; i++) {
            System.out.println(valorAnterior);
            valorAtual = valorAtual + valorAnterior;
            valorAnterior = valorAtual - valorAnterior;
       }
    }
}
