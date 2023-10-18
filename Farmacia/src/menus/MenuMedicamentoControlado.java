package menus;

import controleProdutos.CadastroMedicamentoControlavel;

import util.Input;

public class MenuMedicamentoControlado {
    public static void menuMedicamentoControlado() {
        boolean travaTela = true;
        do {
            System.out.println("|-<Medicamentos Controlados>-|");
            System.out.println("|1. Cadastrar                |");
            System.out.println("|2. Exibir                   |");
            System.out.println("|3. Excluir                  |");
            System.out.println("|4. Comprar                  |");
            System.out.println("|0. Retornar                 |");
            System.out.println("|-<Medicamentos Controlados>-|");
            System.out.print("|-> ");
            int op = Input.nextInt();
            System.out.println("");

            switch (op) {
                case 1:
                    CadastroMedicamentoControlavel.cadastroMedicamentoControlavel();
                    break;
                case 2:
                    CadastroMedicamentoControlavel.exibirMedicamentosControlaveis();
                    break;
                case 3:
                    System.out.println("Digite o codigo do medicamento controlavel: ");
                    int codigo = Input.nextInt();
                    CadastroMedicamentoControlavel.excluirMedicamentoControlavel(codigo);
                    
                    break;
                    case 4: 
                    System.out.println("Digite o codigo do medicamento controlavel: ");
                    int esc = Input.nextInt();
                        CadastroMedicamentoControlavel.compraMedicamentoControlado(esc);
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
