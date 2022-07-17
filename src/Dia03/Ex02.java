package Dia03;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("#########################");
        System.out.println("## Jogo da adivinhação ##");
        System.out.println("#########################");
        System.out.println("Pensei um número, tente adivinhá-lo...");

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int tentativas = 3, chute;
        int numeroSecreto = random.nextInt(11);

        while(tentativas != 0) {
            System.out.printf("### TENTATIVAS RESTANTES %d ###%n", tentativas);
            System.out.print("Digite um número de 0 a 10 - ");
            chute = input.nextInt();

            if(chute >= 0 && chute <= 10) {
                if (chute == numeroSecreto) {
                    System.out.println("PARABÉNS, VOCÊ ACERTOU!!!");
                    break;
                } else if (tentativas > 1) {
                    if(chute >= numeroSecreto)
                        System.out.println("Você errou! O valor digitado é maior que o número secreto!");
                    else
                        System.out.println("Você errou! O valor digitado é menor que o número secreto!");
                }
                tentativas--;
            } else
                System.out.println("Digite um número entre 0 e 10!");
        }

        if (tentativas == 0)
            System.out.printf("Você perdeu! O número secreto era %d%n", numeroSecreto);

        System.out.println("#### FIM DO PROGRAMA ####");
    }
}
