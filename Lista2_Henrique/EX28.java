package Lista2_Henrique;

import java.util.Scanner;

public class EX28 {

    public static long fatorial(int n) {
        long fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }


    public static long arranjo(int n, int p) {
        return fatorial(n) / fatorial(n - p);
    }


    public static long combinacao(int n, int p) {
        return fatorial(n) / (fatorial(p) * fatorial(n - p));
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n, p;


        do {
            System.out.print("Informe N (total de elementos): ");
            n = entrada.nextInt();
            System.out.print("Informe P (número de elementos tomados de cada vez): ");
            p = entrada.nextInt();

            if (p > n || n <= 0 || p <= 0) {
                System.out.println("Erro: N e P devem ser positivos e P <= N. Tente novamente.");
            }
        } while (p > n || n <= 0 || p <= 0);


        long A = arranjo(n, p);
        long C = combinacao(n, p);


        System.out.println("Arranjo A(" + n + "," + p + ") = " + A);
        System.out.println("Combinação C(" + n + "," + p + ") = " + C);

        entrada.close();
    }
}