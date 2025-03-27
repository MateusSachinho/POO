package ACs;

import javax.swing.*;

public class Contagem_caracteres {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite uma sequência de caracteres (terminada com '.'):");

        int vogais = 0;
        int digitos = 0;
        int outros = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);

            if (caractere == '.') {
                break;
            } else if (Character.isDigit(caractere)) {
                digitos++;
            } else if ("aeiouAEIOU".indexOf(caractere) != -1) {
                vogais++;
            } else {
                outros++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Quantidade de vogais: " + vogais +
                        "\nQuantidade de dígitos: " + digitos +
                        "\nQuantidade de demais caracteres: " + outros);
    }
}