package demitir;

/**
 *
 * @Kaua C Dias 
 */
public enum Setor {
    RECURSO_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operações");

    protected final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }
    
    
}
