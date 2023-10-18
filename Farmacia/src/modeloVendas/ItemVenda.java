package modeloVendas;

import java.util.ArrayList;
import modeloProdutos.Medicamento;
import modeloProdutos.MedicamentoControlavel;
import modeloProdutos.MedicamentoInjetavel;
import modeloProdutos.Produto;

public class ItemVenda {

    protected Produto produto;
    protected Medicamento medicamento;
    protected MedicamentoControlavel medicamentoControlavel;
    protected MedicamentoInjetavel medicamentoInjetavel;
    protected int quantidade;
    protected double valorUnitario;
    protected double valorTotal;
    public static ArrayList<ItemVenda> carrinho = new ArrayList<>();

    public ItemVenda() {
    }

    public ItemVenda(MedicamentoInjetavel medicamentoInjetavel, MedicamentoControlavel medicamentoControlavel, Medicamento medicamento, Produto produto, int quantidade, double valorUnitario, double valorTotal) {
        this.medicamento = medicamento;
        this.medicamentoControlavel = medicamentoControlavel;
        this.medicamentoInjetavel = medicamentoInjetavel;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public MedicamentoControlavel getMedicamentoControlavel() {
        return medicamentoControlavel;
    }

    public void setMedicamentoControlavel(MedicamentoControlavel medicamentoControlavel) {
        this.medicamentoControlavel = medicamentoControlavel;
    }

    public MedicamentoInjetavel getMedicamentoInjetavel() {
        return medicamentoInjetavel;
    }

    public void setMedicamentoInjetavel(MedicamentoInjetavel medicamentoInjetavel) {
        this.medicamentoInjetavel = medicamentoInjetavel;
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

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public static void exibirCarrinho() {
        if (carrinho.isEmpty()) {
            System.out.println("Carrinho esta vazio!");
        } else {
            System.out.println("Itens no carrinho:");

            for (ItemVenda item : carrinho) {
                System.out.println("----------------------------------------");
                System.out.println("Item: " + item.getProduto().getDescricao());
                System.out.println("Quantidade: " + item.getQuantidade());
                System.out.println("Valor Unitario: " + item.getValorUnitario());
                System.out.println("Valor Total: " + item.getValorTotal());
                System.out.println("----------------------------------------");
            }
        }
    }
    
    
    
    public static void excluirItemCarrinho(int codigo) {
    for (int i = 0; i < carrinho.size(); i++) {
        ItemVenda item = carrinho.get(i);
        if (item.getProduto().getCodigo() == codigo) {
            carrinho.remove(i);
            System.out.println("Item removido do carrinho.");
            return; 
        }
    }
    System.out.println("Item nao encontrado no carrinho.");
}
    
    @Override
    public String toString(){
        return "Item Venda: \n" + produto + "\n" + medicamento + "\n" + medicamentoControlavel + "\n" + medicamentoInjetavel + "\n";
    }


}
