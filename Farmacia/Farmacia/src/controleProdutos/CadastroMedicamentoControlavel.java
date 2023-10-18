package controleProdutos;

import static controleProdutos.CadastroMedicamento.exibirInformacoesMedicamento;
import static controleProdutos.CadastroMedicamento.setarDadosMedicamento;
import modeloProdutos.MedicamentoControlavel;
import static modeloProdutos.MedicamentoControlavel.medicamentosControlaveis;
import util.Input;

public class CadastroMedicamentoControlavel {
    protected static void setarDadosMedicamentoControlavel(MedicamentoControlavel mc){
        setarDadosMedicamento(mc);
        System.out.println("Digite o CRM do medico:");
        mc.setCrmMedico(Input.nextLine());
        System.out.println("Digite o cpf do paciente:");
        mc.setCpfPaciente(Input.nextLine());
    }
    protected static void exibirInformacoesMedicamentosControlaveis(MedicamentoControlavel mc){
        exibirInformacoesMedicamento(mc);
        System.out.println("CRM do medico: " + mc.getCrmMedico());
        System.out.println("CPF do paciente: " + mc.getCpfPaciente());
    }
    public static MedicamentoControlavel cadastroMedicamentoControlavel(){
        MedicamentoControlavel mc = new MedicamentoControlavel();
        setarDadosMedicamentoControlavel(mc);
        medicamentosControlaveis.add(mc);
        exibirInformacoesMedicamentosControlaveis(mc);
        return mc;
    }
}
