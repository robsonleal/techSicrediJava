package Dia01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("##############################################################");
        System.out.println("########### Exercício de exploração de operadores ############");
        System.out.println("################## Ex03 - Calculadora Java ###################");
        System.out.println("##############################################################");

        System.out.print("Digite um número - ");
        double numero1 = input.nextDouble();

        System.out.print("Digite outro número - ");
        double numero2 = input.nextDouble();
        input.close();

        System.out.println("A soma entre os número é - " + (numero1 + numero2));
        System.out.println("A subtração entre os número é - " + (numero1 - numero2));
        System.out.println("A multiplicação entre os número é - " + (numero1 * numero2));
        System.out.println("A divisão entre os número é - " + (numero1 / numero2));
        System.out.println("O resto da divisão entre os número é - " + (numero1 % numero2));
        System.out.println("###################### FIM DO EXERCÍCIO ######################");
    }
}
