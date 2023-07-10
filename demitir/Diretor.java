package demitir;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class Diretor extends Funcionario implements Contratacao{

    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
    }

        
    @Override
    public double getSalarioFinal() {
        double PREMIO = 0.2;
        return salarioBase + salarioBase*PREMIO;
    }

    @Override
    public String toString() {
        return super.toString() + "Diretor " + getSalarioFinal();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratar funcionário");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir funcionário");
    }
    
    
}
