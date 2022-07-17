package Dia02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("#############################################################");
        System.out.println("## Programa que recebe três valores e mostra o maior deles ##");
        System.out.println("#############################################################");

        System.out.print("Digite o primeiro número - ");
        int valor1 = input.nextInt();
        System.out.print("Digite o segundo número - ");
        int valor2 = input.nextInt();
        System.out.print("Digite o terceiro número - ");
        int valor3 = input.nextInt();

        if (valor1 > valor2 && valor1 > valor3)
            System.out.printf("O maior valor foi o primeiro digitado %d", valor1);
        else if (valor2 > valor1 && valor2 > valor3)
            System.out.printf("O maior valor digitado foi o segundo %d", valor2);
        else
            System.out.printf("O maior valor digitado é o terceiro %d", valor3);

        System.out.println("###################### FIM DO PROGRAMA ######################");
    }
}
