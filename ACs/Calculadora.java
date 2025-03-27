package ACs;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        double num1 = 2;
        double num2 = 2;
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));

        double num3, num4;

        Scanner teclado = new Scanner(System.in);

        System.out.println("num3");
        num3 = teclado.nextDouble();
        System.out.println("num4");
        num4 = teclado.nextInt();

        System.out.println("Soma: " + (num3 + num4));
        System.out.println("Subtração: " + (num3 - num4));
        System.out.println("Multiplicação: " + (num3 * num4));
        System.out.println("Divisão: " + (num3 / num4));

    }
}
