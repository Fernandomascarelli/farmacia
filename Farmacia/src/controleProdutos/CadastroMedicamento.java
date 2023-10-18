package controleProdutos;

import static controleProdutos.CadastroProduto.descontos;
import static controleProdutos.CadastroProduto.exibirInformacoesProduto;
import static controleProdutos.CadastroProduto.setarDadosProduto;
import static controleProdutos.CadastroProduto.tudo;
import static controleProdutos.CadastroProduto.valoresSemDesconto;
import static controleProdutos.CadastroProduto.valorestotais;
import modeloProdutos.Medicamento;
import static modeloProdutos.Medicamento.medicamentos;
import modeloVendas.ItemVenda;
import static modeloVendas.ItemVenda.carrinho;
import modeloVendas.Venda;
import util.Input;

public class CadastroMedicamento {

    protected static void setarDadosMedicamento(Medicamento m) {
        setarDadosProduto(m);
        System.out.print("Digite o numero de registro Anvisa: ");
        m.setNumRegistroAnvisa(Input.nextInt());
        System.out.print("Digite a composicao: ");
        m.setComposicao(Input.nextLine());
        System.out.print("Digite a dosagem: ");
        m.setDosagem(Input.nextDouble());
    }

    protected static void exibirInformacoesMedicamento(Medicamento m) {
        exibirInformacoesProduto(m);
        System.out.println("Numero registro da Anvisa: " + m.getNumRegistroAnvisa());
        System.out.println("Composicao: " + m.getComposicao());
        System.out.println("Dosagem:" + m.getDosagem());
    }

    public static Medicamento cadastrarMedicamento() {
        Medicamento m = new Medicamento();
        setarDadosMedicamento(m);
        medicamentos.add(m);
        tudo.add(m);
        exibirInformacoesMedicamento(m);
        return m;
    }

    public static void exibirMedicamentos() {
        if (medicamentos.isEmpty()) {
            System.out.println("Lista de medicamentos esta vazia!");
        } else {
            for (Medicamento medicamento : medicamentos) {

                System.out.println(medicamento);
            }
        }

    }

    public static void excluirMedicamento(int codigo) {
        Medicamento medicamentoRemovido = null;
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getCodigo() == codigo) {
                medicamentoRemovido = medicamento;
                break;
            }
        }

        if (medicamentoRemovido != null) {
            medicamentos.remove(medicamentoRemovido);
            System.out.println("Medicamento removido com sucesso!");
        } else {
            System.out.println("Medicamento nao encontrado!");
        }
    }

    public static void compraMedicamento(int codigo) {
        Medicamento medicamento = null;
        for (Medicamento m : Medicamento.medicamentos) {
            if (m.getCodigo() == codigo) {
                medicamento = m;
                break;
            }
        }

        if (medicamento == null) {
            System.out.println("Medicamento nao encontrado.");
            return;
        }

        System.out.println("Medicamento selecionado: " + medicamento.getDescricao());
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = Input.nextInt();

        double valorUnitario = medicamento.getValor();
        double auxiliarValor = valorUnitario * quantidade;
        valoresSemDesconto.add(auxiliarValor);
        double valorTotal = valorUnitario * quantidade;
        double valorDesconto = valorTotal * 0.10;
        double valorComDesconto = valorTotal - valorDesconto;
        descontos.add(valorDesconto);
        valorestotais.add(valorComDesconto);

        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setProduto(medicamento);
        itemVenda.setQuantidade(quantidade);
        itemVenda.setValorUnitario(valorUnitario);
        itemVenda.setValorTotal(valorComDesconto);

        Venda.itens.add(itemVenda);
        carrinho.add(itemVenda);
        System.out.println("Medicamento adicionado ao carrinho.");
    }
}
