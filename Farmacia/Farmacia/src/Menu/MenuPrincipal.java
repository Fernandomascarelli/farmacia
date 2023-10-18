package Menu;

import static controlePessoas.CadastroCliente.cadastrarCliente;
import static controlePessoas.CadastroFuncionario.cadastrarFuncionario;
import util.Input;

public class MenuPrincipal {

    public static void menuPrincipal() {
        boolean travaTela = true;
        do {
            System.out.println("|------------------------|");
            System.out.println("|1. Cadastro Cliente     |");
            System.out.println("|2. Cadastro Funcionario |");
            System.out.println("|3. Cadastro Produto     |");
            System.out.println("|0. Sair                 |");
            System.out.println("|------------------------|");
            System.out.print("|-> ");
            int num = Input.nextInt();

            switch (num) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarFuncionario();
                    break;
                case 3:
                    MenuSecundarioProduto.menuSecundarioProduto();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    travaTela = false;
                    break;
                default:
                    System.out.println("Opcao Invalida!!!");
                    break;
            }

        } while (travaTela);
    }
}
