package Dia01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("##############################################################");
            System.out.println("########### Exercício de exploração de bibliotecas ###########");
            System.out.println("###### Ex02 - Conversão de tipos de dados e uso do Math ######");
            System.out.println("##############################################################");

            System.out.print("Digite um número inteiro - ");

        int numeroInteger = input.nextInt();
            System.out.println(numeroInteger + " " + ((Object)numeroInteger).getClass().getSimpleName());

        System.out.println((double) numeroInteger + " " +((Object) (double) numeroInteger).getClass().getSimpleName());

        String numeroString = Integer.toString(numeroInteger);
            System.out.println(numeroString + " " + numeroString.getClass().getSimpleName());

            System.out.print("\nDigite um número inteiro - ");
        int valor1 = input.nextInt();

            System.out.print("Digite outro número inteiro - ");
        int valor2 = input.nextInt();

        System.out.println("O maior é - " + Math.max(valor1, valor2));
        System.out.println("O menor é - " + Math.min(valor1, valor2));
        System.out.println("O primeiro elevado ao segundo - " + Math.pow(valor1, valor2));
        System.out.println("Um número pseudoaleatório de 0 a 10 - " + Math.round(Math.random() * 10));
        System.out.println("###################### FIM DO EXERCÍCIO ######################");
    }
}
