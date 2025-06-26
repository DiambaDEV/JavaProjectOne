package Main;

import Modelo.Financiamento;
import Modelo.Casa;
import Modelo.Apartamento;
import Modelo.Terreno;
import Util.InterfaceUsuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // 1. Permitir ao usuário escolher o tipo de financiamento
        System.out.println("Escolha o tipo de imóvel:");
        System.out.println("1 - Casa");
        System.out.println("2 - Apartamento");
        System.out.println("3 - Terreno");
        int tipo = interfaceUsuario.pedirOpcao(1, 3);

        double taxaJurosAnual = interfaceUsuario.pedirTaxaJuros();
        int prazoFinanciamentoAnos = interfaceUsuario.pedirPrazoFinanciamento();
        double valorImovel = interfaceUsuario.pedirValorImovel();

        Financiamento financiamentoUsuario = null;

        switch (tipo) {
            case 1:
                double areaConstruida = interfaceUsuario.pedirAreaConstruida();
                double areaTerreno = interfaceUsuario.pedirAreaTerreno();
                financiamentoUsuario = new Casa(valorImovel, prazoFinanciamentoAnos, taxaJurosAnual, areaConstruida, areaTerreno);
                break;
            case 2:
                int vagas = interfaceUsuario.pedirVagasGaragem();
                int andar = interfaceUsuario.pedirNumeroAndar();
                financiamentoUsuario = new Apartamento(valorImovel, prazoFinanciamentoAnos, taxaJurosAnual, vagas, andar);
                break;
            case 3:
                String zona = interfaceUsuario.pedirZona();
                financiamentoUsuario = new Terreno(valorImovel, prazoFinanciamentoAnos, taxaJurosAnual, zona);
                break;
        }

        financiamentos.add(financiamentoUsuario);

        // 2. Financiamentos com dados fixos (exemplo de teste)
        Financiamento casa1 = new Casa(200000, 15, 0.09, 120, 200);
        Financiamento casa2 = new Casa(250000, 20, 0.085, 150, 250);
        Financiamento apto1 = new Apartamento(300000, 30, 0.10, 2, 5);
        Financiamento apto2 = new Apartamento(180000, 10, 0.11, 1, 2);
        Financiamento terreno1 = new Terreno(120000, 8, 0.12, "Residencial");

        financiamentos.add(casa1);
        financiamentos.add(casa2);
        financiamentos.add(apto1);
        financiamentos.add(apto2);
        financiamentos.add(terreno1);

        // 3. Mostrar os financiamentos
        double somaValorImoveis = 0;
        double somaTotalPagamento = 0;

        for (Financiamento f : financiamentos) {
            double parcela = f.calcularPagamentoMensal();
            double total = f.calcularTotalPagamento();

            System.out.println("-----------------------------------");
            System.out.printf("Imóvel de valor: R$ %.2f%n", f.getvalorImovel());
            System.out.printf("Pagamento mensal: R$ %.2f%n", parcela);
            System.out.printf("Total a pagar: R$ %.2f%n", total);

            somaValorImoveis += f.getvalorImovel();
            somaTotalPagamento += total;
        }

        System.out.println("===================================");
        System.out.printf("Soma dos valores dos imóveis: R$ %.2f%n", somaValorImoveis);
        System.out.printf("Soma dos valores dos financiamentos: R$ %.2f%n", somaTotalPagamento);
    }
}
