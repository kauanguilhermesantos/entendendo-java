// Escreva um programa que verifique se um ano fixo é bissexto. Um ano é bissexto se for divisível por 4, mas não por 100, a menos que seja divisível por 400.

package exercicios;

public class Bissexto {
    public static void main (String[] args) {
        int ano = 2001;

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println(ano + " é ano bissexto!");
        } else {
            System.out.println(ano + " não é ano bissexto!");
        }
    }
}
