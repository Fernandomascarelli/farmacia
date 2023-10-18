package modeloProdutos;

import java.time.LocalDate;
import java.util.ArrayList;

public class MedicamentoControlavel extends Medicamento{
    protected String crmMedico;
    protected String cpfPaciente;
    public static ArrayList<MedicamentoControlavel> medicamentosControlaveis = new ArrayList<>(); 

    public MedicamentoControlavel() {
    }

    public MedicamentoControlavel(String crmMedico, String cpfPaciente) {
        this.crmMedico = crmMedico;
        this.cpfPaciente = cpfPaciente;
    }

    public MedicamentoControlavel(String crmMedico, String cpfPaciente, int numRegistroAnvisa, String composicao, double dosagem) {
        super(numRegistroAnvisa, composicao, dosagem);
        this.crmMedico = crmMedico;
        this.cpfPaciente = cpfPaciente;
    }

    public MedicamentoControlavel(String crmMedico, String cpfPaciente, int numRegistroAnvisa, String composicao, double dosagem, int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, double valor) {
        super(numRegistroAnvisa, composicao, dosagem, codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor);
        this.crmMedico = crmMedico;
        this.cpfPaciente = cpfPaciente;
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    @Override
    public String toString() {
        return "<Medicamento Controlavel>" + 
                super.toString() + " " +
                "CRM do medico: " + getCrmMedico() + " " + 
                "Cpf do paciente: " + getCpfPaciente() + "\n";
    }
    
    
    
    
}
