package vendas;

public enum tipoPagamento {
    CARTAO(1),DINHEIRO(2),PIX(3);

    public int valor;
    tipoPagamento(int valor){
        valor = valor;
    }
}