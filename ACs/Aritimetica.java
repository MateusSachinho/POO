package ACs;

import javax.swing.*;

public class Aritimetica {
    public static void main(String[] args) {
        String operador = JOptionPane.showInputDialog("Digite a operação aritmética (+, -, *, /):").trim();


        String aStr = JOptionPane.showInputDialog("Digite o primeiro número:");
        double a = Double.parseDouble(aStr.replace(",", "."));

        String bStr = JOptionPane.showInputDialog("Digite o segundo número:");
        double b = Double.parseDouble(bStr.replace(",", "."));

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b != 0) {
                    resultado = a / b;
                }
                break;

            }

            JOptionPane.showMessageDialog(null, a + " " + operador + " " + b + " = " + resultado);

    }
}