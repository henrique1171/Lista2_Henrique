package Lista2_Henrique;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A (inteiro): ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B (inteiro): ");
        int B = scanner.nextInt();

        if (B == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            if (A % B == 0) {
                System.out.println(A + " é divisível por " + B + ".");
            } else {
                System.out.println(A + " não é divisível por " + B + ".");
            }
        }

        scanner.close();
    }
}
