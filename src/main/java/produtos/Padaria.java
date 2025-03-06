package main.java.produtos;

import produtos.Produto;

public class Padaria extends Produto {
    //subclasse de Produtos





    //funcao polimorfica herdada da classe mae Produtos
    @Override
    public String getCategoria() {
        return "Padaria";
    }
}
