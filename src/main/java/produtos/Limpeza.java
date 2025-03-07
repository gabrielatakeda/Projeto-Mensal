package produtos;

import produtos.Produto;

public class Limpeza extends Produto {
    //subclasse de Produtos



    //funcao polimorfica herdada da classe mae Produtos
    @Override
    public String getCategoria() {
        return "Limpeza";
    }
}
