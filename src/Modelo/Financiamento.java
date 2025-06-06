package Modelo;

public class Financiamento {

    //ATRIBUTOS
    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;
    //CONSTRUTOR
    Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual){
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    //MÉTODOS
    double calcularPagamentoMensal(){
        return ( this.valorImovel/ (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }
    double calcularTotalPagamento(){
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }
}
