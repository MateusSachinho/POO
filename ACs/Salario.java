package ACs;

import javax.swing.*;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);

        String salario = JOptionPane.showInputDialog("Qual o seu sálario?");
        float salario2 = Float.parseFloat(salario);
        System.out.println(salario2);

        String percentual = JOptionPane.showInputDialog("digite o aumento:");
        float percentual2 = Float.parseFloat(percentual);
        System.out.println(percentual2);


//        System.out.println("");
//        salario = teclado.nextFloat();

//        System.out.println("Qual o percentual de aumento?");
//        percentual = teclado.nextFloat();

        float aumento = salario2 * (percentual2/100);
        float novo_salario = aumento+salario2;
        System.out.println("O aumento é de "+ aumento+", e o novo salário é " + novo_salario);
    }
}


