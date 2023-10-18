package modeloProdutos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medicamento extends Produto{
    protected int numRegistroAnvisa;
    protected String composicao;
    protected double dosagem;
    public static ArrayList<Medicamento> medicamentos = new ArrayList<>(); 
    
    
    public Medicamento() {
    }

    public Medicamento(int numRegistroAnvisa, String composicao, double dosagem) {
        this.numRegistroAnvisa = numRegistroAnvisa;
        this.composicao = composicao;
        this.dosagem = dosagem;
    }

    public Medicamento(int numRegistroAnvisa, String composicao, double dosagem, int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, double valor) {
        super(codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor);
        this.numRegistroAnvisa = numRegistroAnvisa;
        this.composicao = composicao;
        this.dosagem = dosagem;
    }

    public int getNumRegistroAnvisa() {
        return numRegistroAnvisa;
    }

    public void setNumRegistroAnvisa(int numRegistroAnvisa) {
        this.numRegistroAnvisa = numRegistroAnvisa;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }
    
    
}
