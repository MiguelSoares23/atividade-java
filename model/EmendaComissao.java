package model;

import java.util.ArrayList;


public class EmendaComissao extends EmendaParlamentar {
    private String linkComissao;
    private ArrayList<String> listaMembros;
    private String linkRelatorio;
    private String parlamentoSugeriu;


    public EmendaComissao(int ano, String tipo, String autor, int numero, boolean possuiApoiador,
                          String localidade, String funcao, String subfuncao, String programa,
                          String acao, String plano, String codigo,
                          double valorEmpenhado, double valorLiquidado, double valorPago,
                          double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos,
                          ArrayList<Documento> documentos,
                          String linkComissao, ArrayList<String> listaMembros,
                          String linkRelatorio, String parlamentoSugeriu) {

        super(ano, tipo, autor, numero, possuiApoiador, localidade, funcao, subfuncao,
              programa, acao, plano, codigo, valorEmpenhado, valorLiquidado, valorPago,
              valorRestosInscritos, valorRestosCancelados, valorRestosPagos, documentos);

        this.linkComissao = linkComissao;
        this.listaMembros = listaMembros;
        this.linkRelatorio = linkRelatorio;
        this.parlamentoSugeriu = parlamentoSugeriu;
    }
    public String getLinkComissao() {
        return this.linkComissao;
    }

    public void setLinkComissao(String linkComissao) {
        this.linkComissao = linkComissao;
    }

    public ArrayList<String> getListaMembros() {
        return this.listaMembros;
    }

    public void setListaMembros(ArrayList<String> listaMembros) {
        this.listaMembros = listaMembros;
    }

    public String getLinkRelatorio() {
        return this.linkRelatorio;
    }

    public void setLinkRelatorio(String linkRelatorio) {
        this.linkRelatorio = linkRelatorio;
    }

    public String getParlamentoSugeriu() {
        return this.parlamentoSugeriu;
    }

    public void setParlamentoSugeriu(String parlamentoSugeriu) {
        this.parlamentoSugeriu = parlamentoSugeriu;
    }

}
