package Modelo;

public class Casa extends Financiamento {

    private double areaConstruida;
    private double areaTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double areaTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        double numeroParcelas = this.prazoFinanciamento * 12;
        double amortizacao = this.valorImovel / numeroParcelas;
        double jurosMensal = this.taxaJurosAnual / 12 / 100;
        double valorJuros = this.valorImovel * jurosMensal;
        double pagamentoMensal = amortizacao + valorJuros;

        return pagamentoMensal;
    }

    public void validarAcrecimo(double valorAcrecimo) throws AcrescimoMaiorDoQueJurosException {
        double pagamentoBase = calcularPagamentoMensal();

        double numeroParcelas = this.prazoFinanciamento * 12;
        double amortizacao = this.valorImovel / numeroParcelas;
        double valorJuros = pagamentoBase - amortizacao;

        if (valorAcrecimo > (valorJuros / 2)) {
            throw new AcrescimoMaiorDoQueJurosException("O acréscimo de R$" + valorAcrecimo + " é maior do que metade dos juros da mensalidade.");
        }
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public double getAreaTerreno() {
        return areaTerreno;
    }
}
