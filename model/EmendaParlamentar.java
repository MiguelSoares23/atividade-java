package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class EmendaParlamentar {
    private int ano;
    private String tipo;
    private String autor;
    private int numero;
    private boolean possuiApoiador;
    private String localidade;
    private String funcao;
    private String subfuncao;
    private String programa;
    private String acao;
    private String plano;
    private String codigo;

    private double valorEmpenhado;
    private double valorLiquidado;
    private double valorPago;
    private double valorRestosInscritos;
    private double valorRestosCancelados;
    private double valorRestosPagos;

    private ArrayList<Documento> documentos;

    public EmendaParlamentar(int ano, String tipo, String autor, int numero, boolean possuiApoiador,
                             String localidade, String funcao, String subfuncao, String programa,
                             String acao, String plano, String codigo,
                             double valorEmpenhado, double valorLiquidado, double valorPago,
                             double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos,
                             ArrayList<Documento> documentos) {
        this.ano = ano;
        this.tipo = tipo;
        this.autor = autor;
        this.numero = numero;
        this.possuiApoiador = possuiApoiador;
        this.localidade = localidade;
        this.funcao = funcao;
        this.subfuncao = subfuncao;
        this.programa = programa;
        this.acao = acao;
        this.plano = plano;
        this.codigo = codigo;
        this.valorEmpenhado = valorEmpenhado;
        this.valorLiquidado = valorLiquidado;
        this.valorPago = valorPago;
        this.valorRestosInscritos = valorRestosInscritos;
        this.valorRestosCancelados = valorRestosCancelados;
        this.valorRestosPagos = valorRestosPagos;
        this.documentos = documentos;
    }

    // Getters e setters
    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isPossuiApoiador() {
        return this.possuiApoiador;
    }

    public boolean getPossuiApoiador() {
        return this.possuiApoiador;
    }

    public void setPossuiApoiador(boolean possuiApoiador) {
        this.possuiApoiador = possuiApoiador;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSubfuncao() {
        return this.subfuncao;
    }

    public void setSubfuncao(String subfuncao) {
        this.subfuncao = subfuncao;
    }

    public String getPrograma() {
        return this.programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getAcao() {
        return this.acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getPlano() {
        return this.plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValorEmpenhado() {
        return this.valorEmpenhado;
    }

    public void setValorEmpenhado(double valorEmpenhado) {
        this.valorEmpenhado = valorEmpenhado;
    }

    public double getValorLiquidado() {
        return this.valorLiquidado;
    }

    public void setValorLiquidado(double valorLiquidado) {
        this.valorLiquidado = valorLiquidado;
    }

    public double getValorPago() {
        return this.valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorRestosInscritos() {
        return this.valorRestosInscritos;
    }

    public void setValorRestosInscritos(double valorRestosInscritos) {
        this.valorRestosInscritos = valorRestosInscritos;
    }

    public double getValorRestosCancelados() {
        return this.valorRestosCancelados;
    }

    public void setValorRestosCancelados(double valorRestosCancelados) {
        this.valorRestosCancelados = valorRestosCancelados;
    }

    public double getValorRestosPagos() {
        return this.valorRestosPagos;
    }

    public void setValorRestosPagos(double valorRestosPagos) {
        this.valorRestosPagos = valorRestosPagos;
    }

    public ArrayList<Documento> getDocumentos() {
        return this.documentos;
    }

    public void setDocumentos(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }

    // Exibir todas as informações resumidas da emenda
    public void exibirResumo() {
        System.out.println("----- Resumo da Emenda " + "" +" -----");
        System.out.println("Ano: " + this.ano);
        System.out.println("Número da Emenda: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Possui Apoiador/Solicitante? " + this.possuiApoiador);
        System.out.println("Localidade do gasto: " + this.codigo);
        System.out.println("Função: " + this.funcao);
        System.out.println("Subfunção: " + this.subfuncao);
        System.out.println("Programa Orçamentário: " + this.programa);
        System.out.println("Ação Orçamentária: " + this.acao);
        System.out.println("Plano Orçamentário: " + this.plano);
        System.out.println("Código da emenda: " + this.codigo);
        System.out.println("Valor empenhado: R$ " + this.valorEmpenhado);
        System.out.println("Valor liquidado: R$ " + this.valorLiquidado);
        System.out.println("Valor pago: R$ " + this.valorPago);
        System.out.println("Restos a Pagar Inscritos: R$ " + this.valorRestosInscritos);
        System.out.println("Restos a Pagar Cancelados: R$ " + this.valorRestosCancelados);
        System.out.println("Restos a Pagar Pagos: R$ " + this.valorRestosPagos);
        System.out.println("----------------------------");
    }

    // Calcular o saldo ainda não pago (empenhado - pago)
    public double calcularSaldo() {
        return this.valorEmpenhado - this.valorPago;
    }

    // Verificar se a emenda já foi totalmente paga
    public boolean estaTotalmentePaga() {
        return this.valorPago >= this.valorEmpenhado;
    }

    // Adicionar documento relacionado à emenda
    public void adicionarDocumento(Documento doc) {
        this.documentos.add(doc);
    }

    // Listar documentos vinculados
    public void listarDocumentos() {
        if (documentos.isEmpty()) {
            System.out.println("Nenhum documento associado.");
        } else {
            System.out.println("Documentos vinculados:");
            for (Documento doc : this.documentos) {
                System.out.println("- " + doc.getTitulo());
            }
        }
    }


}
