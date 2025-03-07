package produtos;

import produtos.Produto;

public class Limpeza extends Produto {
    //subclasse de Produtos


    public Limpeza() {
    }

    public Limpeza(String nomeProduto, int quantidade, double precoCompra, double margemLucro) {
        super(nomeProduto, quantidade, precoCompra, margemLucro);
    }

    //funcao polimorfica herdada da classe mae Produtos
    @Override
    public String getCategoria() {
        return "Limpeza";
    }
}
