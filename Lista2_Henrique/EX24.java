package Lista2_Henrique;

import java.util.Scanner;

public class EX24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] vetor = new double[10];


        System.out.println("Digite 10 números reais para o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("V[" + i + "]: ");
            vetor[i] = entrada.nextDouble();
        }


        System.out.print("\nDigite o código (0 = sair, 1 = ordem direta, 2 = ordem inversa): ");
        int codigo = entrada.nextInt();


        switch (codigo) {
            case 0:
                System.out.println("Programa encerrado.");
                break;
            case 1:
                System.out.println("\nVetor na ordem direta:");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + " ");
                }
                break;
            case 2:
                System.out.println("\nVetor na ordem inversa:");
                for (int i = vetor.length - 1; i >= 0; i--) {
                    System.out.print(vetor[i] + " ");
                }
                break;
            default:
                System.out.println("Código inválido!");
        }

        entrada.close();
    }
}
