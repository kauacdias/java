package bonificacao;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }

    @Override
    public String toString() {
        return "\nGerente: " + super.toString() +
                "\nSalario Final: " + this.getSalarioFinal();

    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioBase() + (super.getSalarioBase() * super.bonificacao.valor);
    }

    
}
