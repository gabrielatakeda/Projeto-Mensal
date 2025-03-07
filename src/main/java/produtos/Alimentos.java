package produtos;

import produtos.Produto;

public class Alimentos extends Produto {

    public Alimentos() {
    }

    public Alimentos(String nomeProduto, int quantidade, double precoCompra, double margemLucro) {
        super(nomeProduto, quantidade, precoCompra, margemLucro);
    }

    @Override
    public String getCategoria() {
        return "Alimentos";
    }
}
