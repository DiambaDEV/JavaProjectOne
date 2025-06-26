package Modelo;

public abstract class Financiamento {

    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;

    // ✅ Todos os métodos devem ser public
    public double getvalorImovel() {
        return valorImovel;
    }

    public int getprazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double gettaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual){
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public abstract double calcularPagamentoMensal();

    public double calcularTotalPagamento(){
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }
}
