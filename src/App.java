
import java.util.Scanner;

class Financiamento {

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

class InterfaceUsuario {
Scanner sc = new Scanner(System.in);

    double pedirValorImovel(){
        System.out.println("Digite o valor do imóvel: ");
        return sc.nextDouble();
    }
    int pedirPrazoFinanciamento(){
        System.out.println("Digite o prazo do financiamento (em anos): ");
        return sc.nextInt();
    }
    double pedirTaxaJuros(){
        System.out.println("Digite a taxa de juros anual (ex: 0.08 para 8%): ");
        return sc.nextDouble();
    }
}

public class App {
    public static void main(String[] args){

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

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
