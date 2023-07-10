package amaisgrandedetodas;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMédico: " + 
                "\nCRM: " + crm;
    }
    
    
    
}
