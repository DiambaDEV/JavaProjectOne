package Modelo;

public class Apartamento extends Financiamento {
    
    private int vagasGaragem;
    private int numeroAndar;

    public Apartamento(double valorDesejadoImovel, int prazoFinanciamento, double taxaJurosAnual, int vagasGaragem, int numeroAndar){
        super(valorDesejadoImovel, prazoFinanciamento, taxaJurosAnual);
        this.vagasGaragem = vagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    //@Override
    public double calcularPagamentoMensal() {
        double taxaMensal = gettaxaJurosAnual() / 12;
        int prazoEmMeses = getprazoFinanciamento() * 12;

        double fator = Math.pow(1 + taxaMensal, prazoEmMeses);
        double parcela = getvalorImovel() * (taxaMensal * fator) / (fator - 1);

        return parcela;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }
}
