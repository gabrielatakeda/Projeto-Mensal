package vendas;

import cadastros.Cadastro;
import produtos.Produto;

import java.util.List;
import java.util.Scanner;

public class Venda{
    //classe venda sera sera extenção de Caixa para fazer interações com seu valor
    private List<Produto> produtoVendido;
    private tipoPagamento pagamento;
    private double total;

    Scanner sc = new Scanner(System.in);

    public Venda(List<Produto> produtoVendido, tipoPagamento pagamento) {
        this.produtoVendido = produtoVendido;
        this.pagamento = pagamento;
        calcularTotal();
    }
    public Venda(){

    }

    private void calcularTotal() {
        for (Produto produto : produtoVendido) {
            total += produto.getPrecoVenda();
        }
    }

    public void realizarVenda(Cadastro cadastro) {

        System.out.println("Total da compra: " + total);
        System.out.println("Escolha o método de pagamento (PIX, CARTAO, DINHEIRO): ");
        String pag = sc.nextLine().toUpperCase();

        try{
            tipoPagamento escolhido = tipoPagamento.valueOf(pag);
            System.out.println("Voce escolheu: " + escolhido);
            System.out.println("PAGAMENTO FINALIZADO COM SUCESSO!");
        }catch (IllegalArgumentException e){
            System.out.println("Metodo de pagamento invalido! Tente novamente.");
        }
    }

    public void addVenda(Cadastro cadastro, List<Produto> produtoVendido) {
//        List<Produto> produtoVendido = new ArrayList<>();
        System.out.print("Nome do produto para venda: ");
        String nomeProduto = sc.nextLine();
        Produto produto = cadastro.buscarProduto(nomeProduto);

        if (produto != null) {
            System.out.print("Quantidade vendida: ");
            int quantidadeVendida = sc.nextInt();
            sc.nextLine();

            if (quantidadeVendida <= produto.getQuantidade()) {
                produto.reduzirQuantidade(quantidadeVendida);
                total += (quantidadeVendida * produto.getPrecoVenda());
                produtoVendido.add(produto);

                System.out.println("Deseja adicionar mais produtos? (s/n): ");
                if (sc.nextLine().equalsIgnoreCase("s")) {
                    addVenda(cadastro, produtoVendido); // Chama recursivamente

                }else {
                    realizarVenda(cadastro);
                }
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}