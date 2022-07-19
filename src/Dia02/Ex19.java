package Dia02;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        System.out.println("Programa que informa a quantidade de centenas, dezenas e unidades de um número inteiro");

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número inteiro [1-999] - ");
        int numero = input.nextInt();

        if (numero > 0 && numero < 1000) {
            int unidades = numero % 10;
            int dezenas = (numero % 100 - unidades) / 10;
            int centenas = (numero % 1000 - dezenas - unidades) / 100;

            System.out.print(numero + " = ");
            System.out.printf(centenas==1?" %d centena":" %d centenas", centenas);
            System.out.printf(dezenas==1?", %d dezena":", %d dezenas", dezenas);
            System.out.printf(unidades==1?" e %d unidade":" e %d unidades", unidades);
//            System.out.printf("Dezenas = " + dezenas);
//            System.out.printf("Unidades = " + unidades);
        }
    }
}
