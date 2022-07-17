package Dia04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Criando um vetor com tamanho definido pelo usuário e com valores aleatórios entre 50 e -50
        System.out.print("Informe um tamanho para o vetor - ");
        int[] numeros = new int[input.nextInt()];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101) - 50;
        }

        // Copiando todos os valores do primeiro vetor para um segundo
        int[] numerosCopia = Arrays.copyOf(numeros, numeros.length);

        // Exibindo valores do vetor cópia
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Vetor original[" + i + "] => " + numeros[i]);
            System.out.println("Vetor cópia   [" + i + "] => " + numerosCopia[i]);
        }

        // Descobrindo quantidade de valores pares do vetor
        int pares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0)
                pares++;
        }

        // Colocando valores pares em um novo vetor
        if (pares > 0) {
            int[] numerosPares = new int[pares];

            int iPar = 0;
            for (int i = 0; i < numeros.length; i++) {

                if (numeros[i] % 2 == 0) {
                    numerosPares[iPar] = numeros[i];
                    iPar++;
                }
            }

            for (int i = 0; i < numerosPares.length; i++) {
                System.out.println("Vetor par [" + i + "] => " + numerosPares[i]);
            }
        }

        // Exibindo a quantidade de valores ímpares
        System.out.println("Quantidade de ímpares : " + (numeros.length - pares) +"\n");

        // Criar vetor com número números primos do vetor inicial
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                int dividiu = 0;

                for (int divisor = 1; divisor <= numeros[i]; divisor++)
                    if (numeros[i] % divisor == 0)
                        dividiu++;

                if (dividiu == 2)
                    System.out.println(numeros[i] + " -> É PRIMO!");
            }
        }
    }
}
