package Lista2_Henrique;

import java.util.Scanner;

public class EX14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalAlunos = 0;
        int aprovados = 0, reprovados = 0, exame = 0;
        double somaMedias = 0;

        String nomeMaior = "";
        String nomeMenor = "";
        double maiorMedia = -1;
        double menorMedia = 11;

        String continuar;

        do {

            System.out.print("Digite o nome do aluno: ");
            String nome = entrada.nextLine();


            double nota1, nota2;
            do {
                System.out.print("Digite a primeira nota (0 a 10): ");
                nota1 = entrada.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Digite a segunda nota (0 a 10): ");
                nota2 = entrada.nextDouble();
            } while (nota2 < 0 || nota2 > 10);


            double media = (nota1 + nota2) / 2.0;
            System.out.printf("Média do aluno %s: %.2f%n", nome, media);


            if (media <= 3) {
                System.out.println("Situação: Reprovado");
                reprovados++;
            } else if (media < 7) {
                System.out.println("Situação: Exame");
                exame++;
            } else {
                System.out.println("Situação: Aprovado");
                aprovados++;
            }


            totalAlunos++;
            somaMedias += media;

            if (media > maiorMedia) {
                maiorMedia = media;
                nomeMaior = nome;
            }
            if (media < menorMedia) {
                menorMedia = media;
                nomeMenor = nome;
            }


            entrada.nextLine();


            System.out.print("Deseja cadastrar outro aluno? (sim/nao): ");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("sim"));


        System.out.println("\n===== RELATÓRIO FINAL =====");
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Exame: " + exame);

        if (totalAlunos > 0) {
            double mediaClasse = somaMedias / totalAlunos;
            System.out.printf("Média da classe: %.2f%n", mediaClasse);
            System.out.printf("Maior média: %s (%.2f)%n", nomeMaior, maiorMedia);
            System.out.printf("Menor média: %s (%.2f)%n", nomeMenor, menorMedia);
        }

        entrada.close();
    }
}

