package Modelo;

public class Terreno extends Financiamento{
    public Terreno(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual){
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaJurosAnual);
    }
    
    public double calcularPagamentoMensal(){
        return super.calcularPagamentoMensal() ;
    }

}
