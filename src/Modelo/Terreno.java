package Modelo;

public class Terreno extends Financiamento {

    private String zonaTerreno;

    public Terreno(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual, String zonaTerreno){
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaJurosAnual);
        this.zonaTerreno = zonaTerreno;
    }

    //@Override
    public double calcularPagamentoMensal(){
        double parcelaBase = calcularPagamentoMensal();
        return parcelaBase * 1.02;  // acréscimo de 2%
    }

    public String getZonaTerreno() {
        return zonaTerreno;
    }

    
}
