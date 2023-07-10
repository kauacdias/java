package amaisgrandedetodas;

/**
 *
 * @Kaua C Dias
 */
public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIDADO("Divorciado"),
    VIUVO("Viúvo");
    
    protected final String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
}
