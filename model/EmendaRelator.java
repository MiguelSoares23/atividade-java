package model;

import java.util.ArrayList;

public class EmendaRelator extends EmendaParlamentar{
    private String relator;
    private String parlamentoAutor;
    private String beneficiarioFinal;


    public EmendaRelator(int ano, String tipo, String autor, int numero, boolean possuiApoiador,
                         String localidade, String funcao, String subfuncao, String programa,
                         String acao, String plano, String codigo,
                         double valorEmpenhado, double valorLiquidado, double valorPago,
                         double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos,
                         ArrayList<Documento> documentos,
                         String relator, String parlamentoAutor, String beneficiarioFinal) {

        super(ano, tipo, autor, numero, possuiApoiador, localidade, funcao, subfuncao,
              programa, acao, plano, codigo, valorEmpenhado, valorLiquidado, valorPago,
              valorRestosInscritos, valorRestosCancelados, valorRestosPagos, documentos);

        this.relator = relator;
        this.parlamentoAutor = parlamentoAutor;
        this.beneficiarioFinal = beneficiarioFinal;
    }

    public String getRelator() {
        return this.relator;
    }

    public void setRelator(String relator) {
        this.relator = relator;
    }

    public String getParlamentoAutor() {
        return this.parlamentoAutor;
    }

    public void setParlamentoAutor(String parlamentoAutor) {
        this.parlamentoAutor = parlamentoAutor;
    }

    public String getBeneficiarioFinal() {
        return this.beneficiarioFinal;
    }

    public void setBeneficiarioFinal(String beneficiarioFinal) {
        this.beneficiarioFinal = beneficiarioFinal;
    }

    
}
