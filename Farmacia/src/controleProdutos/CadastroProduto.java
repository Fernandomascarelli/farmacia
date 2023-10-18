package controleProdutos;

import java.util.ArrayList;
import modeloProdutos.Produto;
import static modeloProdutos.Produto.produtos;
import modeloVendas.ItemVenda;
import static modeloVendas.ItemVenda.carrinho;
import modeloVendas.Venda;
import util.Input;

public class CadastroProduto {

    public static ArrayList<Produto> tudo = new ArrayList<>();
    public static ArrayList<Double> descontos = new ArrayList<>();
    public static ArrayList<Double> valorestotais = new ArrayList<>();
    public static ArrayList<Double> valoresSemDesconto = new ArrayList<>();
    private static int ultimoCod = 0;

    protected static void setarDadosProduto(Produto p) {
        int novoCod = ultimoCod + 1;
        p.setCodigo(novoCod);
        ultimoCod = novoCod;
        System.out.print("Digite o nome do produto: ");
        p.setDescricao(Input.nextLine());
        System.out.print("Digite a marca do produto: ");
        p.setMarca(Input.nextLine());
        System.out.print("Digite o lote do produto: ");
        p.setLote(Input.nextLine());
        System.out.print("Digite a data de fabricacao do produto: ");
        p.setDataFabricacao(Input.nextLocalDate());
        System.out.print("Digite a data de validade do produto: ");
        p.setDataVencimento(Input.nextLocalDate());
        System.out.print("Digite o codigo de barras do produto: ");
        p.setCodigoBarras(Input.nextLine());
        System.out.print("Digite o valor do produto: ");
        p.setValor(Input.nextDouble());
    }

    protected static void exibirInformacoesProduto(Produto p) {
        System.out.println("Codigo: " + p.getCodigo());
        System.out.println("Descricao: " + p.getDescricao());
        System.out.println("Marca: " + p.getMarca());
        System.out.println("Lote: " + p.getLote());
        System.out.println("Data fabricacao: " + p.getDataFabricacao());
        System.out.println("Data vencimento: " + p.getDataVencimento());
        System.out.println("Codigo de barras: " + p.getCodigoBarras());
        System.out.println("Valor: " + p.getValor());
    }

    public static void cadastrarProdutos() {
        Produto p = new Produto();
        setarDadosProduto(p);
        produtos.add(p);
        tudo.add(p);
        exibirInformacoesProduto(p);
    }

    public static void exibirProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Lista de produtos esta vazia!");
        } else {
            for (Produto produto : produtos) {
                System.out.println("<Produtos>");
                System.out.println(produto);
            }
        }

    }

    public static void excluirProduto(int codigo) {
        Produto produtoRemovido = null;
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produtoRemovido = produto;
                break;
            }
        }

        if (produtoRemovido != null) {
            produtos.remove(produtoRemovido);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto nao encontrado!");
        }
    }

    public static void compraProduto(int codigo) {
        Produto produto = null;
        for (Produto p : Produto.produtos) {
            if (p.getCodigo() == codigo) {
                produto = p;
                break;
            }
        }

        if (produto == null) {
            System.out.println("Produto nao encontrado.");
            return;
        }

        System.out.println("Produto selecionado: " + produto.getDescricao());
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = Input.nextInt();

        double valorUnitario = produto.getValor();
        double auxiliarValor = valorUnitario * quantidade;
        valoresSemDesconto.add(auxiliarValor);
        
        double valorTotal = valorUnitario * quantidade;
        
        double valorDesconto = valorTotal * 0.05;
        double valorComDesconto = valorTotal - valorDesconto;
        descontos.add(valorDesconto);
        valorestotais.add(valorComDesconto);
        
        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setProduto(produto);
        itemVenda.setQuantidade(quantidade);
        itemVenda.setValorUnitario(valorUnitario);
        itemVenda.setValorTotal(valorComDesconto);

        Venda.itens.add(itemVenda);
        carrinho.add(itemVenda);
        System.out.println("Produto adicionado ao carrinho.");
    }
    
    

}
