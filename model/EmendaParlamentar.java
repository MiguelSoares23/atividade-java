package model;

import java.util.ArrayList;

public abstract class EmendaParlamentar {
    private int id;
    private int ano;
    private double valor;
    private String autor;
    private String tipo;
    private ArrayList<Documento> documentos;

    public EmendaParlamentar(int id, int ano, double valor, String autor, String tipo, ArrayList<Documento> documentos) {
        this.id = id;
        this.ano = ano;
        this.valor = valor;
        this.autor = autor;
        this.tipo = tipo;
        this.documentos = documentos;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Documento> getDocumentos() {
        return this.documentos;
    }

    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }

    public void imprimirDocumentos(String valor){
        

    }
}