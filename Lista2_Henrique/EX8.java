package Lista2_Henrique;

import java.util.Scanner;

public class EX8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o código (1 a 4): ");
            int codigo = sc.nextInt();

            System.out.print("Digite o valor de x: ");
            double x = sc.nextDouble();

            System.out.print("Digite o valor de y: ");
            double y = sc.nextDouble();

            double resultado = 0;
            boolean valido = true;

            switch (codigo) {
                case 1:
                    if (y == 0) {
                        System.out.println("Erro: divisão por zero.");
                        valido = false;
                    } else {
                        resultado = Math.sqrt(Math.pow(x, 3) + (x * (2 * y - x)) / Math.pow(y, 2));
                    }
                    break;

                case 2:
                    if (x == 0 || y == 0) {
                        System.out.println("Erro: divisão por zero.");
                        valido = false;
                    } else {
                        resultado = Math.sqrt((Math.pow(x, 3) + Math.pow(y, 3)) + (Math.pow(x, 3) - Math.pow(y, 3))) / (x * y);
                    }
                    break;

                case 3:
                    resultado = 2 * x + Math.sqrt(x * y);
                    break;

                case 4:
                    resultado = Math.sin(x) + Math.cos(y);
                    break;

                default:
                    System.out.println("Código inválido!");
                    valido = false;
            }

            if (valido) {
                System.out.println("Resultado: " + resultado);
            }

            sc.close();
        }
    }

