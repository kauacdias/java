package amaisgrandedetodas;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nMotoboy: " + 
                "\nCarteira de habilitação: " + carteiraDeHabilitacao;
    }
    
    
}
