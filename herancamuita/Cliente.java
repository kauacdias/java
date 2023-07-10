package herancamuita;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class Cliente extends Fisica {
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\nCliente:" + 
                super.toString() +
                "\n\nProtocolo de atendimento: " + protocoloAtendimento;
    }
    
    
}
