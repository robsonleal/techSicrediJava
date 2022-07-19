package Dia02;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        System.out.println("Programa que verifica se uma data informada é valida");
        System.out.println("Insira uma data no formato DD/MM/AAAA");

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um valor para o dia - ");
        int dia = input.nextInt();

        System.out.println("Insira um valor para o mês - ");
        int mes = input.nextInt();

        System.out.println("Insira um valor para o ano - ");
        int ano = input.nextInt();

        if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0 && ano <= 2100) {
            System.out.println("Data válida!");
        }
    }
}
