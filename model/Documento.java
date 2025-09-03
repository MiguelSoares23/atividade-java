package model;

import java.util.Date;

public class Documento{
    private String titulo; 
    private Date data;
    private String fase;
    private double valor;


    public Documento(String titulo, Date data, String fase, double valor) {
        this.titulo = titulo;
        this.data = data;
        this.fase = fase;
        this.valor = valor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFase() {
        return this.fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}