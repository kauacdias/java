package amaisgrandedetodas;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("123", "07492612236", "12325263", "12.223", Setor.ENGENHARIA, 1000, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 25), "Kaique", "719888522", "kaique@gmail.com", new Endereco("Rua Umdoistres", "123", "Terreo", "40452233", "Salvador", UnidadeFederativa.BAHIA));
        Medico medico = new Medico("1252", "07499933", "223233", "02122112", Setor.SAUDE, 1000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1998, Month.DECEMBER, 10), "Lorena", "719633333", "lorena@outlook.com", new Endereco("Rua LoremIpsun", "122", "1 andar", "40421211", "Salvador", UnidadeFederativa.BAHIA));
        Motoboy motoboy = new Motoboy("A1121A", "075221212", "2233633", "8955545", Setor.OPERACOES, 1000, Genero.MASCULINO, EstadoCivil.DIVORCIDADO, LocalDate.of(1993, Month.JANUARY, 2), "Hugo", "713333223", "hugo@bol.com", new Endereco("Rua 2 de julho", "33", "Terreo", "4042303232", "Cachoeira", UnidadeFederativa.BAHIA));
        Diretor diretor = new Diretor("0212121", "2121221", "121.22", Setor.TECNOLOGIA, 1000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1993, Month.JULY, 20), "Paula", "712212221", "paula@yahoo.com", new Endereco("Rua Humm", "778", "7 andar", "40121212", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        Cliente cliente = new Cliente(10000000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1982, Month.FEBRUARY, 6), "Marcia", "716562332", "marcia@hotmail.com", new Endereco("Rua MMA", "7887", "terreo", "404545454", "Osasco", UnidadeFederativa.SAO_PAULO));
        Fornecedor fornecedor = new Fornecedor(Setor.MATERIAL_CONSTRUCAO, new Produto("Cimento Poty", "Construção", 150), "40255454", "63333", "Cimentos LTDA", "78400000", "cimentos@ltda.com", new Endereco("Rua java", "77", "terreo", "522222236", "Salvador", UnidadeFederativa.BAHIA));
        PrestacaoServico prestacaoServico = new PrestacaoServico(LocalDate.of(2020, Month.MARCH, 10), LocalDate.of(2020, Month.MARCH, 20), "22121215", "212121", "PSDA", "715545151", "psda@ltda.br", new Endereco("Rua acabou", "55", "terreo", "4054555", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(engenheiro);
        System.out.println(medico);
        System.out.println(motoboy);
        System.out.println(diretor);
        System.out.println(cliente);
        System.out.println(fornecedor);
        System.out.println(prestacaoServico);
        System.out.println("");
        diretor.admitir(motoboy);
    }
}
