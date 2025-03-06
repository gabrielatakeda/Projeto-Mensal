package main.java;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        //classe principal
        Scanner sc = new Scanner(System.in);
        boolean parada = true;

        while (parada) {
            System.out.println("---MERCEARIA BERE---");

            System.out.println("\n\n==== MENU ====");
            System.out.println("\n--------------");
            System.out.println("\n1. Cadastrar Produto");
            System.out.println("\n2. Lista de Produtos");
            System.out.println("\n3. Venda");
            System.out.println("\n4. Relatório");
            System.out.println("\n5. Sair");
            System.out.println("\nEscolha uma opção: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Encerrando sistema...");
                    parada = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        }

    }
}
