package Lista2_Henrique;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        String classificacao;

        switch (codigo) {
            case 1:
                classificacao = "Alimento não-perecível";
                break;
            case 2: case 3: case 4:
                classificacao = "Alimento perecível";
                break;
            case 5: case 6:
                classificacao = "Vestuário";
                break;
            case 7:
                classificacao = "Higiene pessoal";
                break;
            case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15:
                classificacao = "Limpeza e utensílios domésticos";
                break;
            default:
                classificacao = "Inválido";
        }

        System.out.println("Classificação: " + classificacao);
        sc.close();
    }
}

