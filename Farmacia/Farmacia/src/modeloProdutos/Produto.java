package modeloProdutos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Produto {
    protected int codigo;
    protected String descricao;
    protected String marca;
    protected String lote;
    protected LocalDate dataFabricacao;
    protected LocalDate dataVencimento;
    protected String codigoBarras;
    protected double valor;
    public static ArrayList<Produto> produtos = new ArrayList<>();
    
    
    public Produto(){
        
    }

    public Produto(int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.marca = marca;
        this.lote = lote;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", marca=" + marca + ", lote=" + lote + ", dataFabricacao=" + dataFabricacao + ", dataVencimento=" + dataVencimento + ", codigoBarras=" + codigoBarras + ", valor=" + valor + '}';
    }
    
    
}
