package enumfuncionario;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @Kaua C Dias
 */
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Amazonas", "85 A", "Térreo", "40445-889", "Salvador", UnidadeFederativa.BAHIA);
        Funcionario funcionario = new Funcionario(1, "Pepe Mujica", "552336-552", "25.647.979-77", "312.61521", LocalDate.of(1943, Month.JULY, 25), Genero.MASCULINO, Setor.SAUDE, 1250.25, "98195-3333", "mujicapepe@uruguai.com", endereco);
    
        System.out.println(funcionario.toString());
    }
  }
