package Dia02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Programa para auxiliar na compra do produto mais barato!");
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor do produto 01 - R$ ");
        double produto1 = input.nextDouble();

        System.out.print("Insira o valor do produto 02 - R$ ");
        double produto2 = input.nextDouble();

        System.out.print("Insira o valor do produto 03 - R$ ");
        double produto3 = input.nextDouble();

        String maisBarato;

        if (produto1 < produto2 && produto1 < produto3)
            maisBarato = "produto 01";
        else if (produto2 < produto1 && produto2 < produto3)
            maisBarato = "produto 02";
        else
            maisBarato = "produto 03";

        System.out.println("Você deve comprar o " + maisBarato);
    }
}
