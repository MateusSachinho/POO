package ACs;

import javax.swing.*;

public class Intervalo {
    public static void main(String[] args) {

        String n = JOptionPane.showInputDialog("digite o valor de n:");
        int n_int = Integer.parseInt(n);

        String valor_inferior = JOptionPane.showInputDialog("digite o valor inferior do intervalo:");
        int valor_inferior_int = Integer.parseInt(valor_inferior);

        String valor_superior = JOptionPane.showInputDialog("digite o valor superior do intervalo:");
        int valor_superior_int = Integer.parseInt(valor_superior);

        if (n_int < valor_inferior_int) {
            System.out.println("n está antes do intervalo.");
        } else if (n_int > valor_superior_int) {
            System.out.println("n está depois do intervalo.");
        } else {
            System.out.println("n está dentro do intervalo.");
        }
    }
}



