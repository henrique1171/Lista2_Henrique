package Lista2_Henrique;

import java.util.Scanner;

public class EX17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double total = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Cardápio ---");
            System.out.println("1 - Cachorro quente (R$ 1,50)");
            System.out.println("2 - Hamburger       (R$ 2,00)");
            System.out.println("3 - Cheeseburger    (R$ 2,50)");
            System.out.println("4 - Eggcheeseburger (R$ 3,00)");
            System.out.println("5 - Refrigerante    (R$ 1,50)");
            System.out.println("0 - Encerrar pedido");

            System.out.print("Digite o código do produto: ");
            int codigo = entrada.nextInt();

            if (codigo == 0) {
                continuar = false;
            } else {
                System.out.print("Digite a quantidade: ");
                int quantidade = entrada.nextInt();

                double preco = 0;
                String produto = "";

                switch (codigo) {
                    case 1:
                        preco = 1.50;
                        produto = "Cachorro quente";
                        break;
                    case 2:
                        preco = 2.00;
                        produto = "Hamburger";
                        break;
                    case 3:
                        preco = 2.50;
                        produto = "Cheeseburger";
                        break;
                    case 4:
                        preco = 3.00;
                        produto = "Eggcheeseburger";
                        break;
                    case 5:
                        preco = 1.50;
                        produto = "Refrigerante";
                        break;
                    default:
                        System.out.println("Código inválido!");
                        continue;
                }

                double valorProduto = preco * quantidade;
                total += valorProduto;

                System.out.printf("%d x %s = R$ %.2f\n", quantidade, produto, valorProduto);
            }
        }

        System.out.printf("\nTotal do pedido: R$ %.2f\n", total);

        entrada.close();
    }
}
