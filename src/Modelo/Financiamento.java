package Modelo;

public class Financiamento {

    //ATRIBUTOS
    private double valorImovel;

    private int prazoFinanciamento;

    private double taxaJurosAnual;

    //CONSTRUTOR
    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual){
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    //MÉTODOS
    public double calcularPagamentoMensal(){
        return ( this.valorImovel/ (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }
    public double calcularTotalPagamento(){
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }
}