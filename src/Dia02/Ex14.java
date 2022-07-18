package Dia02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        //Programa que calcula a média de um aluno 2.0
        Scanner input = new Scanner(System.in);

        System.out.println("## Calculando a média de um aluno e mostrando seu conceito ##");
        System.out.print("Digite sua nota na primeira avaliação - ");
        double nota1 = input.nextDouble();

        System.out.print("Digite sua nota na segunda avaliação - ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10)
            System.out.printf("Você está APROVADO, sua nota é %.2f - A", media);
        else if (media >= 7.5 && media < 9)
            System.out.printf("Você está APROVADO, sua nota é %.2f - B", media);
        else if (media >= 6 && media < 7.5)
            System.out.printf("Você está APROVADO, sua nota é %.2f - C", media);
        else if(media >= 4 && media < 6)
            System.out.printf("Você está REPROVADO, sua nota é %.2f - D", media);
        else if(media >= 0 && media < 4)
            System.out.printf("Você está REPROVADO, sua nota é %.2f - E", media);
        else
            System.out.println("Nota inválida, verifique as notas inseridas, os valores devem estar entre 0 e 10");
    }
}
