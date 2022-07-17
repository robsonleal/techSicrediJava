package Dia02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("###############################################################");
        System.out.println("## Faça um programa fala se um número é positivo ou negativo ##");
        System.out.println("###############################################################");

        System.out.print("Digite um número - ");
        int numeroDigitado = input.nextInt();

        if (numeroDigitado > 0)
            System.out.println("POSITIVO");
        else if (numeroDigitado < 0)
            System.out.println("NEGATIVO");
        else
            System.out.println("NEUTRO");

        System.out.println("####################### FIM DO PROGRAMA #######################");
    }
}
