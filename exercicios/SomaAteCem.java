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

