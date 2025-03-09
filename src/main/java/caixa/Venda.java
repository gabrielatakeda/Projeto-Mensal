package caixa;

import produtos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda extends Caixa{
    //classe venda sera sera extenção de Caixa para fazer interações com seu valor

    Scanner sc = new Scanner(System.in);

    //a lista depende dos produtos existentes na classe produtos.
    private List<Produto> produtosVendido;
    private tipoPagamento pagamento;
    private double total;

    //construtor

    public Venda(List<Produto> produtosVendido, tipoPagamento pagamento){
        this.produtosVendido = produtosVendido;
        this.pagamento = pagamento;
        calcularTotal();
    }
    //vai calcular o valor total da compra de acordo com o preco de venda de cada produto.

    private void calcularTotal(){
        for (Produto produto : produtosVendido) {
            total += produto.getPrecoVenda();
        }
    }

    private double valorTotal;

    private tipoPagamento pag;

    public void escolherPagamento(int valor){
        pag.valor = valor;
    }

    //função que passará o valor de cada produto(do array com o .precoCompra) para que seja somado um valor final
    public void adcProduto(double produto){
        valorTotal = valorTotal + produto;
    }

    public void realizarCompra(){
        if(pag == tipoPagamento.Pix){

            saldo += valorTotal;
            valorTotal = 0;

        }else if(pag == tipoPagamento.Cartao){

            saldo += valorTotal;
            valorTotal = 0;

        }else if(pag == tipoPagamento.Dinheiro){

            System.out.println("digite o valor que estrergara");

            double valorPago = sc.nextInt();

            if (valorPago < valorTotal){
                System.out.println("o valor que inseriu e insuficiente");
            }else if (valorPago == valorTotal) {
                saldo += valorTotal;
                valorTotal = 0;
            }else if (valorPago > valorTotal){
                saldo += valorTotal;
                double troco = valorTotal - valorPago;
                valorTotal = 0;
                System.out.println("voce tem "+ troco + " de troco");
            }



        }
    }

    public void print(){
        System.out.println("Venda realizada via: " + pagamento);
        for (Produto produto : produtosVendido) {
            System.out.println("- " + produto.getNomeProduto() + " | R$ " + produto.getPrecoVenda() + " | Qtd: " + produto.getQuantidade() + " | R$ " + (produto.getPrecoVenda() * produto.getQuantidade()));
        }
        System.out.println("Total: R$" + total);
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

    public tipoPagamento getPag() {
        return pag;
    }

    public void setPag(tipoPagamento pag) {
        this.pag = pag;
    }

    public List<Produto> getProdutosVendido() {
        return produtosVendido;
    }

    public void setProdutosVendido(List<Produto> produtosVendido) {
        this.produtosVendido = produtosVendido;
    }

    public tipoPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(tipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}