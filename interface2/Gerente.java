package interface2;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class Gerente extends CargoDeConfianca implements Autenticavel{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }

    @Override
    public double salarioFinal() {
        return (salarioBase * Bonificacao.GERENTE.valor) + salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nSalário Final: " + Util.formatarMonetario(salarioFinal());
    }
}
