package Dia02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Programa que exibe um dia da semana, conforme um número for digitado
        System.out.println("Programa que exibe um dia da semana");
        System.out.print("Insira o número referente ao dia que deseja exibir [1-7] - ");
        int diaDaSemana = input.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA");
                break;
            case 3:
                System.out.println("TERÇA");
                break;
            case 4:
                System.out.println("QUARTA");
                break;
            case 5:
                System.out.println("QUINTA");
                break;
            case 6:
                System.out.println("SEXTA");
                break;
            case 7:
                System.out.println("SÁBADO");
                break;
            default:
                System.out.println("Opção inválida, digite um valor entre 1 e 7");
        }
    }
}
