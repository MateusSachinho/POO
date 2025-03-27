package ACs;

import javax.swing.*;

public class Intervalo_pares {
    public static void main(String[] args) {
        String aStr = JOptionPane.showInputDialog("Digite o primeiro número inteiro (a):");
        int a = Integer.parseInt(aStr);

        String bStr = JOptionPane.showInputDialog("Digite o segundo número inteiro (b):");
        int b = Integer.parseInt(bStr);

        int soma = 0;
        int contagem = 0;

        int inicio = Math.min(a, b);
        int fim = Math.max(a, b);

        StringBuilder pares = new StringBuilder("Números pares no intervalo: ");
        for (int i = inicio; i <= fim; i++) {

            if (i % 2 == 0) {
                pares.append(i).append(" ");
            }

            soma += i;
            contagem++;
        }

        double media = (double) soma / contagem;

        JOptionPane.showMessageDialog(null, pares +
                "\nSoma dos números no intervalo: " + soma +
                "\nMédia dos números no intervalo: " + media);
    }
}