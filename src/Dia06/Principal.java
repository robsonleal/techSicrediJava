package Dia06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Porquinho porco = new Porquinho();

        menu();

        int opcao = -1;
        while(opcao != 0) {
            System.out.print("Digite a opção desejada - ");
            opcao = input.nextInt();

            if (opcao != 0){
                switch (opcao) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        porco.depositar(opcao);
                        break;
                    case 6:
                        System.out.println("Seu saldo é de R$ " + porco.getSaldo());
                        break;
                    case 7:
                        porco.quebrar();
                        break;
                }
                menu();
            }
        }
        System.out.println("FIM DO PROGRAMA!");
    }

    public static void menu() {
        System.out.println("###########################");
        System.out.println("###### MEU COFRINHO #######");
        System.out.println("## 0 - FINALIZAR PROGRAMA #");
        System.out.println("## 1 - DEPOSITAR R$ 0,05 ##");
        System.out.println("## 2 - DEPOSITAR R$ 0,10 ##");
        System.out.println("## 3 - DEPOSITAR R$ 0,25 ##");
        System.out.println("## 4 - DEPOSITAR R$ 0,50 ##");
        System.out.println("## 5 - DEPOSITAR R$ 1,00 ##");
        System.out.println("## 5 - DEPOSITAR R$ 1,00 ##");
        System.out.println("## 6 - CONSULTAR SALDO ####");
        System.out.println("## 7 - QUEBRAR COFRINHO ###");
        System.out.println("###########################");
    }
}
