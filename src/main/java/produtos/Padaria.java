package produtos;

import produtos.Produto;

public class Padaria extends Produto {
    //subclasse de Produtos

    //construtores parametrizados
    public Padaria() {
    }

    public Padaria(String nomeProduto, int quantidade, double precoCompra, double margemLucro) {
        super(nomeProduto, quantidade, precoCompra, margemLucro);
    }

    //funcao polimorfica herdada da classe mae Produtos
    @Override
    public String getCategoria() {
        return "Padaria";
    }
}
