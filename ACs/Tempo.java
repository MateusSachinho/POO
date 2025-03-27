package ACs;

import javax.swing.*;

public class Tempo {
    public static void main(String[] args) {

        String tempo_dado = JOptionPane.showInputDialog("digite os segundos");
        int segunos = Integer.parseInt(tempo_dado);
        System.out.println(segunos + " segundos");

        int min = segunos/60 ;
        System.out.println(min + " minutos");

        int horas = min/60;
        System.out.println(horas + " horas");

    }
}
