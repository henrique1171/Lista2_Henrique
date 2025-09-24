package Lista2_Henrique;

import java.util.Scanner;

public class EX20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[10];


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = entrada.nextInt();
        }


        int menor = vetor[0];
        int posMenor = 0;
        int maior = vetor[0];
        int posMaior = 0;


        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }


        System.out.println("O menor elemento do vetor é " + menor +
                " e sua posição dentro do vetor é: V[" + posMenor + "]");
        System.out.println("Já o maior elemento é " + maior +
                ", e está na posição V[" + posMaior + "]");

        entrada.close();
    }

}
