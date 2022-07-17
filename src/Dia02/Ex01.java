package Dia02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("###########################################################");
        System.out.println("## Programa que pede dois números e mostra o maior deles ##");
        System.out.println("###########################################################");

        System.out.print("Digite o primeiro número - ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número - ");
        int numero2 = input.nextInt();

        if (numero1 > numero2)
            System.out.printf("O maior é o primeiro número (%d)", numero1);
        else
            System.out.printf("O maior é o segundo número (%d)", numero2);

        System.out.println("##################### FIM DO PROGRAMA #####################");
    }
}
