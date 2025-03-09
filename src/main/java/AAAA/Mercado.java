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
            try{
                System.out.println("\n--- MERCEARIA BERE ---");

                System.out.println("\n======== MENU ========");
                System.out.println("\n----------------------");
                System.out.println("1. Cadastrar Produto");
                System.out.println("2. Remover Produto");
                System.out.println("3. Lista de Produtos");
                System.out.println("4. Modificar Produto");
                System.out.println("5. Venda");
                System.out.println("6. Relatório");
                System.out.println("7. Sair");
                System.out.println("\nEscolha uma opção: ");
                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        try {
                            System.out.println("\n\n==== Cadastro de Produtos ====");
                            System.out.println("\n------------------------------");
                            System.out.println("Preencha as informações abaixo");

                            sc.nextLine(); //limpar buffer antes do nextLine para não causar erros na exibição

                            System.out.println("\nNome do Produto: ");
                            String nomeProduto = sc.nextLine();

                            System.out.println("\nEstoque disponivel: ");
                            int quantidade = sc.nextInt();

                            System.out.println("\nPreço de compra: ");
                            double precoCompra = sc.nextDouble();

                            System.out.println("\nPorcentagem de lucro que deseja aplicar: ");
                            double margemLucro = sc.nextDouble();

                            sc.nextLine(); //Limpar buffer

                            System.out.println("\nEscolha a categoria:\n" +
                                    "1. Padaria.\n" +
                                    "2. Limpeza.\n" +
                                    "3. Alimentos.\n");

                            int categoria = sc.nextInt();

                            Produto produto = switch (categoria) {
                                case 1 -> new Padaria(nomeProduto, quantidade, precoCompra, margemLucro);
                                case 2 -> new Limpeza(nomeProduto, quantidade, precoCompra, margemLucro);
                                case 3 -> new Alimentos(nomeProduto, quantidade, precoCompra, margemLucro);
                                default -> null;
                            };

                            if (produto != null) {
                                cadastro.addProduto(produto);
                            } else {
                                System.out.println("Categoria inválida. Produto não cadastrado.");
                            }
                        }catch (Exception e){
                            System.out.println("Erro inesperado! Tente novamente.");
                            sc.nextLine();
                        }

                        break;
                    case 2:
                        System.out.println("==== Remoção de Produto ====");
                        System.out.println("\nDigite o nome do produto que deseja remover: ");
                        sc.nextLine(); //Limpar buffer
                        String produtoRemover = sc.nextLine();
                        cadastro.rmvProduto(produtoRemover);

                        break;
                    case 3:
                        System.out.println("\n==== Lista de Produtos ====\n");
                        cadastro.listProduto();

                        break;
                    case 4:
                        System.out.println("==== Modificar Produto ====");
                        break;
                    case 5:
                        System.out.println("==== Vendas ====");
                        break;
                    case 6:
                        System.out.println("==== Relatórios ====");
                        break;
                    case 7:
                        System.out.println("Encerrando sistema...");
                        parada = false;
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            }catch (Exception e){
                    System.out.println("Erro inesperado! Tente novamente.");
                    sc.nextLine();
            }
        }
    }
}
