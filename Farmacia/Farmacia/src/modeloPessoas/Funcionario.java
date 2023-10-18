package modeloPessoas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario extends Pessoa{
    protected String ctps;
    public static ArrayList<Funcionario> funcionarios = new ArrayList<>(); 
    
    public Funcionario(){
        
    }

    public Funcionario(String ctps) {
        this.ctps = ctps;
    }

    public Funcionario(String ctps, int codigo, String nome, String cpf, LocalDate dataNascimento) {
        super(codigo, nome, cpf, dataNascimento);
        this.ctps = ctps;
    }
    
    public String getCtps(){
        return ctps;
    }
    
    public void setCtps(String ctps){
        this.ctps = ctps;
    }
    
    
    
}
