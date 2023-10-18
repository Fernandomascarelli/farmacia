package controlePessoas;
import modeloPessoas.Pessoa;
import util.Input;

public class CadastroPessoa {
    protected static void setarDadosPessoa(Pessoa p){
        System.out.println("");
        System.out.println("<Cadastro Pessoal>");
        System.out.print("Digite seu codigo: ");
        p.setCodigo(Input.nextInt());
        System.out.print("Digite seu nome: ");
        p.setNome(Input.nextLine());
        System.out.print("Digite seu cpf: ");
        p.setCpf(Input.nextLine());
        System.out.print("Digite sua data de nascimento: ");
        p.setDataNascimento(Input.nextLocalDate());
    } 
    
    protected static void exibirInformacoesPessoa(Pessoa p){
        System.out.println("<Informacoes Pessoais>");
        System.out.println("Codigo: " + p.getCodigo());
        System.out.println("Nome: " + p.getNome());
        System.out.println("CPF: " + p.getCpf());
        System.out.println("Data Nascimento: " + p.getDataNascimento());
    }
    
    
}
