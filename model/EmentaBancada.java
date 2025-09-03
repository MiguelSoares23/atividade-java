package model;

import java.util.ArrayList;

public class EmentaBancada extends EmendaParlamentar {
    private ArrayList<String> listaParlamentares;
    private ArrayList<String> filiacaoParalmentares;
    private String linkAta;
    private String parlamentarSugeriu;

    public EmentaBancada(int id, int ano, double valor, String autor, String tipo, ArrayList<Documento> documentos, ArrayList<String> listaParlamentares, ArrayList<String> filiacaoParalmentares, String linkAta, String parlamentarSugeriu) {
        super(id, ano, valor, autor, tipo, documentos);
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
