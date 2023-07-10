package herancaprofissao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica(Genero.MASCULINO, "052.563.212-77", "21.996.879-20", LocalDate.of(2005, Month.AUGUST, 13), 2500, 1, "Nicola Acevedo", "666212-414", 
                            new Endereco("Rua Amazonas", "85", "1º Andar", "40.225-252", "Duque de Caxias", UnidadeFederativa.RIO_DE_JANEIRO));
        
        Juridica juridica = new Juridica("252522", "363699", LocalDate.of(1989, Month.MARCH, 12), LocalDate.of(2002, Month.MARCH, 13), 2990, 1, "2 de julho", "98858-1221", 
                            new Endereco("Rua Manaus", "70", "2º Andar", "40.225-252", "Caxias", UnidadeFederativa.BAHIA));

        
        System.out.println("\nPESSOA FÍSICA: " + fisica.toString());
        System.out.println("");
        System.out.println("PESSOA JURÍDICA: " + juridica.toString());
    }
}
