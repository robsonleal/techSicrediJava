package Dia02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("#################################################################");
        System.out.println("## Programa que recebe três valores e mostra o maior e o menor ##");
        System.out.println("#################################################################");

        System.out.print("Digite o primeiro número - ");
        int valor1 = input.nextInt();
        System.out.print("Digite o segundo número - ");
        int valor2 = input.nextInt();
        System.out.print("Digite o terceiro número - ");
        int valor3 = input.nextInt();

        int menor, maior;

        //descobrindo o maior número
        if (valor1 > valor2 && valor1 > valor3)
            maior = valor1;
        else if (valor2 > valor1 && valor2 > valor3)
            maior = valor2;
        else
            maior = valor3;

        //descobrindo o menor número
        if (valor1 < valor2 && valor1 < valor3)
            menor = valor1;
        else if (valor2 < valor1 && valor2 < valor3)
            menor = valor2;
        else
            menor = valor3;

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);

        System.out.println("######################## FIM DO PROGRAMA ########################");
    }
}
