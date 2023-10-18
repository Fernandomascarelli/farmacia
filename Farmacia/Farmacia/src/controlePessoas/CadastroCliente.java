package controlePessoas;

import static controlePessoas.CadastroPessoa.setarDadosPessoa;
import modeloPessoas.Cliente;
import static modeloPessoas.Cliente.clientes;
import util.Input;


public class CadastroCliente {
    protected static void setarDadosCliente(Cliente c){
        setarDadosPessoa(c);
        System.out.println("Digite seu email: ");
        c.setEmail(Input.nextLine());
    }
    
    protected static void exibirInformacoes(Cliente c){
        System.out.println("Codigo: " + c.getCodigo());
        System.out.println("Nome: " + c.getNome());
        System.out.println("CPF: " + c.getCpf());
        System.out.println("Data Nascimento: " + c.getDataNascimento());
        System.out.println("Email: " + c.getEmail());
    }
    
    public static Cliente cadastrarCliente(){
        Cliente c = new Cliente();
        setarDadosCliente(c);
        clientes.add(c);
        exibirInformacoes(c);
        return c;
    }
    
    
}
