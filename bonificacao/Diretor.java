package bonificacao;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class Diretor extends CargoDeConfianca{
    private final double PREMIO = 0.1; //10%

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }

    @Override
    public String toString() {
        return "\nDiretor: " +
                super.toString() +
                "\nPremio: " + PREMIO + 
                "\nSalario Final: " + this.getSalarioFinal();
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.getSalarioBase() * super.bonificacao.valor;
        salarioFinal += super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }

    
}
