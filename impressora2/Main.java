package impressora2;

/**
 *
 * @Kaua C Dias
 */
public class Main {
    public static void main(String[] args) {
        impressora.ImpressoraLocal impressoraLocal = new impressora.ImpressoraLocal();
        
        impressoraLocal.instalar(new impressora.Hp());
        
        impressoraLocal.imprimir();
    }
    
    
}
