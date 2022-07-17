package Dia02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("#####################################");
        System.out.println("## Programa de aumento de salários ##");
        System.out.println("#####################################");

        System.out.print("Digite o salário do colaborador - ");
        double salario, aumento, salarioAjustado;
        int ajuste;
        salario = input.nextDouble();

        if (salario <= 280) {
            ajuste = 20;
            aumento = salario * (ajuste / 100.);
            salarioAjustado = salario + aumento;
        }
        else if (salario <= 700) {
            ajuste = 15;
            aumento = salario * (ajuste / 100.);
            salarioAjustado = salario + aumento;
        }
        else if (salario <= 1500) {
            ajuste = 10;
            aumento = salario * (ajuste / 100.);
            salarioAjustado = salario + aumento;
        }
        else {
            ajuste = 5;
            aumento = salario * (ajuste / 100.);
            salarioAjustado = salario + aumento;
        }

        System.out.printf("O salário do colaborador é de R$ %.2f%n", salario);
        System.out.printf("O percentual de aumento aplicado foi de %d%n", ajuste);
        System.out.printf("O valor do aumento foi de R$ %.2f%n", aumento);
        System.out.printf("O novo salário do colaborador é de R$ %.2f%n", salarioAjustado);
    }
}
