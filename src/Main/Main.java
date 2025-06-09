package Main;


public class Main {
    public static void main(String[] args){
        double taxaJurosAnual = interfaceUsuario.pedirTaxaJuros();
        int prazoFinanciamentoAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamentoAnos, taxaJurosAnual);
        
        double mensal = novoFinanciamento.calcularPagamentoMensal();
        double total = novoFinanciamento.calcularTotalPagamento();

        System.out.printf("Pagamento mensal: R$ %.2f\n", mensal );
        System.out.printf("Total a pagar: R$ %.2f\n", total);
    }
}
