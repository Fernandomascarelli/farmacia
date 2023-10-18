package controlePessoas;

import static controlePessoas.CadastroPessoa.setarDadosPessoa;
import modeloPessoas.Funcionario;
import static modeloPessoas.Funcionario.funcionarios;
import util.Input;

public class CadastroFuncionario {
    protected static void setarDadosFuncionario(Funcionario f){
        setarDadosPessoa(f);
        System.out.println("Digite seu ctps: ");
        f.setCtps(Input.nextLine());
    }
    
    protected static void exibirInformacoes(Funcionario f){
        System.out.println("Codigo: " + f.getCodigo());
        System.out.println("Nome: " + f.getNome());
        System.out.println("CPF: " + f.getCpf());
        System.out.println("Data Nascimento: " + f.getDataNascimento());
        System.out.println("Ctps: " + f.getCtps());
    }
    
    public static Funcionario cadastrarFuncionario(){
        Funcionario f = new Funcionario();
        setarDadosFuncionario(f);
        funcionarios.add(f);
        exibirInformacoes(f);
        return f;
    }
}
