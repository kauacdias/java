package endereco;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @Kaua C Dias
 */
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Mns Basilio Pereira", "7", "Térreo", "40444-770", "Salvador", UnidadeFederativa.BAHIA);
        Pessoa pessoa = new Pessoa(1, "Kauã Cerqueira Dias", LocalDate.of(2003, Month.JULY, 02), "71 9 8125-9233", "kauac.dias03@outlook.com", Genero.MASCULINO, endereco);
    
        
        System.out.println("Nome: " + pessoa.getNome() + "\nData de Nascimento: " + pessoa.getDataNascimento() + " Idade: " + pessoa.getIdade() + "\nTelefone: " + pessoa.getTelefone() + "\nEmail: " + pessoa.getEmail() + "\nGenero: " + pessoa.getGenero().getTexto() + "\nEndereço: " + pessoa.getEndereco().toString());
    }
}

