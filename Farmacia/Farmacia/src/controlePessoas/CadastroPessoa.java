package controlePessoas;
import modeloPessoas.Pessoa;
import util.Input;

public class CadastroPessoa {
    protected static void setarDadosPessoa(Pessoa p){
        System.out.println("Digite seu codigo: ");
        p.setCodigo(Input.nextInt());
        System.out.println("Digite seu nome: ");
        p.setNome(Input.nextLine());
        System.out.println("Digite seu cpf: ");
        p.setCpf(Input.nextLine());
        System.out.println("Digite sua data de nascimento: ");
        p.setDataNascimento(Input.nextLocalDate());
    } 
}
