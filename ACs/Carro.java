package ACs;

import javax.swing.*;

public class Carro {
    public static void main(String[] args) {

        String distancia_s = JOptionPane.showInputDialog("digite a distância");
        int distancia = Integer.parseInt(distancia_s);

        String tempo_s = JOptionPane.showInputDialog("digite o tempo");
        int tempo = Integer.parseInt(tempo_s);

        String gasolina_s = JOptionPane.showInputDialog("digite a gasolina gasta");
        int gasolina = Integer.parseInt(gasolina_s);

        int kmh = distancia/tempo;

        int kml = distancia/gasolina;

        System.out.println(kmh);
        System.out.println(kml);
    }
}
