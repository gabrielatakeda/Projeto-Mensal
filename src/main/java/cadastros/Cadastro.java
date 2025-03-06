package cadastros;

import interfaces.ICadastro;
import produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Cadastro implements ICadastro {
    private List<Produto> produtos = new ArrayList<>();


    //essa classe pegou OBRIGATORIAMENTE os metodos definidos na interface
    //entao essa classe sera responsavel em cadastrar e remover produtos, alem de trazer uma listagem completa de todos produtos
    @Override
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void rmvProduto(String nomeProduto) {
        produtos.removeIf(produto -> produto.getNomeProduto().equalsIgnoreCase(nomeProduto));
    }

    @Override
    public void listProdutos() {

    }
}
