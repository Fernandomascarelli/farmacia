package controleProdutos;

import static controleProdutos.CadastroMedicamento.exibirInformacoesMedicamento;
import static controleProdutos.CadastroMedicamento.setarDadosMedicamento;
import modeloProdutos.MedicamentoInjetavel;
import static modeloProdutos.MedicamentoInjetavel.medicamentosInjetaveis;
import util.Input;

public class CadastroMedicamentoInjetavel{
    protected static void setarDadosMedicamentosInjetaveis(MedicamentoInjetavel mi){
        setarDadosMedicamento(mi);
        System.out.print("Digite o nome do funcionario responsavel: ");
        mi.setFuncionarioResponsavel(Input.nextLine());
        System.out.print("Digite o cpf do paciente: ");
        mi.setCpfPaciente(Input.nextLine());
    }
    
    protected static void exibirInformacoesMedicamentosInjetaveis(MedicamentoInjetavel mi){
        exibirInformacoesMedicamento(mi);
        System.out.println("Nome do funcionario responsavel: " + mi.getFuncionarioResponsavel());
        System.out.println("CPF do paciente: " + mi.getCpfPaciente());
    }
    
    public static MedicamentoInjetavel cadastroMedicamentoInjetavel(){
        MedicamentoInjetavel mi = new MedicamentoInjetavel();
        setarDadosMedicamentosInjetaveis(mi);
        medicamentosInjetaveis.add(mi);
        exibirInformacoesMedicamentosInjetaveis(mi);
        return mi;
    }
    
}
