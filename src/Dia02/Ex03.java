package Dia02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("##############################################################");
        System.out.println("## Programa que verifica um valor digitado e exibe em texto ##");
        System.out.println("##############################################################");

        System.out.print("Digite \"M\" ou \"F\" - ");
        String letra = input.nextLine();
        if (letra.equalsIgnoreCase("F"))
            System.out.println("F - Feminino");
        else if (letra.equalsIgnoreCase("M"))
            System.out.println("M - Masculino");
        else
            System.out.println("Opção inválida!");

        System.out.println("###################### FIM DO PROGRAMA #######################");
    }
}
