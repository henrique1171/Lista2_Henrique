package Lista2_Henrique;

import java.util.Scanner;

public class EX29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (ehPalindromo(numero)) {
            System.out.println(numero + " é um palíndromo!");
        } else {
            System.out.println(numero + " não é um palíndromo.");
        }

        entrada.close();
    }

    public static boolean ehPalindromo(int num) {
        int original = num, invertido = 0;

        while (num > 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        return original == invertido;
    }
}