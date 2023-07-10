package bonificacao;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @Kaua C Dias
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("ABC-123", "Lux", "555.124.667-88", "21.526.747-99", Genero.MASCULINO, Setor.OPERACOES, 1000, LocalDate.of(2017, Month.FEBRUARY, 10));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Luis", "888.474.215-96", "89.233.963-88", Genero.MASCULINO, Setor.FINANCEIRO, 1000, LocalDate.of(2010, Month.AUGUST, 10));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Jorgin", "222.111.333-44", "14.523.655-77", Genero.FEMININO, Setor.RECURSOS_HUMANOS, 1000, LocalDate.of(2020, Month.JANUARY, 10));
        
        System.out.println(motoboy);
        System.out.println(gerente);
        System.out.println(diretor);
    }
}
