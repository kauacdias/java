package impressora;

/**
 *
 * @author Aluno
 */
public class Epson implements Impressora {

    @Override
    public void imprimir() {
        System.out.println(" -- Impressora Epson -- ");
        System.out.println("Preparando cartuchos...");
        System.out.println("Imprimindo...");
    }
    
}
