package Dia02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("## Qual o turno você estuda? ##");
        System.out.println("######### M - MATUTINO ########");
        System.out.println("######## V - VESPERTINO #######");
        System.out.println("########## N - NOTURNO ########");

        System.out.print("Digite o valor desejado - ");
        char turno = input.nextLine().toUpperCase().charAt(0);

        if (turno == 'M')
            System.out.println("Bom dia!");

        if (turno == 'V')
            System.out.println("Boa tarde!");

        if (turno == 'N')
            System.out.println("Boa noite!");
    }
}
