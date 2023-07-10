package amaisgrandedetodas;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class Cliente extends Fisica {
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
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
        return super.toString() +
                "\nCliente: " + 
                "Protocolo de atendimento: " + protocoloAtendimento;
    }
    
}
