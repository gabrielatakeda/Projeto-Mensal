package AAAA;

import cadastros.Cadastro;
import produtos.Alimentos;
import produtos.Limpeza;
import produtos.Padaria;
import produtos.Produto;

import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        //classe principal
        Scanner sc = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        boolean parada = true;


        while (parada) {
            System.out.println("---MERCEARIA BERE---");

            System.out.println("\n\n==== MENU ====");
            System.out.println("\n--------------");
            System.out.println("\n1. Cadastrar Produto");
            System.out.println("\n2. Remover Produto");
            System.out.println("\n3. Lista de Produtos");
            System.out.println("\n4. Venda");
            System.out.println("\n5. Relatório");
            System.out.println("\n6. Sair");
            System.out.println("\nEscolha uma opção: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Cadastro de Produtos: \n");
                    System.out.println("Preencha as informacoes.\n");

                    System.out.println("\nNome do Produto: ");
                    String nomeProduto = sc.nextLine();

                    System.out.println("\nEstoque disponivel: ");
                    int quantidade = sc.nextInt();

                    System.out.println("\nPreço de compra: ");
                    double precoCompra = sc.nextDouble();

                    System.out.println("\nQual a porcentagem de lucro deseja aplicar: ");
                    double margemLucro = sc.nextDouble();
                    sc.nextLine(); //pula linha

                    System.out.println("Escolha a categoria:\n" +
                                        "1- Padaria.\n" +
                                        "2- Limpeza.\n" +
                                        "3- Alimentos.\n");

                    int categoria = sc.nextInt();

                    Produto produto = switch(categoria){
                        case 1 -> new Padaria(nomeProduto, quantidade, precoCompra, margemLucro);
                        case 2 -> new Limpeza(nomeProduto, quantidade, precoCompra, margemLucro);
                        case 3 -> new Alimentos(nomeProduto, quantidade, precoCompra, margemLucro);
                        default -> null;
                    };


                    break;
                case 2:



                    break;
                case 3:



                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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
