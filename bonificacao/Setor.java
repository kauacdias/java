package bonificacao;

/**
 *
 * @Kaua C Dias
 */
public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Júridico"),
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    ADMINISTRATIVO("Administração"),
    OPERACOES("Operações");
    
    protected final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
