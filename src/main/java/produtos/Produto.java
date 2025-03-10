package produtos;

public abstract class Produto {
    //a classe Produtos sera abstrata, para ser classe mae das outras categorias.

    //variaveis com uso protected para que seja acessado somente pelas classes filhas e nada mais
    protected String nomeProduto;
    protected int quantidade;
    protected double precoCompra;
    protected double precoVenda;

    //construtor default
    public Produto(){

    }

    //construtor parametrizado
    public Produto(String nomeProduto, int quantidade, double precoCompra, double margemLucro){
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoCompra = precoCompra;
        this.precoVenda = calcularPrecoVenda(margemLucro);
    }

    //construtor de copia
    public Produto(Produto outro){
        this.nomeProduto = outro.nomeProduto;
        this.quantidade = outro.quantidade;
        this.precoCompra = outro.precoCompra;
        this.precoVenda = outro.precoVenda;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }

    //vai puxar a categoria de cada produto

    public abstract String getCategoria();
    //calcula o preco de venda de cordo com a margem de lucro desejada

    public double calcularPrecoVenda(double margemLucro) {
        return precoCompra + (precoCompra * margemLucro / 100);
    }
    //vai printar as informacoes de cada produto

    public void reduzirQuantidade(int quantidadeVendida) {
        this.quantidade -= quantidadeVendida;
    }

    public void print() {
        System.out.println(nomeProduto +
                            " - Categoria: " + getCategoria() +
                            " | Preço de custo: R$" + precoCompra +
                            " | Preço de venda: R$" + precoVenda +
                            " (" + quantidade + " disponíveis)");
        System.out.println("==================================================");
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}
