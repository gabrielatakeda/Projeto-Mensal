package main.java.produtos;

public class Limpeza extends Produtos {
    //subclasse de Produtos



    //funcao polimorfica herdada da classe mae Produtos
    @Override
    public String getCategoria() {
        return "Limpeza";
    }
}
