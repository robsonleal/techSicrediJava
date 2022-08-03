package Dia09.fazenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Fazenda {
    public static void main(String[] args) {
        List<Tamagushi> bichinhos = new ArrayList<>();

        Random rdm = new Random();

        Tamagushi tamagushi1 = new Tamagushi("Rob");
        Tamagushi tamagushi2 = new Tamagushi("Camila");
        Tamagushi tamagushi3 = new Tamagushi("Batman");

        bichinhos.add(tamagushi1);
        bichinhos.add(tamagushi2);
        bichinhos.add(tamagushi3);

        int opcaoMenu;

        do {
            opcaoMenu = menu();

            switch (opcaoMenu) {
                case 0:
                    System.out.println("Finalizando programa");
                    break;
                case 1:
                    for (Tamagushi bichinho : bichinhos)
                        bichinho.alimentar();
                    break;
                case 2:
                    for (Tamagushi bichinho : bichinhos)
                        bichinho.brincar();
                    break;
                case 3:
                    System.out.println(bichinhos);
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
