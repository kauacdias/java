package herancamuita;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @Kaua C Dias
 */
public abstract class Fisica extends Pessoa {
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;

    public Fisica(Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }
   
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\nPessoa Fisica: " + 
                super.toString() +
                "\n\nGênero: " + genero.getCaractere() + "\nEstado civil: " + estadoCivil.texto + "\nData de nascimento: " + dataNascimento + "\nIdade: " + getIdade();
    }
 }
