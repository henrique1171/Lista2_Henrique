package Lista2_Henrique;

import java.util.Scanner;
    public class EX9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        long resultado = 1;

        if (y < 0) {
            System.out.println("Expoente negativo não suportado sem ponto flutuante.");
            return;
        }

        for (int i = 0; i < y; i++) {
            resultado *= x;
        }

        System.out.println(x + "^" + y + " = " + resultado);

        sc.close();
    }
}