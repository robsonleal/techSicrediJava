package Dia09.ExPropostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tamagushi tamagushi = new Tamagushi("Robson");

        int opcaoMenu;

        do {
            opcaoMenu = menu();

            switch (opcaoMenu) {
                case 0:
                    System.out.println("Finalizando programa");
                    break;
                case 1:
                    tamagushi.alimentar();
                    break;
                case 2:
                    tamagushi.brincar();
                    break;
                case 3:
                    System.out.println(tamagushi);
                    break;
            }
        } while(opcaoMenu != 0);


    }

    public static int menu() {
        int opcao;

        do {
            Scanner input = new Scanner(System.in);

            System.out.println("######################################");
            System.out.println("############# 0 - Sair ###############");
            System.out.println("########### 1 - Alimentar ############");
            System.out.println("############ 2 - Brincar #############");
            System.out.println("### 3 - Consultar fome/saúde/humor ###");
            System.out.println("######################################");

            System.out.print("Escolha uma opção - ");
            opcao = input.nextInt();

        } while (opcao < 0 || opcao > 3);

        return opcao;
    }
}
