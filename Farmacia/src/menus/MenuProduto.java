package menus;

import controleProdutos.CadastroProduto;
import static controleProdutos.CadastroProduto.cadastrarProdutos;
import static controleProdutos.CadastroProduto.excluirProduto;
import static controleProdutos.CadastroProduto.exibirProdutos;
import util.Input;

public class MenuProduto {

    public static void menuProduto() {
        boolean travaTela = true;
        do {
            System.out.println("|---<Produtos>---|");
            System.out.println("|1. Cadastrar    |");
            System.out.println("|2. Exibir       |");
            System.out.println("|3. Excluir      |");
            System.out.println("|4. Comprar      |");
            System.out.println("|0. Retornar     |");
            System.out.println("|---<Produtos>---|");
            System.out.print("|-> ");
            int op = Input.nextInt();
            System.out.println("");

            switch (op) {
                case 1:
                    cadastrarProdutos();
                    break;
                case 2:
                    exibirProdutos();
                    break;
                case 3:
                    System.out.println("Digite o codigo do produto: ");
                    int codigo = Input.nextInt();
                    excluirProduto(codigo);
                    
                    break;
                case 4:
                    System.out.println("Digite o codigo do produto: ");
                    int esc = Input.nextInt();
                    CadastroProduto.compraProduto(esc);
                    break;
                case 0:
                    travaTela = false;
                    System.out.println("Retornando...");
                    break;

                default:
                    System.out.println("Opcao Invalida!!!");

                    break;
            }
        } while (travaTela);
    }
}
