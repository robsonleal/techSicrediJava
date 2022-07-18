package Dia02;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        //Programa para calcular uma equação do 2º grau
        System.out.println("Programa que calcula uma equação do 2º grau");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A - ");
        double valorA = input.nextDouble();

        System.out.print("Digite um valor para B - ");
        double valorB = input.nextDouble();

        System.out.print("Digite um valor para C - ");
        double valorC = input.nextDouble();

        if (valorA == 0)
            System.out.println("Não se trata de uma equação do 2º grau!");

        else {
            double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;

            if (delta < 0)
                System.out.println("A equação não possui raízes reais.");

            else {
                double raiz1 = (-valorB + delta) / (2 * valorA);
                double raiz2 = (-valorB - delta) / (2 * valorA);

                if (delta == 0)
                    System.out.printf("A equação possui 1 raiz real%nX¹ = %.2f", raiz1);
                else
                    System.out.printf("A equação possui 2 raízes reais%nX¹ = %.2f%nX² = %.2f", raiz1, raiz2);
            }
        }
    }
}
