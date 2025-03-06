package produtos;

public abstract class Produto {
    //a classe Produtos sera abstrata, para ser classe mae das outras categorias.

    //variaveis com uso protected para que seja acessado somente pelas classes filhas e nada mais
    protected int id;
    protected String nomeProduto;
    protected int quantidade;
    protected double precoCompra;

    //construtor default
    public Produto(){

    }

    public Produto(int id, String nomeProduto, int quantidade, double precoCompra){
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoCompra = precoCompra;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public abstract String getCategoria();
}
