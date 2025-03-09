package cadastros;

import interfaces.ICadastro;
import produtos.Produto;
import cadastros.Cadastro;
import produtos.Alimentos;
import produtos.Limpeza;
import produtos.Padaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro implements ICadastro {
    private List<Produto> produtos = new ArrayList<>();


    //essa classe pegou OBRIGATORIAMENTE os metodos definidos na interface
    //entao essa classe sera responsavel em cadastrar e remover produtos, alem de trazer uma listagem completa de todos produtos
    @Override
    public void addProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("\nProduto adicionado com sucesso: " + produto.getNomeProduto());
    }

    //removeeeeee
    @Override
    public void rmvProduto(String nomeProduto) {
        boolean acharProduto = produtos.removeIf(produto -> produto.getNomeProduto().equalsIgnoreCase(nomeProduto));
            if(acharProduto) {
                System.out.println("\nProduto removido com sucesso: " + nomeProduto);
            }
            else {
                System.out.println("\nProduto não encontrado: " + nomeProduto);
            }
    }

    //essa funcao vai varrer o List com um foreach e usando a funcao que esta dentro do Produto para imprimir cada produto cadastrado
    @Override
    public void listProduto() {
        if(produtos.isEmpty()) {
            System.out.println("\nNenhum produto cadastrado.");
        }
        else {
            for (Produto produto : produtos) {
                produto.print();
            }
        }
    }

    @Override
    public void modificarProduto(String nomeProduto) {
        boolean acharProduto = false;

        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                acharProduto = true;

                Scanner sc = new Scanner(System.in);
                System.out.println("\nProduto escolhido: " + produto.getNomeProduto());
                System.out.println("\n---------------------------------------------");
                System.out.println("1. Nome do produto");
                System.out.println("2. Quantidade do produto");
                System.out.println("3. Preço do produto");
                System.out.println("\nEscolha o que deseja modificar: ");

                int op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1: {
                        System.out.print("\nDigite o novo nome do produto: ");
                        String novoNome = sc.nextLine();
                        if (!novoNome.isEmpty()) {
                            produto.setNomeProduto(novoNome);;
                            System.out.println("\nNome do produto atualizado com sucesso!");
                        }
                        else {
                            System.out.println("\nO nome do produto não foi alterado.");
                        }

                        break;
                    }
                    case 2: // Modificar a quantidade do produto
                        System.out.print("\nDigite a nova quantidade do produto: ");
                        int novaQuantidade = sc.nextInt();
                        if (novaQuantidade >= 0) {
                            produto.setQuantidade(novaQuantidade);
                            System.out.println("\nQuantidade do produto atualizada com sucesso!");
                        } else {
                            System.out.println("\nA quantidade não pode ser negativa.");
                        }

                        break;
                    case 3: // Modificar o preço do produto
                        System.out.print("\nDigite o novo preço de compra do produto: ");
                        double novoPrecoCompra = sc.nextDouble();
                        if (novoPrecoCompra >= 0) {
                            produto.setPrecoCompra(novoPrecoCompra);

                            System.out.print("Digite a margem de lucro (em %): ");
                            double novoLucro = sc.nextDouble();
                            produto.setPrecoVenda(produto.calcularPrecoVenda(novoLucro));
                            System.out.println("\nPreço do produto atualizado com sucesso!");
                        }
                        else {
                            System.out.println("\nO preço não pode ser negativo.");
                        }

                        break;
                    default:
                        System.out.println("\nOpção inválida. Nenhuma modificação realizada.");
                }
            }

        }
        if (!acharProduto) {
            System.out.println("\nProduto não encontrado ou não existe.");
        }
    }
}
