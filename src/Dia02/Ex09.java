package Dia02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("## Calculando a nota de um aluno ##");

        System.out.print("Digite a primeira nota do aluno - ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota do aluno - ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10)
            System.out.println("APROVADO COM NOTA MÁXIMA!!!");
        else if (media >= 7)
            System.out.printf("APROVADO! Nota final %.2f%n", media);
        else
            System.out.printf("REPROVADO! Nota final %.2f%n", media);
    }
}
