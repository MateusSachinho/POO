package ACs;

import javax.swing.*;

public class Notas {
    public static void main(String[] args) {
        String nStr = JOptionPane.showInputDialog("Digite o número de alunos:");
        int n = Integer.parseInt(nStr);

        double somaNotas = 0;

        for (int i = 0; i < n; i++) {
            String notaStr = JOptionPane.showInputDialog("Digite a nota do aluno " + (i + 1) + ":");
            double nota = Double.parseDouble(notaStr.replace(",", "."));
            somaNotas += nota;
        }

        double media = somaNotas / n;

        JOptionPane.showMessageDialog(null, "Média da turma: " + media);
    }
}