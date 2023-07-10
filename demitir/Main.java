package demitir;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @Kaua C Dias
 */
public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("012001JJJA", "Lucas", LocalDate.of(2003, Month.MARCH, 10), Genero.MASCULINO, Setor.OPERACOES, 1000);
        Diretor diretor = new Diretor("Mateus", LocalDate.of(2000, Month.MARCH, 10), Genero.MASCULINO, Setor.FINANCEIRO, 1000);
        
        System.out.println(motoboy);
        System.out.println(diretor);
    }

    
    
}