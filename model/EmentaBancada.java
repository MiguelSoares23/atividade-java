package model;

import java.util.ArrayList;

public class EmentaBancada extends EmendaParlamentar {
    private ArrayList<String> listaParlamentares;
    private ArrayList<String> filiacaoParalmentares;
    private String linkAta;
    private String parlamentarSugeriu;

    public EmentaBancada(int ano, String tipo, String autor, int numero, boolean possuiApoiador,
                         String localidade, String funcao, String subfuncao, String programa,
                         String acao, String plano, String codigo,
                         double valorEmpenhado, double valorLiquidado, double valorPago,
                         double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos,
                         ArrayList<Documento> documentos,
                         ArrayList<String> listaParlamentares, ArrayList<String> filiacaoParalmentares,
                         String linkAta, String parlamentarSugeriu) {

        super(ano, tipo, autor, numero, possuiApoiador, localidade, funcao, subfuncao,
              programa, acao, plano, codigo, valorEmpenhado, valorLiquidado, valorPago,
              valorRestosInscritos, valorRestosCancelados, valorRestosPagos, documentos);

        this.listaParlamentares = listaParlamentares;
        this.filiacaoParalmentares = filiacaoParalmentares;
        this.linkAta = linkAta;
        this.parlamentarSugeriu = parlamentarSugeriu;
    }
    public ArrayList<String> getListaParlamentares() {
        return this.listaParlamentares;
    }

    public void setListaParlamentares(ArrayList<String> listaParlamentares) {
        this.listaParlamentares = listaParlamentares;
    }

    public ArrayList<String> getFiliacaoParalmentares() {
        return this.filiacaoParalmentares;
    }

    public void setFiliacaoParalmentares(ArrayList<String> filiacaoParalmentares) {
        this.filiacaoParalmentares = filiacaoParalmentares;
    }

    public String getLinkAta() {
        return this.linkAta;
    }

    public void setLinkAta(String linkAta) {
        this.linkAta = linkAta;
    }

    public String getParlamentarSugeriu() {
        return this.parlamentarSugeriu;
    }

    public void setParlamentarSugeriu(String parlamentarSugeriu) {
        this.parlamentarSugeriu = parlamentarSugeriu;
    }
    
}
