package menus;

import controleProdutos.CadastroMedicamentoInjetavel;

import util.Input;

public class MenuMedicamentoInjetavel {
    public static void menuMedicamentoInjetavel() {
        boolean travaTela = true;
        do {
            System.out.println("|-<Medicamentos Injetaveis>-|");
            System.out.println("|1. Cadastrar               |");
            System.out.println("|2. Exibir                  |");
            System.out.println("|3. Excluir                 |");
            System.out.println("|4. Comprar                 |");
            System.out.println("|0. Retornar                |");
            System.out.println("|-<Medicamentos Injetaveis>-|");
            System.out.print("|-> ");
            int op = Input.nextInt();
            System.out.println("");

            switch (op) {
                case 1:
                    CadastroMedicamentoInjetavel.cadastroMedicamentoInjetavel();
                    break;
                case 2:
                    CadastroMedicamentoInjetavel.exibirMedicamentosInjetaveis();
                    break;
                case 3:
                    System.out.println("Digite o codigo do medicamento injetavel: ");
                    int codigo = Input.nextInt();
                    CadastroMedicamentoInjetavel.excluirMedicamentoInjetavel(codigo);
                    
                    break;
                case 4: 
                    System.out.println("Digite o codigo do medicamento injetavel: ");
                    int esc = Input.nextInt();
                    CadastroMedicamentoInjetavel.compraMedicamentoInjetavel(esc);
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
