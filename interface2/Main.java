package interface2;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("074-ABC", "Kauã", "5654485151", "085226263232", Genero.MASCULINO, 1000, LocalDate.of(1990, Month.MARCH, 10), LocalDate.of(1212, Month.MARCH, 20));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Lucas", "07492612233", "2141417771", Genero.MASCULINO, 1000, LocalDate.of(1999, Month.MARCH, 15), LocalDate.of(2020, Month.MARCH, 10));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Felipe", "7854121212", "212212851", Genero.MASCULINO, 1000, LocalDate.of(1955, Month.MARCH, 20), LocalDate.of(2010, Month.FEBRUARY, 10));
        
        System.out.println(motoboy);
        System.out.println(gerente);
        System.out.println(diretor);
    }
}
