package Dia02;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        System.out.println("Programa para calcular a média de um aluno 3.0");

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a primeira nota - ");
        double nota1 = input.nextDouble();

        System.out.print("Insira a segunda nota - ");
        double nota2 = input.nextDouble();

        System.out.print("Insira a terceira nota - ");
        double nota3 = input.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média final é %.2f - ", media);
        if (media == 10)
            System.out.println("APROVADO com distinção");
        else if (media < 10 && media >= 7)
            System.out.println("APROVADO");
        else if (media < 7 && media >= 0)
            System.out.println("REPROVADO");
        else
            System.out.println("Média inválida, verifique as notas inseridas.");
    }
}
