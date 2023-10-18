package Menu;

import static controleProdutos.CadastroMedicamento.cadastrarMedicamento;
import static controleProdutos.CadastroMedicamentoControlavel.cadastroMedicamentoControlavel;
import static controleProdutos.CadastroMedicamentoInjetavel.cadastroMedicamentoInjetavel;
import util.Input;

public class MenuSecundarioProduto {

    public static void menuSecundarioProduto() {
        boolean travaTela = true;
        do {
            System.out.println("|----------------------------------|");
            System.out.println("|1. Cadastro Medicamento           |");
            System.out.println("|2. Cadastro Medicamento Controlado|");
            System.out.println("|3. Cadastro Medicamento Injetavel |");
            System.out.println("|0. Retornar                       |");
            System.out.println("|----------------------------------|");
            System.out.print("|-> ");
            int op = Input.nextInt();

            switch (op) {
                case 1:
                    cadastrarMedicamento();
                    break;
                case 2:
                    cadastroMedicamentoControlavel();
                    break;
                case 3:
                    cadastroMedicamentoInjetavel();
                    break;
                case 0:
                    travaTela = false;
                    System.out.println("Retornando...");
                    break;

                default:
                    System.out.println("Opcao Invalida!!!");
                    ;
                    break;
            }
        } while (travaTela);
    }

}
