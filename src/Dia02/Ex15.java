package Dia02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        // Programa que informa se três valores inseridos podem formar um triângulo, se sim, ele informa o tipo
        Scanner input = new Scanner(System.in);

        System.out.println("Informando se os valores podem formar um triângulo");
        System.out.print("Digite o valor da primeira medida - ");
        int valorA = input.nextInt();

        System.out.print("Digite o valor da segunda medida - ");
        int valorB = input.nextInt();

        System.out.print("Digite o valor da terceira medida - ");
        int valorC = input.nextInt();

        if (valorA + valorB > valorC && valorA + valorC > valorB) {
            System.out.print("É um triângulo ");

            if (valorA == valorB && valorA == valorC)
                System.out.println("equilátero!");
            else if (valorA == valorB || valorA == valorC)
                System.out.println("isósceles!");
            else
                System.out.println("escaleno!");

        } else
            System.out.println("Não é um triângulo");
    }
}
