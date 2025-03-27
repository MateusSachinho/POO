package ACs;

import javax.swing.*;

public class Par_ou_impar {
    public static void main(String[] args) {

        String n = JOptionPane.showInputDialog("digite o valor de n");

        int n2 = Integer.parseInt(n);

        int poi = n2%2;

        if (poi == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é ímpar");
        };

    }
}
