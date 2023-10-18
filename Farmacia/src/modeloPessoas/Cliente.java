package modeloPessoas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Pessoa{
    protected String email;
    public static ArrayList<Cliente> clientes = new ArrayList<>(); 
    
    public Cliente(){
        
    }

    public Cliente(String email) {
        this.email = email;
    }

    public Cliente(String email, int codigo, String nome, String cpf, LocalDate dataNascimento) {
        super(codigo, nome, cpf, dataNascimento);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "<Cliente>\n" +
                super.toString() +
                "Email: " + getEmail() + "\n";
    }
    
    
    
}
