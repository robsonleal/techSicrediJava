package Dia01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("##############################################################");
        System.out.println("############# Exercício de exploração de string ##############");
        System.out.println("### Ex04 - Receba duas ou mais palavras e imprimir na tela ###");
        System.out.println("##############################################################");

        System.out.print("Digite seu primeiro nome - ");
        String primeiroNome = input.nextLine();

        System.out.print("Digite seu último nome - ");
        String ultimoNome = input.nextLine();

        input.close();

        System.out.println("Olá! " + primeiroNome + " " + ultimoNome);
        System.out.println("Tamanho do primeiro nome - " + primeiroNome.length());
        System.out.println("Os nomes são iguais? " + primeiroNome.equals(ultimoNome));
        System.out.println("Último nome maiúsculo " + ultimoNome.toUpperCase());

        System.out.println("###################### FIM DO EXERCÍCIO ######################");
    }
}
