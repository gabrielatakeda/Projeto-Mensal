package interfaces;

import produtos.Produto;

public interface ICadastro {
    void addProduto(Produto produto);
    void rmvProduto(String nomeProduto);
    void listProdutos();
}
