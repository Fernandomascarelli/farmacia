package controleProdutos;

import static controleProdutos.CadastroMedicamento.exibirInformacoesMedicamento;
import static controleProdutos.CadastroMedicamento.setarDadosMedicamento;
import static controleProdutos.CadastroProduto.tudo;
import static controleProdutos.CadastroProduto.valoresSemDesconto;
import static controleProdutos.CadastroProduto.valorestotais;
import modeloProdutos.MedicamentoInjetavel;
import static modeloProdutos.MedicamentoInjetavel.medicamentosInjetaveis;
import modeloVendas.ItemVenda;
import static modeloVendas.ItemVenda.carrinho;
import modeloVendas.Venda;
import util.Input;

public class CadastroMedicamentoInjetavel {

    protected static void setarDadosMedicamentosInjetaveis(MedicamentoInjetavel mi) {
        setarDadosMedicamento(mi);
        System.out.print("Digite o nome do funcionario responsavel: ");
        mi.setFuncionarioResponsavel(Input.nextLine());
        System.out.print("Digite o cpf do paciente: ");
        mi.setCpfPaciente(Input.nextLine());
    }

    protected static void exibirInformacoesMedicamentosInjetaveis(MedicamentoInjetavel mi) {
        exibirInformacoesMedicamento(mi);
        System.out.println("Nome do funcionario responsavel: " + mi.getFuncionarioResponsavel());
        System.out.println("CPF do paciente: " + mi.getCpfPaciente());
    }

    public static MedicamentoInjetavel cadastroMedicamentoInjetavel() {
        MedicamentoInjetavel mi = new MedicamentoInjetavel();
        setarDadosMedicamentosInjetaveis(mi);
        medicamentosInjetaveis.add(mi);
        tudo.add(mi);
        exibirInformacoesMedicamentosInjetaveis(mi);
        return mi;
    }

    public static void exibirMedicamentosInjetaveis() {
        if (medicamentosInjetaveis.isEmpty()) {
            System.out.println("Lista de medicamentos injetaveis esta vazia!");
        } else {
            for (MedicamentoInjetavel medicamentoInjetavel : medicamentosInjetaveis) {
                System.out.println(medicamentoInjetavel);
            }
        }

    }

    public static void excluirMedicamentoInjetavel(int codigo) {
        MedicamentoInjetavel medicamentoInjetavelRemovido = null;
        for (MedicamentoInjetavel medicamentoInjetavel : medicamentosInjetaveis) {
            if (medicamentoInjetavel.getCodigo() == codigo) {
                medicamentoInjetavelRemovido = medicamentoInjetavel;
                break;
            }
        }

        if (medicamentoInjetavelRemovido != null) {
            medicamentosInjetaveis.remove(medicamentoInjetavelRemovido);
            System.out.println("Medicamento injetavel removido com sucesso!");
        } else {
            System.out.println("Medicamento injetavel nao encontrado!");
        }
    }

    public static void compraMedicamentoInjetavel(int codigo) {
        MedicamentoInjetavel medicamentoInjetavel = null;
        for (MedicamentoInjetavel mi : MedicamentoInjetavel.medicamentosInjetaveis) {
            if (mi.getCodigo() == codigo) {
                medicamentoInjetavel = mi;
                break;
            }
        }

        if (medicamentoInjetavel == null) {
            System.out.println("Medicamento injetavel nao encontrado.");
            return;
        }

        System.out.println("Medicamento injetavel selecionado: " + medicamentoInjetavel.getDescricao());
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = Input.nextInt();

        double valorUnitario = medicamentoInjetavel.getValor();
        double auxiliarValor = valorUnitario * quantidade;
        valoresSemDesconto.add(auxiliarValor);
        double valorTotal = valorUnitario * quantidade;
        valorestotais.add(valorTotal);
        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setProduto(medicamentoInjetavel);
        itemVenda.setQuantidade(quantidade);
        itemVenda.setValorUnitario(valorUnitario);
        itemVenda.setValorTotal(valorTotal);

        Venda.itens.add(itemVenda);
        carrinho.add(itemVenda);
        System.out.println("Medicamento injetável adicionado ao carrinho.");
    }

}
