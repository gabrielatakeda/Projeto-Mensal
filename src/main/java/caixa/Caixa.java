package caixa;

public class Caixa {

    protected double saldo;

    //função para adicionar mais valor no caixa
    public void depositar(int valor){
        saldo += valor;
        System.out.println("Deposito realizado de: " + valor);
    }

    //construtores getters e setters

    public Caixa(){

    }

    public Caixa(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



}