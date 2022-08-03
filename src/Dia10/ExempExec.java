package Dia10;

import javax.swing.*;

public class ExempExec {
    public static void main(String[] args) {
        int quantidade;
        String s = JOptionPane.showInputDialog("Digite um valor inteiro:");

        try {
            quantidade = Integer.parseInt(s);
            System.out.println(quantidade);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro de conversão");
        }

        System.out.println("Fim do programa!");
    }
}
