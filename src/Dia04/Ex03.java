package Dia04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma ordem para o vetor - ");
        int ordem = input.nextInt();

        int[][] vetor = new int[ordem][ordem];

        int inicio = 0, fim = ordem - 1, contador = 0;

        while(contador < ordem * ordem) {
            for (int i = inicio; i <= fim; i++)
                vetor[inicio][i] = contador++;

            for (int i = inicio + 1; i <= fim; i++)
                vetor[i][fim] = contador++;

            for (int i = fim - 1; i >= inicio; i--)
                vetor[fim][i] = contador++;

            for (int i = fim - 1; i > inicio; i--)
                vetor[i][inicio] = contador++;

            inicio++;
            fim--;
        }


        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++)
                System.out.print(vetor[i][j] + "\t");
            System.out.println();
        }
    }
}
