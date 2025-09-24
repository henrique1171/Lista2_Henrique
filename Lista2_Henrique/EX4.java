package Lista2_Henrique;

import java.util.Scanner;

public class EX4 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor da compra: R$ ");
    double valorCompra = scanner.nextDouble();

    if (valorCompra <= 0) {
        System.out.println("Valor inválido. A compra deve ser maior que R$ 0,00.");
    } else {
        double valorVenda;

        if (valorCompra < 10.00) {
            valorVenda = valorCompra * 1.70;
        } else if (valorCompra < 30.00) {
            valorVenda = valorCompra * 1.50;
        } else if (valorCompra < 50.00) {
            valorVenda = valorCompra * 1.40;
        } else {
            valorVenda = valorCompra * 1.30;
        }

        System.out.printf("Valor da venda: R$ %.2f\n", valorVenda);
    }

    scanner.close();
}
}

