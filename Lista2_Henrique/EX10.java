package Lista2_Henrique;

import java.util.Scanner;

public class EX10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Valor inválido! Não existe fatorial de número negativo.");
            } else {
                long fatorial = 1;
                for (int i = 1; i <= n; i++) {
                    fatorial *= i;
                }
                System.out.println(n + "! = " + fatorial);
            }

            sc.close();
        }
    }

