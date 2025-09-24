package Lista2_Henrique;

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar;

        do {

            System.out.print("Entre com o nome do aluno: ");
            String nome = entrada.nextLine();


            double notaA;
            do {
                System.out.print("Entre com o grau A: ");
                notaA = entrada.nextDouble();
                if (notaA < 0 || notaA > 10) {
                    System.out.println("ERRO: Nota inválida! Digite novamente a nota.");
                }
            } while (notaA < 0 || notaA > 10);


            double notaB;
            do {
                System.out.print("Entre com o grau B: ");
                notaB = entrada.nextDouble();
                if (notaB < 0 || notaB > 10) {
                    System.out.println("ERRO: Nota inválida! Digite novamente a nota.");
                }
            } while (notaB < 0 || notaB > 10);


            double media = (notaA + notaB) / 2.0;


            System.out.printf("O aluno %s tem uma média: %.2f%n", nome, media);


            entrada.nextLine();


            System.out.print("Continuar (sim/nao)? ");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("sim"));

        entrada.close();
    }
}
