package modeloProdutos;


import java.time.LocalDate;
import java.util.ArrayList;

public class MedicamentoInjetavel extends Medicamento{
    protected String funcionarioResponsavel;
    protected String cpfPaciente;
    public static ArrayList<MedicamentoInjetavel> medicamentosInjetaveis = new ArrayList<>();
    public MedicamentoInjetavel() {
    }

    public MedicamentoInjetavel(String funcionarioResponsavel, String cpfPaciente) {
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.cpfPaciente = cpfPaciente;
    }

    public MedicamentoInjetavel(String funcionarioResponsavel, String cpfPaciente, int numRegistroAnvisa, String composicao, double dosagem) {
        super(numRegistroAnvisa, composicao, dosagem);
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.cpfPaciente = cpfPaciente;
    }

    public MedicamentoInjetavel(String funcionarioResponsavel, String cpfPaciente, int numRegistroAnvisa, String composicao, double dosagem, int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, double valor) {
        super(numRegistroAnvisa, composicao, dosagem, codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor);
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.cpfPaciente = cpfPaciente;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }
    
    
    
}
