package Lista2_Henrique;

import java.util.Scanner;

public class EX19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas do triângulo: ");
        int linhas = entrada.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        entrada.close();
    }
}
