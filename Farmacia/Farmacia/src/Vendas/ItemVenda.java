package Vendas;

import modeloProdutos.Produto;

public class ItemVenda {
    protected Produto produto;
    protected int quantidade;
    protected String valorUnitario;
    protected String valorTotal;

    public ItemVenda() {
    }

    public ItemVenda(Produto produto, int quantidade, String valorUnitario, String valorTotal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
