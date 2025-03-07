package caixa;

import java.util.Scanner;

public class Venda extends Caixa{
    //classe venda sera sera extenção de Caixa para fazer interações com seu valor

    Scanner sc = new Scanner(System.in);

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

            saldo = saldo + valorTotal;
            valorTotal = 0;

        }else if(pag == tipoPagamento.Cartao){

            saldo =  saldo + valorTotal;
            valorTotal = 0;

        }else if(pag == tipoPagamento.Dinheiro){

            System.out.println("digite o valor que estrergara");

            double valorPago = sc.nextInt();

            if (valorPago < valorTotal){
                System.out.println("o valor que inseriu e insuficiente");
            } else if (valorPago == valorTotal) {
                saldo = saldo + valorTotal;
                valorTotal = 0;
            }else if (valorPago > valorTotal){
                saldo = saldo + valorTotal;
                double troco = valorTotal - valorPago;
                valorTotal = 0;
                System.out.println("voce tem "+ troco + " de troco");
            }



        }
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
}