package Dia02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        // Informar se um ano inserido é bissexto
        Scanner input = new Scanner(System.in);

        System.out.println("Programa que informa se um ano inserido é bissexto");

        System.out.print("Digite um ano - ");
        int ano = input.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)
            System.out.println("O ano é bissexto!");
        else
            System.out.println("Não é bissexto!");
    }
}
