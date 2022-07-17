package Dia03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("##########################################################################");
        System.out.println("## Mostrando o maior, menor e a média dos número digitados pelo usuário ##");
        System.out.println("##########################################################################");

        int maior, menor, somaNumeros = 0, numeroAtual, quantNum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite \"zero\" para sair ou qualquer outro número inteiro para começar... ");
        numeroAtual = input.nextInt();
        maior = numeroAtual;
        menor = numeroAtual;

        while(numeroAtual != 0) {
            if (numeroAtual > maior) {
                maior = numeroAtual;
            }

            if (numeroAtual < menor) {
                menor = numeroAtual;
            }

            somaNumeros += numeroAtual;
            quantNum++;

            System.out.print("Digite \"zero\" para sair ou qualquer outro número inteiro para continuar... ");
            numeroAtual = input.nextInt();
        }

        System.out.printf("O maior número digitado foi.........%d%n", maior);
        System.out.printf("O menor número digitado foi.........%d%n", menor);
        System.out.printf("A média dos números digitados foi...%.1f%n", (float) somaNumeros / quantNum);
        System.out.println("############ FIM DO PROGRAMA ############");
    }
}
