package controleProdutos;

import static controleProdutos.CadastroProduto.exibirInformacoesProduto;
import static controleProdutos.CadastroProduto.setarDadosProduto;
import modeloProdutos.Medicamento;
import static modeloProdutos.Medicamento.medicamentos;
import util.Input;

public class CadastroMedicamento {
    protected static void setarDadosMedicamento(Medicamento m){
        setarDadosProduto(m);
        System.out.print("Digite o numero de registro Anvisa: ");
        m.setNumRegistroAnvisa(Input.nextInt());
        System.out.print("Digite a composicao: ");
        m.setComposicao(Input.nextLine());
        System.out.print("Digite a dosagem: ");
        m.setDosagem(Input.nextDouble());
    }
    
    protected static void exibirInformacoesMedicamento(Medicamento m){
        exibirInformacoesProduto(m);
        System.out.println("Numero registro da Anvisa: " + m.getNumRegistroAnvisa());
        System.out.println("Composicao: " + m.getComposicao());
        System.out.println("Dosagem:" + m.getDosagem());
    }
    
    public static Medicamento cadastrarMedicamento(){
        Medicamento m = new Medicamento();
        setarDadosMedicamento(m);
        medicamentos.add(m);
        exibirInformacoesMedicamento(m);
        return m;
    }
    
}
