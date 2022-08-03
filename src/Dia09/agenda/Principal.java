package Dia09.agenda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
            int opcaoMenu = menu();


        } while(true);
    }

    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("############################");
        System.out.println("#### AGENDA TELEFÔNICA #####");
        System.out.println("### 1 - MOSTRAR CONTATOS ###");
        System.out.println("#### 2 - CRIAR CONTATO #####");
        System.out.println("### 3 - DELETAR CONTATO ####");
        System.out.println("## 0 - FINALIZAR PROGRAMA ##");
        System.out.println("############################");
        int opcao = input.nextInt();

        return opcao;
    }
}
