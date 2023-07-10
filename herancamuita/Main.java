package herancamuita;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @Kaua C Dias
 */
public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("111122", "074.555.222-89", "22.231.414-88", "77888.1", Setor.ENGENHARIA, 5000, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(1990, Month.JULY, 10), 1, "Mateus", "71 98585-2332", "mateus@engenharia.br\n", new Endereco("Rua UmDoisTres", "52", "apt 23", "40666887", "Salvador", UnidadeFederativa.BAHIA));
        Medico medico = new Medico("12222.111", "078.999,966-63", "12.414.777-63", "111147", Setor.SAUDE, 8000, Genero.FEMININO, EstadoCivil.SOLTEIRO, LocalDate.of(1988, Month.MARCH, 30), 1, "Julia", "71 98225-4154", "julia@medicina.br\n", new Endereco("Rua Caramba Deus", "74B", "Térreo", "40552-414", "Salvador", UnidadeFederativa.BAHIA));
        Advogado advogado = new Advogado("555885", "074.877.963-88", "11.121.336-77", "112223.45", Setor.JURIDICO, 3500, Genero.MASCULINO, EstadoCivil.SEPARADO, LocalDate.of(1974, Month.MAY, 15), 1, "Levi", "71 98888-4414", "levi@juridico.br\n", new Endereco("Rua O Barato ta Caro", "888", "12º andar", "40444112", "Salvador", UnidadeFederativa.BAHIA));
        Cliente cliente = new Cliente(12212, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1974, Month.SEPTEMBER, 24), 1, "Marcia", "71 98559-4531", "marcia123@gmail.com\n", new Endereco("Rua BBMP", "7893", "Térreo", "41041-111", "Salvador", UnidadeFederativa.BAHIA));
        PrestacaoServico prestacao = new PrestacaoServico(LocalDate.of(2020, Month.MARCH, 10), LocalDate.of(2020, Month.MARCH, 20), "222222522", "1212252", 1, "MDSVEI LTDA", "7188778211", "mdsveildta@gmail.com\n", new Endereco("Rua AAAA", "878", "APT 12", "40444222", "Salvador", UnidadeFederativa.BAHIA));
        Fornecedor fornecedor = new Fornecedor("Joias", "22222", "2323852", 1, "Joias LTDA", "71 982255235", "joias@ltda.br\n", new Endereco("Rua ja chega", "522", "terreo", "40441125", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(engenheiro);
        System.out.println("");
        System.out.println("");
        System.out.println(medico);
        System.out.println("");
        System.out.println("");
        System.out.println(advogado);
        System.out.println("");
        System.out.println("");
        System.out.println(cliente);
        System.out.println("");
        System.out.println("");
        System.out.println(prestacao);
        System.out.println("");
        System.out.println("");
        System.out.println(fornecedor);
    }
}
