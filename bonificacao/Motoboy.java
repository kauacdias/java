package bonificacao;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class Motoboy extends Funcionario {
    private String placaDaMoto;

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }
    
    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "\nMotoboy " + super.toString() +
                "\nPlaca da moto: " + placaDaMoto + 
                "\nSalario Final: " + this.getSalarioFinal();
        
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
    
    
}
