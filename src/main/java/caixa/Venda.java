package main.java.caixa;
public class Venda extends Caixa{
    //classe venda sera sera extenção de Caixa para fazer interações com seu valor

    private double valorTotal;

    //função que passará o valor de cada produto(do array com o .precoCompra) para que seja somado um valor final
    public void adcProduto(double produto){
        valorTotal = valorTotal + produto;
    }

    public void realizarCompra(){
        saldo = saldo + valorTotal;
    }

    //construtores getters e setters

    public Venda(){

    }
    //construtor sem o saldo do caixa pois não se pode definir o valor do caixa por um abjeto de venda
    public Venda(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}