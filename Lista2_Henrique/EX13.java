package Lista2_Henrique;

import java.util.Scanner;

public class EX13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cadastre uma senha numérica: ");
        int senhaCorreta = entrada.nextInt();

        int tentativa;

        do {
            System.out.print("Digite a senha: ");
            tentativa = entrada.nextInt();

            if (tentativa != senhaCorreta) {
                System.out.println("Senha incorreta, tente novamente.");
            }

        } while (tentativa != senhaCorreta);

        System.out.println("Senha correta! Bem-vindo ao sistema.");

        entrada.close();
    }
}

