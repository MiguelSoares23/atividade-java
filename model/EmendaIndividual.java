package model;

import java.util.ArrayList;

public class EmendaIndividual extends EmendaParlamentar {
    private String tipoTransferencia;
    private boolean projetoNecessario;

    public EmendaIndividual(int ano, String tipo, String autor, int numero, boolean possuiApoiador,
                            String localidade, String funcao, String subfuncao, String programa,
                            String acao, String plano, String codigo,
                            double valorEmpenhado, double valorLiquidado, double valorPago,
                            double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos,
                            ArrayList<Documento> documentos,
                            String tipoTransferencia, boolean projetoNecessario) {

        super(ano, tipo, autor, numero, possuiApoiador, localidade, funcao, subfuncao,
              programa, acao, plano, codigo, valorEmpenhado, valorLiquidado, valorPago,
              valorRestosInscritos, valorRestosCancelados, valorRestosPagos, documentos);

        this.tipoTransferencia = tipoTransferencia;
        this.projetoNecessario = projetoNecessario;
    }
    public String getTipoTransferencia() {
        return this.tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public boolean isProjetoNecessario() {
        return this.projetoNecessario;
    }

    public boolean getProjetoNecessario() {
        return this.projetoNecessario;
    }

    public void setProjetoNecessario(boolean projetoNecessario) {
        this.projetoNecessario = projetoNecessario;
    }

}