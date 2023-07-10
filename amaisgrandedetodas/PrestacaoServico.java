package amaisgrandedetodas;

import java.time.LocalDate;

/**
 *
 * @Kaua C Dias
 */
public class PrestacaoServico extends Juridica{
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPrestação de serviço: " + 
                "\nContrato - Início: " + Util.formatarData(contratoInicio) + 
                "\nContrato - Fim: " + Util.formatarData(contratoFim);
    }
    
}
