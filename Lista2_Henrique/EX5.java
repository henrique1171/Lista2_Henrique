package Lista2_Henrique;

import java.util.Scanner;

public class EX5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o número de identificação do aluno: ");
            String idAluno = sc.nextLine();

            System.out.print("Digite a nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.print("Digite a nota 2: ");
            double nota2 = sc.nextDouble();

            System.out.print("Digite a nota 3: ");
            double nota3 = sc.nextDouble();

            System.out.print("Digite a média dos exercícios: ");
            double mediaEx = sc.nextDouble();

            if (! (nota1 >= 0 && nota1 <= 10 &&
                    nota2 >= 0 && nota2 <= 10 &&
                    nota3 >= 0 && nota3 <= 10 &&
                    mediaEx >= 0 && mediaEx <= 10)) {
                System.out.println("Erro: todas as notas devem estar entre 0 e 10.");
                return;
            }

            double media = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaEx) / 7.0;

            char conceito;
            if (media >= 9.0 && media <= 10) {
                conceito = 'A';
            } else if (media >= 7.5) {
                conceito = 'B';
            } else if (media >= 6.0) {
                conceito = 'C';
            } else if (media >= 4.0) {
                conceito = 'D';
            } else {
                conceito = 'E';
            }

            String situacao = (conceito == 'A' || conceito == 'B' || conceito == 'C')
                    ? "APROVADO"
                    : "REPROVADO";

            System.out.println("\n--- Resultado ---");
            System.out.println("Número do aluno: " + idAluno);
            System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
            System.out.println("Média dos exercícios: " + mediaEx);
            System.out.printf("Média de aproveitamento: %.2f%n", media);
            System.out.println("Conceito: " + conceito);
            System.out.println("Situação: " + situacao);

            sc.close();
        }
    }

