package Modelo;

public class Casa extends Financiamento{

    private double areaConstruida;

    private double areaTerreno;


    public Casa(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual, double areaConstruida, double areaTerreno){
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    //Override
    public double calcularPagamentoMensal(){
        return calcularPagamentoMensal() + 80;
    }

    public double getAreaConstuida(){
        return areaConstruida;
    }

    public double getAreaTerreno(){
        return areaTerreno;
    }


}
