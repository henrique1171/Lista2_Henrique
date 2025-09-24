package Lista2_Henrique;

import java.util.Scanner;

public class EX21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] vetor = new double[15];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número inteiro da posição " + i + ": ");
            int numero = entrada.nextInt();

            if (numero < 0) {
                vetor[i] = -1;
            } else {
                vetor[i] = Math.sqrt(numero);
            }
        }

        System.out.println("\nValores armazenados no vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("V[" + i + "] = " + vetor[i]);
        }

        entrada.close();
    }
}
