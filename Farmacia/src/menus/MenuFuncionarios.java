package menus;

import static controlePessoas.CadastroFuncionario.cadastrarFuncionario;
import static controlePessoas.CadastroFuncionario.excluirFuncionario;
import static controlePessoas.CadastroFuncionario.exibirFuncionario;
import util.Input;

public class MenuFuncionarios {
    public static void menuFuncionarios(){
        boolean travaTela = true;
        do {       
            System.out.println("|--<Funcionarios>--|");
            System.out.println("|1. Cadastro       |");
            System.out.println("|2. Exibir         |");
            System.out.println("|3. Excluir        |");
            System.out.println("|0. Retornar       |");
            System.out.println("|--<Funcionarios>--|");
            System.out.print("|-> ");
            int op = Input.nextInt();
            System.out.println("");
            
            switch (op) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    exibirFuncionario();
                    break;
                case 3:
                    System.out.println("Digite o codigo do funcionario: ");
                    int codigoFuncionario = Input.nextInt();
                    excluirFuncionario(codigoFuncionario);
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
