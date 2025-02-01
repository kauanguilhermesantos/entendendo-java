// javac jOptionPane/OperacaoJOptionPane.java
// javac jOptionPane.OperacaoJOptionPane

package jOptionPane;

import javax.swing.JOptionPane;

public class OperacaoJOptionPane {
    public static void main(String[] args) {
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite outro número: "));
        String operador = JOptionPane.showInputDialog("Digite um operador: ");

        float resultado = 0;

        switch (operador){
            case "+":
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case "/":
                if(num2 != 0){
                    resultado = num1 / num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                } else{
                    JOptionPane.showMessageDialog(null, "Erro: divisao por zero eh impossível!");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro: Operador invalido!");
                return;
        }
    }
}
