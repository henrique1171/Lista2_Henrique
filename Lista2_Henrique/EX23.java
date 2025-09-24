package Lista2_Henrique;

import java.util.Scanner;

public class EX23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] num = new int[10];
        int[] divisores = new int[5];


        System.out.println("Digite 10 números para o vetor NUM:");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Num[" + i + "]: ");
            num[i] = entrada.nextInt();
        }


        System.out.println("\nDigite 5 números para o vetor DIVIS:");
        for (int i = 0; i < divisores.length; i++) {
            System.out.print("Divis[" + i + "]: ");
            divisores[i] = entrada.nextInt();
        }


        System.out.println("\nSaída:\n");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Número " + num[i] + ":");
            boolean temDivisor = false;

            for (int j = 0; j < divisores.length; j++) {
                if (num[i] % divisores[j] == 0) {
                    System.out.println("   Divisível por " + divisores[j] + " na posição " + j);
                    temDivisor = true;
                }
            }

            if (!temDivisor) {
                System.out.println("   Não possui divisores no vetor DIVIS.");
            }
        }

        entrada.close();
    }
}