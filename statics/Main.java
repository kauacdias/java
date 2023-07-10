package statics;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", LocalDate.of(2002, Month.MARCH, 10), 2000);
        
        System.out.println(pessoa.toString());
    }
}
