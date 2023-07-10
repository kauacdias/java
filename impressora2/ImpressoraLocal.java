package impressora2;

/**
 *
 * @Kaua C Dias
 */
public class ImpressoraLocal {
   
    private Impressora impressora;
    
    public void instalar(Impressora impressora) {
        this.impressora = impressora;
    }
    
    public void imprimir(){
        this.impressora.imprimir();
    }
}
