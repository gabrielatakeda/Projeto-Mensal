package caixa;

public enum tipoPagamento {
    Cartao(1),Dinheiro(2),Pix(3);

    public int valor;
    tipoPagamento(int valor){
        valor = valor;
    }
}