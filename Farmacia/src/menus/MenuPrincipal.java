package menus;

import util.Input;

public class MenuPrincipal {

    public static void menuPrincipal() {
        boolean travaTela = true;
        do {
            System.out.println("|--<Menu Principal>--|");
            System.out.println("|1. Pessoas          |");
            System.out.println("|2. Itens            |");
            System.out.println("|3. Vendas           |");
            System.out.println("|0. Sair             |");
            System.out.println("|--<Menu Principal>--|");
            System.out.print("|-> ");
            int num = Input.nextInt();
            System.out.println("");
            switch (num) {
                case 1:
                    MenuPessoas.menuPessoa();
                    break;

                case 2:
                    MenuItens.menuItens();
                    break;
                case 3:
                    MenuVenda.menuVenda();
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
