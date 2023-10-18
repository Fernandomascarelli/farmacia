package controlePessoas;

import static controlePessoas.CadastroPessoa.exibirInformacoesPessoa;
import static controlePessoas.CadastroPessoa.setarDadosPessoa;
import modeloPessoas.Funcionario;
import static modeloPessoas.Funcionario.funcionarios;
import util.Input;

public class CadastroFuncionario {
    protected static void setarDadosFuncionario(Funcionario f){
        setarDadosPessoa(f);
        System.out.print("Digite seu ctps: ");
        f.setCtps(Input.nextLine());
        System.out.println("<Cadastro Pessoal>");
        System.out.println("");
    }
    
    protected static void exibirInformacoesFuncionario(Funcionario f){
        exibirInformacoesPessoa(f);
        System.out.println("Ctps: " + f.getCtps());
        System.out.println("<Informacoes Pessoais>");
        System.out.println("");
    }
    
    public static Funcionario cadastrarFuncionario(){
        Funcionario f = new Funcionario();
        setarDadosFuncionario(f);
        funcionarios.add(f);
        exibirInformacoesFuncionario(f);
        return f;
    }
    
    public static void exibirFuncionario(){
        if (funcionarios.isEmpty()) {
            System.out.println("A lista de funcionarios esta vazia!");
        } else {
            for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }
        }
        
    }
    public static void excluirFuncionario(int codigo) {
    Funcionario funcionarioRemovido = null;
    for (Funcionario cliente : funcionarios) {
        if (cliente.getCodigo() == codigo) {
            funcionarioRemovido = cliente;
            break;
        }
    }
    
    if (funcionarioRemovido != null) {
        funcionarios.remove(funcionarioRemovido);
        System.out.println("Funcionario removido com sucesso!");
    } else {
        System.out.println("Funcionario nao encontrado!");
    }
}
}
