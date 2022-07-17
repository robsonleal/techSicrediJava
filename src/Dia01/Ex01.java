package Dia01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("##############################################################");
        System.out.println("######## Exercício de manipulação de tipos primitivos ########");
        System.out.println("## Ex01 - Imprimir valores recebidos por leitura do teclado ##");
        System.out.println("##############################################################");

        System.out.print("Digite o seu nome - ");
        String nome = input.nextLine();

        System.out.print("Digite a sua idade - ");
        int idade = input.nextInt();

        System.out.print("Digite o seu peso - ");
        double peso = input.nextDouble();

        System.out.print("Possui filhos? - ");
        boolean filhos = input.nextBoolean();

        System.out.printf("Seja bem vindo %s de %d anos e %.1f Kg. Possui filhos? %b.%n", nome, idade, peso, filhos);
        System.out.println("###################### FIM DO EXERCÍCIO ######################");
    }
}
