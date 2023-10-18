package menus;

import modeloVendas.Venda;
import util.Input;

public class MenuVenda {
    public static void menuVenda(){
        boolean travaTela = true;
        
        do {     
            System.out.println("|------<Vendas>-------|");
            System.out.println("|1. Finalizar Comprar |");
            System.out.println("|2. Procurar Venda    |");
            System.out.println("|0. Retornar          |");
            System.out.println("|------<Vendas>-------|");
            System.out.print("|-> ");
            int num = Input.nextInt();
            
            switch (num) {
                case 1:
                    Venda.fecharCompra();
                    break;
                case 2:
                    System.out.print("Digite o codigo da venda: ");
                    int codigo = Input.nextInt();
                    Venda.procurarVenda(codigo);
                    break;
                case 0:
                    System.out.println("Retornando...");
                    travaTela = false;
                    break;
                default:
                    System.out.println("Opcao Invalida!!");
            }
        } while (travaTela);
        
    }
}
