package impressora;

/**
 *
 * @author Aluno
 */
public class Hp implements Impressora{

    @Override
    public void imprimir() {
        System.out.println(" -- Impressora HP -- ");
        System.out.println("Preparando tonner...");
        System.out.println("Imprimindo...");
    }
    
}
