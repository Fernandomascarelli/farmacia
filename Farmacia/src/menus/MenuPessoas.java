package menus;

import static menus.MenuClientes.menuClientes;
import static menus.MenuFuncionarios.menuFuncionarios;
import util.Input;

public class MenuPessoas {

    public static void menuPessoa() {
        boolean travaTela = true;
        do {
            System.out.println("|--<Menu Pessoas>--|");
            System.out.println("|1. Cliente        |");
            System.out.println("|2. Funcionario    |");
            System.out.println("|0. Retornar       |");
            System.out.println("|--<Menu Pessoas>--|");
            System.out.print("|-> ");
            int op = Input.nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    menuClientes();
                    break;
                case 2:
                    menuFuncionarios();
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
