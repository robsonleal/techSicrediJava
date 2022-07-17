package Dia02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("####################################################################");
        System.out.println("## Programa que mostra se uma letra digitada é vogal ou consoante ##");
        System.out.println("####################################################################");

        System.out.println("Digite uma letra - ");
        char letra = input.next().toUpperCase().charAt(0);

        if (letra == 'A' ||
            letra == 'E' ||
            letra == 'I' ||
            letra == 'O' ||
            letra == 'U'
        )
            System.out.println("VOGAL");
        else
            System.out.println("CONSOANTE");

        System.out.println("######################### FIM DO PROGRAMA ##########################");
    }
}
