package Modelo;

public class Financiamento {

    //ATRIBUTOS
    protected double valorImovel;

    protected int prazoFinanciamento;

    protected double taxaJurosAnual;

    public double getvalorImovel(){
        return this.valorImovel;
    }

    public int getprazoFinanciamento(){
        return this.prazoFinanciamento;
    }

    public double gettaxaJurusAnual(){
        return this.taxaJurosAnual;
    }




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