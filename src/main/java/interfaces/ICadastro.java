package interfaces;

import produtos.Produto;

public interface ICadastro {
    void addProduto(Produto produto);
    void rmvProduto(String nomeProduto);
    void listProduto();
    void modificarProduto(String nomeProduto);

    Produto buscarProduto(String nomeProduto);
}
