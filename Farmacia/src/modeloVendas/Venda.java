package modeloVendas;

import static controleProdutos.CadastroProduto.descontos;
import static controleProdutos.CadastroProduto.valoresSemDesconto;
import static controleProdutos.CadastroProduto.valorestotais;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import modeloPessoas.Cliente;
import static modeloPessoas.Cliente.clientes;
import modeloPessoas.Funcionario;
import modeloVendas.ItemVenda;
import static modeloPessoas.Funcionario.funcionarios;
import util.DateUtils;
import util.Input;

public class Venda {

    protected int codigo;
    protected Funcionario funcionario;
    protected static Cliente cliente;
    protected LocalDate data;
    protected double valorProduto;
    protected double desconto;
    protected double valorTotal;
    public static ArrayList<ItemVenda> itens = new ArrayList<>();
    public static ArrayList<Venda> vendas = new ArrayList<>();

    public Venda() {
    }

    public Venda(int codigo, Funcionario funcionario, Cliente cliente, LocalDate data, double valorProduto, double desconto, double valorTotal) {
        this.codigo = codigo;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.data = data;
        this.valorProduto = valorProduto;
        this.desconto = desconto;
        this.valorTotal = valorTotal;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double calcularTotalCarrinho() {
        double valorTotal = 0;
        for (ItemVenda item : itens) {
            valorTotal += item.getValorTotal();
        }

        setValorTotal(valorTotal);
        return valorTotal;
    }

    public static void fecharCompra() {
        Venda v = new Venda();
        int ultimoCod = 0;
        int novoCod = ultimoCod + 1;
        v.setCodigo(novoCod);
        System.out.print("Digite o nome do funcionario: ");
        String nome = Input.nextLine();

        Funcionario funcionarioEncontrado = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                funcionarioEncontrado = funcionario;
                break;
            }
        }
        if (funcionarioEncontrado != null) {
            v.setFuncionario(funcionarioEncontrado);
            System.out.println("Funcionario selecionado: " + funcionarioEncontrado.getNome());
        } else {
            System.out.println("Funcionario nao encontrado.");
        }

        System.out.println("Digite o nome do cliente: ");
        String nome2 = Input.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome2)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        if (clienteEncontrado != null) {
            v.setCliente(clienteEncontrado);
            System.out.println("Cliente selecionado: " + clienteEncontrado.getNome());
        } else {
            System.out.println("Cliente nao encontrado.");
        }

        v.setData(LocalDate.now());

        double soma = 0.0;
        for (double desconto : descontos) {
            soma += desconto;
        }

        double soma2 = 0.0;
        for (double valor : valorestotais) {
            soma2 += valor;
        }

        double soma3 = 0.0;
        for (double valorSemDesconto : valoresSemDesconto) {
            soma3 += valorSemDesconto;
        }

        if (cliente != null && DateUtils.calcularIdade(cliente.getDataNascimento()) > 60 && v.getValorTotal() > 100) {
            double auxV = v.getValorTotal() - 10;
            double auxD = v.getDesconto() + 10;
            v.setValorTotal(auxV);
            v.setDesconto(auxD);
        } else {
            v.setDesconto(soma);
            v.setValorTotal(soma2);
            v.setValorProduto(soma3);
        }

        exibirVenda(v);
        vendas.add(v);

    }

    public static class DateUtils {

        public static int calcularIdade(LocalDate dataNascimento) {
            LocalDate dataAtual = LocalDate.now();
            return Period.between(dataNascimento, dataAtual).getYears();
        }
    }

    public static void procurarVenda(int codigo) {
        Venda vendaEncontrada = null;
        for (Venda venda : vendas) {
            if (venda.getCodigo() == codigo) {
                vendaEncontrada = venda;
                break;
            }
        }

        if (vendaEncontrada != null) {
            exibirVenda(vendaEncontrada);
        } else {
            System.out.println("Venda nao encontrada.");
        }
    }

    public static void exibirVenda(Venda v) {
        System.out.println("Codigo: " + v.getCodigo());
        System.out.println("Funcionario: " + v.getFuncionario());
        System.out.println("Cliente: " + v.getCliente());
        System.out.println("Data: " + v.getData());
        System.out.println("Valor produtos: " + v.getValorProduto());
        System.out.println("Desconto: " + v.getDesconto());
        System.out.println("Valor total: " + v.getValorTotal());
        System.out.println("Itens: ");
        for (ItemVenda item : v.getItens()) {
            System.out.println(item);
        }

    }

}
