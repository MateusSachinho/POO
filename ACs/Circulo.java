package ACs;

import javax.swing.*;
import java.lang.Math;

public class Circulo {
    public static void main(String[] args) {

        String raio = JOptionPane.showInputDialog("digite o raio:");
        float raio_float = Float.parseFloat(raio);

        float R_perimetro = (float) (2 * raio_float * Math.PI);
        float R_area = (float) (Math.PI * Math.pow(raio_float,2));

        System.out.println("Perímetro = " + R_perimetro);
        System.out.println("Área = " + R_area);

    }
}