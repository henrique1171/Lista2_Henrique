package Lista2_Henrique;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Digite a idade do eleitor: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Voto facultativo.");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Voto obrigatório.");
        } else {
            System.out.println("Voto dispensado.");
        }

        scanner.close();
    }
}