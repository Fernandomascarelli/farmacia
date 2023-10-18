package Vendas;

import java.time.LocalDate;
import java.util.ArrayList;
import modeloPessoas.Cliente;
import modeloPessoas.Funcionario;


public class Venda {
    protected int codigo;
    protected Funcionario funcionario;
    protected Cliente cliente;
    protected LocalDate data;
    protected double valorProduto;
    protected double desconto;
    protected double valorTotal;
    public static ArrayList<ItemVenda> itens = new ArrayList<>();

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
    
    
    
}
