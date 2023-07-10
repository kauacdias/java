package herancamuita;

/**
 *
 * @Kaua C Dias
 */
public class Fornecedor extends Juridica {
    private String produto;

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\nFornecedor: " + "\nProduto: " + produto;
    }
}
