package menus;

import static controlePessoas.CadastroCliente.cadastrarCliente;
import static controlePessoas.CadastroCliente.excluirCliente;
import static controlePessoas.CadastroCliente.exibirClientes;
import util.Input;

public class MenuClientes {
    public static void menuClientes(){
        boolean travaTela = true;
        do {       
            System.out.println("|----<Clientes>----|");
            System.out.println("|1. Cadastro       |");
            System.out.println("|2. Exibir         |");
            System.out.println("|3. Excluir        |");
            System.out.println("|0. Retornar       |");
            System.out.println("|----<Clientes>----|");
            System.out.print("|-> ");
            int op = Input.nextInt();
            System.out.println("");
            
            switch (op) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    exibirClientes();
                    break;
                case 3:
                    System.out.println("Digite o codigo do cliente: ");
                    int codigoCliente = Input.nextInt();
                    excluirCliente(codigoCliente);
                    break;
                case 0:
                    travaTela = false;
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opcao Invalida!!!");
            }
        } while (travaTela);
    }
}
