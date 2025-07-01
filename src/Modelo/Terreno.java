package Modelo;

public class Terreno extends Financiamento {

    private String zonaTerreno;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String zonaTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.zonaTerreno = zonaTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        double numeroParcelas = this.prazoFinanciamento * 12;
        double amortizacao = this.valorImovel / numeroParcelas;
        double jurosMensal = this.taxaJurosAnual / 12 / 100;
        double valorJuros = this.valorImovel * jurosMensal;
        double parcelaBase = amortizacao + valorJuros;

        return parcelaBase * 1.02;  // acréscimo de 2%
    }

    public String getZonaTerreno() {
        return zonaTerreno;
    }

    public String toString( ){

        StringBuilder sb = new StringBuilder();
        sb.append(this.getvalorImovel()).append("\n");
        sb.append(this.calcularTotalPagamento()).append("\n");
        
        return sb.toString();

    }
}
