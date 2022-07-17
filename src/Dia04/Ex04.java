package Dia04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz - ");
        int ordem = input.nextInt();

        int[][] vetor = new int[ordem][ordem];

        int inicio = 0, fim = ordem - 1, contador = 1;
        boolean executor = true;

        do {
            if (ordem % 2 == 0 && inicio == fim + 1)
                executor = false;
            else if (ordem % 2 != 0 && inicio == fim)
                executor = false;

            for (int i = inicio; i <= fim; i++)
                vetor[inicio][i] = contador;

            for (int i = inicio + 1; i <= fim; i++)
                vetor[i][fim] = contador;

            for (int i = fim - 1; i >= inicio; i--)
                vetor[fim][i] = contador;

            for (int i = fim -1; i >= inicio; i--)
                vetor[i][inicio] = contador;

            contador++;
            inicio++;
            fim--;

        } while (executor);

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++)
                System.out.print(vetor[i][j] + "\t");
            System.out.println();
        }

    }
}
