package controleProdutos;

import static controleProdutos.CadastroMedicamento.exibirInformacoesMedicamento;
import static controleProdutos.CadastroMedicamento.setarDadosMedicamento;
import static controleProdutos.CadastroProduto.descontos;
import static controleProdutos.CadastroProduto.tudo;
import static controleProdutos.CadastroProduto.valoresSemDesconto;
import static controleProdutos.CadastroProduto.valorestotais;
import modeloProdutos.MedicamentoControlavel;
import static modeloProdutos.MedicamentoControlavel.medicamentosControlaveis;
import modeloVendas.ItemVenda;
import static modeloVendas.ItemVenda.carrinho;
import modeloVendas.Venda;
import util.Input;

public class CadastroMedicamentoControlavel {

    protected static void setarDadosMedicamentoControlavel(MedicamentoControlavel mc) {
        setarDadosMedicamento(mc);
        System.out.print("Digite o CRM do medico: ");
        mc.setCrmMedico(Input.nextLine());
        System.out.print("Digite o cpf do paciente: ");
        mc.setCpfPaciente(Input.nextLine());
    }

    protected static void exibirInformacoesMedicamentosControlaveis(MedicamentoControlavel mc) {
        exibirInformacoesMedicamento(mc);
        System.out.println("CRM do medico: " + mc.getCrmMedico());
        System.out.println("CPF do paciente: " + mc.getCpfPaciente());
    }

    public static MedicamentoControlavel cadastroMedicamentoControlavel() {
        MedicamentoControlavel mc = new MedicamentoControlavel();
        setarDadosMedicamentoControlavel(mc);
        medicamentosControlaveis.add(mc);
        tudo.add(mc);
        exibirInformacoesMedicamentosControlaveis(mc);
        return mc;
    }

    public static void exibirMedicamentosControlaveis() {
        if (medicamentosControlaveis.isEmpty()) {
            System.out.println("Lista de medicamentos controlaveis esta vazia!");
        } else {
            for (MedicamentoControlavel medicamentoControlavel : medicamentosControlaveis) {
                System.out.println(medicamentoControlavel);
            }
        }

    }

    public static void excluirMedicamentoControlavel(int codigo) {
        MedicamentoControlavel medicamentoControlavelRemovido = null;
        for (MedicamentoControlavel medicamentoControlavel : medicamentosControlaveis) {
            if (medicamentoControlavel.getCodigo() == codigo) {
                medicamentoControlavelRemovido = medicamentoControlavel;
                break;
            }
        }

        if (medicamentoControlavelRemovido != null) {
            medicamentosControlaveis.remove(medicamentoControlavelRemovido);
            System.out.println("Medicamento controlavel removido com sucesso!");
        } else {
            System.out.println("Medicamento controlavel nao encontrado!");
        }
    }

    public static void compraMedicamentoControlado(int codigo) {
        MedicamentoControlavel medicamentoControlado = null;
        for (MedicamentoControlavel mc : MedicamentoControlavel.medicamentosControlaveis) {
            if (mc.getCodigo() == codigo) {
                medicamentoControlado = mc;
                break;
            }
        }

        if (medicamentoControlado == null) {
            System.out.println("Medicamento controlado nao encontrado.");
            return;
        }

        System.out.println("Medicamento controlado selecionado: " + medicamentoControlado.getDescricao());
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = Input.nextInt();

        double valorUnitario = medicamentoControlado.getValor();
        double auxiliarValor = valorUnitario * quantidade;
        valoresSemDesconto.add(auxiliarValor);
        double valorTotal = valorUnitario * quantidade;
        double valorDesconto = valorTotal * 0.03;
        double valorComDesconto = valorTotal - valorDesconto;
        descontos.add(valorDesconto);
        valorestotais.add(valorComDesconto);

        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setProduto(medicamentoControlado);
        itemVenda.setQuantidade(quantidade);
        itemVenda.setValorUnitario(valorUnitario);
        itemVenda.setValorTotal(valorComDesconto);

        Venda.itens.add(itemVenda);
        carrinho.add(itemVenda);
        System.out.println("Medicamento controlado adicionado ao carrinho.");
    }
}
