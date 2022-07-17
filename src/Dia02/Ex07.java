package Dia02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("####################################################################");
        System.out.println("## Programa que recebe três valores e mostra em ordem decrescente ##");
        System.out.println("####################################################################");

        System.out.print("Digite o primeiro número - ");
        int valor1 = input.nextInt();
        System.out.print("Digite o segundo número - ");
        int valor2 = input.nextInt();
        System.out.print("Digite o terceiro número - ");
        int valor3 = input.nextInt();

        int maior, menor, medio;

        // descobrindo o valor médio
        if (valor1 < valor2 && valor1 > valor3 || valor1 > valor2 && valor1 < valor3)
            medio = valor1;
        else if (valor2 < valor1 && valor2 > valor3 || valor2 > valor1 && valor2 < valor3)
            medio = valor2;
        else
            medio = valor3;

       // descobrindo o maior número
        if (valor1 > valor2 && valor1 > valor3)
            maior = valor1;
        else if (valor2 > valor1 && valor2 > valor3)
            maior = valor2;
        else
            maior = valor3;

        // descobrindo o menor número
        if (valor1 < valor2 && valor1 < valor3)
            menor = valor1;
        else if (valor2 < valor1 && valor2 < valor3)
            menor = valor2;
        else
            menor = valor3;

        System.out.printf("A ordem decrescente dos número digitados: %d, %d e %d.", maior, medio, menor);
        System.out.println("######################### FIM DO PROGRAMA ##########################");
    }
}
