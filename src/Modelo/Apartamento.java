package Modelo;

public class Apartamento extends Financiamento {
    
    public Apartamento(double valorDesejadoImovel, int prazoFinanciamento, double taxaJurosAnual){
        super(valorDesejadoImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double calcularPagamentoMensal() {
        double taxaMensal = gettaxaJurosAnual() / 12;
        int prazoEmMeses = getprazoFinanciamento() * 12;

        double fator = Math.pow(1 + taxaMensal, prazoEmMeses);
        double parcela = getvalorImovel() * (taxaMensal * fator) / (fator - 1);

        return parcela;
    }
}
