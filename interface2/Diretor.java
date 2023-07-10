package interface2;

import java.time.LocalDate;

/**
 *
 * @Kauã C Dias
 */
public class Diretor extends CargoDeConfianca implements Autenticavel{

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }

    @Override
    public double salarioFinal() {
        double PREMIO = 0.1;
        return (salarioBase * Bonificacao.DIRETOR.valor) + (salarioBase*PREMIO) + salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nSalário Final: " + Util.formatarMonetario(salarioFinal());
    }
    
    
}
