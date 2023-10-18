package menus;

import controleProdutos.CadastroMedicamento;

import util.Input;

public class MenuMedicamento {
    public static void menuMedicamento() {
        boolean travaTela = true;
        do {
            System.out.println("|---<Medicamentos>---|");
            System.out.println("|1. Cadastrar        |");
            System.out.println("|2. Exibir           |");
            System.out.println("|3. Excluir          |");
            System.out.println("|4. Comprar          |");
            System.out.println("|0. Retornar         |");
            System.out.println("|---<Medicamentos>---|");
            System.out.print("|-> ");
            int op = Input.nextInt();
            System.out.println("");

            switch (op) {
                case 1:
                    CadastroMedicamento.cadastrarMedicamento();
                    break;
                case 2:
                    CadastroMedicamento.exibirMedicamentos();
                    break;
                case 3:
                    System.out.println("Digite o codigo do medicamento: ");
                    int codigo = Input.nextInt();
                    CadastroMedicamento.excluirMedicamento(codigo);
                   
                    break;
                    case 4: 
                    System.out.println("Digite o codigo do medicamento: ");
                    int esc = Input.nextInt();
                        CadastroMedicamento.compraMedicamento(esc);
                        
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
