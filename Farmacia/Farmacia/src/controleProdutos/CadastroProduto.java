package controleProdutos;

import modeloProdutos.Produto;
import static modeloProdutos.Produto.produtos;
import util.Input;

public class CadastroProduto {
    protected static void setarDadosProduto(Produto p){
        System.out.print("Digite o codigo do produto: ");
        p.setCodigo(Input.nextInt());
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
    
    protected static void exibirInformacoesProduto(Produto p){
        System.out.println("Codigo: " + p.getCodigo());
        System.out.println("Descricao: " + p.getDescricao());
        System.out.println("Marca: " + p.getMarca());
        System.out.println("Lote: " + p.getLote());
        System.out.println("Data fabricacao: " + p.getDataFabricacao());
        System.out.println("Data vencimento: " + p.getDataVencimento());
        System.out.println("Codigo de barras: " + p.getCodigoBarras());
        System.out.println("Valor: " + p.getValor());
    }
    
    public static void cadastrarProdutos(){
        Produto p = new Produto();
        setarDadosProduto(p);
        produtos.add(p);
        exibirInformacoesProduto(p);
    }
}
