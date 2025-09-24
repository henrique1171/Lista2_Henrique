package Lista2_Henrique;

import java.util.Scanner;

public class EX11 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o valor do divisor: ");
            int divisor = sc.nextInt();

            System.out.print("Digite o início do intervalo: ");
            int inicio = sc.nextInt();

            System.out.print("Digite o fim do intervalo: ");
            int fim = sc.nextInt();

            if (divisor == 0) {
                System.out.println("Divisor inválido! Não é possível dividir por zero.");
                sc.close();
                return;
            }

            System.out.print("Números divisíveis por " + divisor +
                    " no intervalo de " + inicio + " a " + fim + ": ");

            boolean encontrou = false;
            for (int i = inicio; i <= fim; i++) {
                if (i % divisor == 0) {
                    if (encontrou) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    encontrou = true;
                }
            }

            if (!encontrou) {
                System.out.print("Nenhum número encontrado.");
            }

            System.out.println();
            sc.close();
        }
    }
