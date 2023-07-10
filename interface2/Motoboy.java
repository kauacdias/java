package interface2;

import java.time.LocalDate;

/**
 *
 * @Kauã C Dias
 */
public class Motoboy extends Funcionario {
    private String placaDaMoto;

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double salarioFinal() {
            return 1000;
        }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nMotoboy: " + 
               "\nPlaca da Moto: " + placaDaMoto + 
               "\nSalario: " + salarioFinal();
    }
}
