package Modelo;

public abstract class Financiamento {

    //ATRIBUTOS
    protected double valorImovel;

    protected int prazoFinanciamento;

    protected double taxaJurosAnual;

    public double getvalorImovel(){
        return valorImovel;
    }

    public int getprazoFinanciamento(){
        return prazoFinanciamento;
    }

    public double gettaxaJurosAnual(){
        return taxaJurosAnual;
    }

    private double areaConstruida;

    private double areaTerreno;

    //CONSTRUTOR
    public Financiamento(double valorDesejadoImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double areaTerreno){
        
    }

    //MÉTODOS
    public  double calcularPagamentoMensal(){
        return ( this.valorImovel/ (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    public  double calcularTotalPagamento(){
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }
}