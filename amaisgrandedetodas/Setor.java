package amaisgrandedetodas;

/**
 *
 * @Kaua C Dias
 */
public enum Setor {
    TECNOLOGIA("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material de Construção"),
    MATERIA_PRIMA("Matéria prima"),
    ALIMENTICIO("Alimentício"),
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    protected final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
