package main.java.cadastros;

import main.java.produtos.Produtos;
import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Produtos> produtos = new ArrayList<>();

    public void cadastrarProduto(Produtos produtos){
        produtos.add(produtos);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");
        }
        else{
            for(Produtos p : produtos){
                System.out.println("\nID: " + p.id + "\nNome: " + p.nomeProduto
                        + "\nCategoria: " + p.getCategoria() + "\nPreço: R$" + p.precoCompra + "\n\n");
            }
        }
    }
}
