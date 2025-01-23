// Imprima a seguinte tabela até o numero 7:
// 1
// 2 4
// 3 6 9
// 4 8 12 16
// 5 10 15 20 25
// 6 12 18 24 30 36
// 7 14 21 28 35 42 49

package exercicios;

public class Tabela {
    public static void main (String[] args) {
        for (int i = 1; i <= 7; i++) { // cria as linhas da tabela
            for (int j = i; j <= i*i; j = j + i) { // múltiplo dos primeiros números de cada linha
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
