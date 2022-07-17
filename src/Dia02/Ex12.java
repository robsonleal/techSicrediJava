package Dia02;

import java.util.Scanner;

public class Ex12 {
    //Programa que calcula o valor do salário líquido de um funcionário
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora de pagamento de funcionários: ");

        System.out.print("Digite o valor da sua hora - R$ ");
        double valorHora = input.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas - ");
        int quantidadeHoras = input.nextInt();

        double salarioBruto = valorHora * quantidadeHoras;
        double descontoImpostoRenda = 0;

        if (salarioBruto > 2500)
            descontoImpostoRenda = salarioBruto * 0.2;
        else if (salarioBruto > 1500)
            descontoImpostoRenda = salarioBruto * 0.15;
        else if (salarioBruto > 900)
            descontoImpostoRenda = salarioBruto * 0.05;

        double descontoINSS = salarioBruto * 0.1;
        double valorFGTS = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - (descontoINSS + descontoImpostoRenda);

        System.out.println("Calculando contracheque...");
        System.out.printf("Salário bruto\t\t: R$ %.2f%n", salarioBruto);
        System.out.printf("(-) IR\t\t\t\t: R$ %.2f%n", descontoImpostoRenda);
        System.out.printf("(-) INSS\t\t\t: R$ %.2f%n", descontoINSS);
        System.out.printf("FGTS\t\t\t\t: R$ %.2f%n%n", valorFGTS);
        System.out.printf("Total descontos\t\t: R$ %.2f%n%n", descontoINSS + descontoImpostoRenda);
        System.out.printf("Salário líquido\t\t: R$ %.2f%n", salarioLiquido);
    }
}
