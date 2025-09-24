package Lista2_Henrique;

import java.util.Scanner;

public class EX25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores (até 10): ");
        int n = sc.nextInt();
        while (n < 1 || n > 10) {
            System.out.print("Tamanho inválido! Digite novamente: ");
            n = sc.nextInt();
        }

        double[] V1 = new double[n];
        double[] V2 = new double[n];
        char[] Op = new char[n];
        double[] Resul = new double[n];

        System.out.println("Digite os elementos de V1:");
        for (int i = 0; i < n; i++) {
            V1[i] = sc.nextDouble();
        }

        System.out.println("Digite os elementos de V2:");
        for (int i = 0; i < n; i++) {
            V2[i] = sc.nextDouble();
        }

        System.out.println("Digite os operadores (+, -, *, /):");
        for (int i = 0; i < n; i++) {
            Op[i] = sc.next().charAt(0);
        }


        for (int i = 0; i < n; i++) {
            switch (Op[i]) {
                case '+':
                    Resul[i] = V1[i] + V2[i];
                    break;
                case '-':
                    Resul[i] = V1[i] - V2[i];
                    break;
                case '*':
                    Resul[i] = V1[i] * V2[i];
                    break;
                case '/':
                    if (V2[i] != 0) {
                        Resul[i] = V1[i] / V2[i];
                    } else {
                        System.out.println("Erro: divisão por zero na posição " + i);
                        Resul[i] = 0;
                    }
                    break;
                default:
                    System.out.println("Operador inválido na posição " + i);
                    Resul[i] = 0;
            }
        }


        System.out.println("Resultado:");
        for (int i = 0; i < n; i++) {
            System.out.print(Resul[i] + " ");
        }
    }
}
