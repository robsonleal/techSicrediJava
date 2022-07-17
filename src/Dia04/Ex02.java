package Dia04;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de linhas: ");
        int linhas = input.nextInt();

        System.out.print("Informe o número de colunas: ");
        int colunas = input.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Gerando matriz " + linhas +"x" + colunas + "...");
        gerarMatriz(matriz);
        exibirMenu(false);

        System.out.print("Digite uma opção - ");
        int opcao = input.nextInt();

        while(opcao != 0) {
            switch(opcao) {
                case 1:
                    exibirMatriz(matriz);
                    break;
                case 2:
                    System.out.print("Digite a linha que deseja buscar [0-" + (linhas - 1) + "] - ");
                    int linha = input.nextInt();
                    exibirLinhaMatriz(matriz, linha);
                    break;
                case 3:
                    System.out.print("Digite a coluna que deseja buscar [0-" + (colunas - 1) + "] - ");
                    int coluna = input.nextInt();
                    exibirColunaMatriz(matriz, coluna);
                    break;
                case 4:
                    if (linhas==colunas)
                        exibirDiagonalPrincipalMatriz(matriz);
                    else
                        System.out.println("Opção disponível apenas para matrizes quadradas!");
                    break;
                case 5:
                    if (linhas==colunas)
                        exibirDiagonalSecundariaMatriz(matriz);
                    else
                        System.out.println("Opção disponível apenas para matrizes quadradas!");
                    break;
                case 6:
                    if (linhas==colunas) {
                        System.out.print("Digite \"S\" -> SUPERIOR ou \"I\" -> INFERIOR - ");
                        input.nextLine();
                        String opcaoPosicao = input.nextLine().toUpperCase();

                        if (opcaoPosicao.equals("S"))
                            parteSuperiorDiagonalPrincipal(matriz);
                        else
                            parteInferiorDiagonalPrincipal(matriz);
                    } else
                        System.out.println("Opção disponível apenas para matrizes quadradas!");
                    break;
                case 7:
                    if (linhas==colunas) {
                        System.out.print("Digite \"S\" -> SUPERIOR ou \"I\" -> INFERIOR - ");
                        input.nextLine();
                        String opcaoPosicao = input.nextLine().toUpperCase();

                        if (opcaoPosicao.equals("S"))
                            parteSuperiorDiagonalSecundaria(matriz, linhas);
                        else
                            parteInferiorDiagonalSecundaria(matriz, linhas);
                    } else
                        System.out.println("Opção disponível apenas para matrizes quadradas!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            exibirMenu(true);
            System.out.print("Digite outra opção - ");
            opcao = input.nextInt();
        }

    }

    public static void parteSuperiorDiagonalSecundaria(int[][] matriz, int ordem) {
        System.out.println("Imprimindo parte superior da diagonal secundária");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)
                if (i + j < ordem - 1)
                    System.out.print(matriz[i][j] + " ");
                else if (i + j == ordem - 1)
                    System.out.print("X ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void parteInferiorDiagonalSecundaria(int[][] matriz, int ordem) {
        System.out.println("Imprimindo parte inferior da diagonal secundária");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)
                if (i + j > ordem - 1)
                    System.out.print(matriz[i][j] + " ");
                else if (i + j == ordem - 1)
                    System.out.print("X ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void parteSuperiorDiagonalPrincipal(int[][] matriz) {
        System.out.println("Imprimindo parte superior da diagonal principal");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)
                if (i < j)
                    System.out.print(matriz[i][j] + " ");
                else if (i == j)
                    System.out.print("X ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void parteInferiorDiagonalPrincipal(int[][] matriz) {
        System.out.println("Imprimindo parte inferior da diagonal principal");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)
                if (i > j)
                    System.out.print(matriz[i][j] + " ");
                else if (i == j)
                    System.out.print("X ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void exibirDiagonalSecundariaMatriz(int[][] matriz) {
        System.out.println("Imprimindo diagonal secundária => ");

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                if (i + j == matriz.length - 1)
                    System.out.print(matriz[i][j] + " ");
    }

    public static void exibirDiagonalPrincipalMatriz(int[][] matriz) {
        System.out.println("Imprimindo diagonal principal => ");

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                if (i == j)
                    System.out.print(matriz[i][j] + " ");
    }

    public static void exibirColunaMatriz(int[][] matriz, int coluna) {
        System.out.print("Imprimindo coluna \"" + coluna + "\" => ");

        for (int i = 0; i < matriz[coluna].length; i++)
            System.out.print(matriz[i][coluna] + " ");
        System.out.println();
    }

    public static void exibirLinhaMatriz(int[][] matriz, int linha) {
        System.out.print("Imprimindo linha \"" + linha + "\" => ");

        for (int j = 0; j < matriz[linha].length; j++)
            System.out.print(matriz[linha][j] + " ");
        System.out.println();
    }

    public static void gerarMatriz(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                matriz[i][j] = random.nextInt(10);
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }
    }

    public static void exibirMenu(boolean sair) {
        System.out.println("#############################################");
        if (sair)
            System.out.println("########### 0 - SAIR DO PROGRAMA ############");
        System.out.println("######### 1 - BUSCAR TODA A MATRIZ ##########");
        System.out.println("####### 2 - BUSCAR DETERMINADA LINHA ########");
        System.out.println("###### 3 - BUSCAR DETERMINADA COLUNA ########");
        System.out.println("###### 4 - BUSCAR DIAGONAL PRINCIPAL ########");
        System.out.println("###### 5 - BUSCAR DIAGONAL SECUNDÁRIA #######");
        System.out.println("## 6 - PARTE SUP/INF DA DIAGONAL PRINCIPAL ##");
        System.out.println("# 7 - PARTE SUP/INF DA DIAGONAL SECUNDÁRIA ##");
        System.out.println("#############################################");
    }
}
