package amaisgrandedetodas;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class Diretor extends Funcionario implements Contratacao{
    private final double PREMIO = 0.2;

    public Diretor(String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
    }

    @Override
    public double getSalarioFinal() {
        return salario + salario*PREMIO;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDiretor: " + 
                "\nPrêmio: " + (PREMIO * 100) + "%" +
                "Salário final: " + Util.formatarDinheiro(getSalarioFinal());
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando o funcionário: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo o funcionário: " + funcionario.toString());
    }
    
}
