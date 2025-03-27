package ACs;

import javax.swing.*;
public class Kilowatts {
    public static void main(String[] args) {

        String kilowatts = JOptionPane.showInputDialog("Digite a quantidade de kilowatts consumidos:");
        float kilowatts_float = Float.parseFloat(kilowatts);

        String valor_kilowatts = JOptionPane.showInputDialog("Digite o valor de cada kilowatt (em Reais):");
        float valor_kilowatts_float = Float.parseFloat(valor_kilowatts);

        float valorTotal = kilowatts_float * valor_kilowatts_float;

        if (kilowatts_float < 150) {
            valorTotal *= 0.9F;
        }

        System.out.println("Valor total: R$ " + valorTotal);
    }
}