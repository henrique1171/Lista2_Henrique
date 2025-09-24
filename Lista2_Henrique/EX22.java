package Lista2_Henrique;

import java.util.Scanner;

public class EX22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[10];
        int contador = 0;


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número inteiro da posição " + i + ": ");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("\nNúmeros maiores que 25 e suas posições:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 25) {
                System.out.println("V[" + i + "] = " + vetor[i]);
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("Nenhum número maior que 25 foi encontrado.");
        } else {
            System.out.println("\nQuantidade de números maiores que 25: " + contador);
        }

        entrada.close();
    }
}