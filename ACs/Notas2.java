package ACs;

import javax.swing.*;

public class Notas2 {
    public static void main(String[] args) {
        int quantidadeAlunos = 0;
        double somaNotas = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;

        while (true) {
            String notaStr = JOptionPane.showInputDialog("Digite a nota do aluno (ou -1 para encerrar):");
            double nota = Double.parseDouble(notaStr.replace(",", "."));

            if (nota == -1) {
                break;
            }

            somaNotas += nota;
            quantidadeAlunos++;

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        double media = (quantidadeAlunos > 0) ? (somaNotas / quantidadeAlunos) : 0;

        JOptionPane.showMessageDialog(null,
                "Quantidade de alunos: " + quantidadeAlunos +
                        "\nMédia da turma: " + media +
                        "\nMaior nota: " + maiorNota +
                        "\nMenor nota: " + menorNota);
    }
}