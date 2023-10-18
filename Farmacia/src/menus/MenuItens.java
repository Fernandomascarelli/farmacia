package menus;

import modeloVendas.ItemVenda;
import util.Input;

public class MenuItens {
    public static void menuItens(){
        boolean travaTela = true;
        do {            
            System.out.println("|-----<Itens>------|");
            System.out.println("|1. Produto        |");
            System.out.println("|2. Med Controlado |");
            System.out.println("|3. Med Injetavel  |");
            System.out.println("|4. Medicamento    |");
            System.out.println("|5. Exibir Carrinho|");
            System.out.println("|6. Retirar Item   |");
            System.out.println("|0. Retornar       |");
            System.out.println("|-----<Itens>------|");
            System.out.print("|->");
            int op = Input.nextInt();
            switch (op) {
                case 1:
                    MenuProduto.menuProduto();
                    break;
                    case 2:
                    MenuMedicamentoControlado.menuMedicamentoControlado();
                    break;
                    case 3:
                    MenuMedicamentoInjetavel.menuMedicamentoInjetavel();
                    break;
                    case 4:
                    MenuMedicamento.menuMedicamento();
                    break;
                    case 5:
                        ItemVenda.exibirCarrinho();
                        break;
                    case 6:
                        System.out.println("Digite o codigo do item: ");
                        int ed = Input.nextInt();
                        ItemVenda.excluirItemCarrinho(ed);
                        break;
                    case 0:
                    travaTela = false;
                            System.out.println("Retornando...");
                    break;
                    
                default:
                    System.out.println("Opcao Invalida!!");
            }
            
            
            
        } while (travaTela);
    }
}
