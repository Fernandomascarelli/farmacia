package controlePessoas;

import static controlePessoas.CadastroPessoa.exibirInformacoesPessoa;
import static controlePessoas.CadastroPessoa.setarDadosPessoa;
import modeloPessoas.Cliente;
import static modeloPessoas.Cliente.clientes;
import util.Input;

public class CadastroCliente {

    protected static void setarDadosCliente(Cliente c) {

        setarDadosPessoa(c);
        System.out.print("Digite seu email: ");
        c.setEmail(Input.nextLine());
        System.out.println("<Cadastro Pessoal>");
        System.out.println("");
    }

    protected static void exibirInformacoesCliente(Cliente c) {
        exibirInformacoesPessoa(c);
        System.out.println("Email: " + c.getEmail());
        System.out.println("<Informacoes Pessoais>");
        System.out.println("");
    }

    public static Cliente cadastrarCliente() {
        Cliente c = new Cliente();
        setarDadosCliente(c);
        clientes.add(c);
        exibirInformacoesCliente(c);
        return c;
    }

    public static void exibirClientes() {
        if (clientes.isEmpty()) {
            System.out.println("A lista de clientes esta vazia!");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }

    }

    public static void excluirCliente(int codigo) {
        Cliente clienteRemovido = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                clienteRemovido = cliente;
                break;
            }
        }

        if (clienteRemovido != null) {
            clientes.remove(clienteRemovido);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente nao encontrado!");
        }
    }

}
