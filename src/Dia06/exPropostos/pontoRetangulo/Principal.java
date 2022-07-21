package Dia06.exPropostos.pontoRetangulo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("####################################");
        System.out.print("Digite a base do retângulo - ");
        int base = input.nextInt();

        System.out.print("Digite a altura do retângulo - ");
        int altura = input.nextInt();

        System.out.println("Criando retângulo...");
        Retangulo retangulo1 = new Retangulo(base, altura);

        int opcaoMenu = -1;
        while(opcaoMenu != 0) {
            opcaoMenu = menu();
            switch (opcaoMenu) {
                case 0:
                    break;
                case 1:
                    retangulo1.mudarBase();
                    break;
                case 2:
                    retangulo1.mudarAltura();
                    break;
                case 3:
                    double [] centro = retangulo1.getCentro();
                    System.out.println("Centro está localizado em X = " + centro[0] + ", Y = " + centro[1]);
                    break;
                case 4:
                    System.out.println(retangulo1);
            }
        }
    }

    public static int menu() {
        while(true) {
            Scanner input = new Scanner(System.in);

            System.out.println("####################################");
            System.out.println("####### 0 - Sair do programa #######");
            System.out.println("### 1- Alterar base do retângulo ###");
            System.out.println("## 2- Alterar altura do retângulo ##");
            System.out.println("# 3 - Buscar o centro do retângulo #");
            System.out.println("# 4 - Exibir valores do retângulo ##");
            System.out.println("####################################");

            System.out.print("Digite uma opção - ");
            int opcao = input.nextInt();

            if(opcao >= 0 && opcao <= 4)
                return opcao;
            else
                System.out.println("Opção inválida!");
        }
    }
}
