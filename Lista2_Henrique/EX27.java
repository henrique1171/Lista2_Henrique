package Lista2_Henrique;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class EX27 {

    public static int sorteia(int limitInf, int limitSup) {
        Random rand = new Random();
        return rand.nextInt(limitSup - limitInf + 1) + limitInf;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limitInf, limitSup;


        do {
            System.out.print("Informe o limite inferior: ");
            limitInf = entrada.nextInt();
            System.out.print("Informe o limite superior: ");
            limitSup = entrada.nextInt();

            if (limitInf >= limitSup) {
                System.out.println("O limite inferior deve ser menor que o superior. Tente novamente.");
            }
        } while (limitInf >= limitSup);

        int tamanho = 10;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            A[i] = sorteia(limitInf, limitSup);
            B[i] = sorteia(limitInf, limitSup);
        }


        int[] Soma = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            Soma[i] = A[i] + B[i];
        }


        ArrayList<Integer> IntersecaoList = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (A[i] == B[j] && !IntersecaoList.contains(A[i])) {
                    IntersecaoList.add(A[i]);
                }
            }
        }
        int[] Intersecao = IntersecaoList.stream().mapToInt(Integer::intValue).toArray();


        ArrayList<Integer> DiferencaList = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            boolean found = false;
            for (int j = 0; j < tamanho; j++) {
                if (A[i] == B[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                DiferencaList.add(A[i]);
            }
        }
        int[] Diferenca = DiferencaList.stream().mapToInt(Integer::intValue).toArray();


        int[] Intercalacao = new int[tamanho * 2];
        for (int i = 0; i < tamanho; i++) {
            Intercalacao[2 * i] = A[i];
            Intercalacao[2 * i + 1] = B[i];
        }


        System.out.println("Vetor A: ");
        for (int num : A) System.out.print(num + " ");
        System.out.println("\nVetor B: ");
        for (int num : B) System.out.print(num + " ");
        System.out.println("\nVetor Soma: ");
        for (int num : Soma) System.out.print(num + " ");
        System.out.println("\nVetor Intersecao: ");
        for (int num : Intersecao) System.out.print(num + " ");
        System.out.println("\nVetor Diferenca (A - B): ");
        for (int num : Diferenca) System.out.print(num + " ");
        System.out.println("\nVetor Intercalacao: ");
        for (int num : Intercalacao) System.out.print(num + " ");

        entrada.close();
    }
}
