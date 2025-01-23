// Escreva um programa que classifique a temperatura em três categorias: Frio (menos de 10°C), Agradável (entre 10°C e 25°C), e Quente (acima de 25°C). A temperatura será um valor fixo.

package exercicios;

public class Temperatura {
    public static void main (String[] args) {
        float temp = 250;

        if (temp < 10) {
            System.out.println("Frio");
        } else if (temp <=25) {
            System.out.println("Agradável");
        } else {
            System.out.println("Quente");
        }
    }
}
