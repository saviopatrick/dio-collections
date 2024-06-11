package Set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    Set<Produto> produtoSet;

    public CadastroProduto() {
        produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int codigo,String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo,nome,preco,quantidade));
    }

    public Set<Produto> exibirProdutoNome() {
        Set<Produto> produtosPorNome = new TreeSet<>();
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparetorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }



}
