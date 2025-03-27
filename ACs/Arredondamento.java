package ACs;

import javax.swing.*;

public class Arredondamento {
    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog("Digite um número real:");
        double numero_double = Double.parseDouble(numero);

        int parteInteira = (int) numero_double;
        double parteDecimal = numero_double - parteInteira;

        if (parteDecimal < 0.5) {
            System.out.println("Arredondado para menos: " + parteInteira);
        } else {
            System.out.println("Arredondado para mais: " + (parteInteira + 1));
        }
    }
}