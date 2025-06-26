package Util; 

import java.util.Scanner; 

public class InterfaceUsuario {

    private Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        double valor = -1;
        while (valor <= 0) {
            System.out.print("Digite o valor do imóvel (maior que 0): R$ ");
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int prazo = 0; 
        while (prazo < 1) {
            System.out.println("Digite o prazo do financiamento em anos (mínimo 1): ");
            prazo = scanner.nextInt();
            if (prazo < 1) {
                System.out.println("Prazo inválido. Tente novamente.");
            }
        }
        return prazo;
    }

    public double pedirTaxaJuros() {
        double taxa = -1;
        while (taxa < 0) {
            System.out.println("Digite a taxa de juros anual (ex: 0.05 para 5%): ");
            taxa = scanner.nextDouble();
            if (taxa < 0) {
                System.out.println("Taxa inválida. Tente novamente.");
            }
        }
        return taxa;
    }

    public int pedirOpcao(int min, int max) {
        int opcao = -1;
        while (opcao < min || opcao > max) {
            System.out.printf("Escolha uma opção (%d-%d): ", min, max);
            opcao = scanner.nextInt();
            if (opcao < min || opcao > max) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        return opcao;
    }

    public double pedirAreaConstruida() {
        System.out.print("Digite a área construída (em m²): ");
        return scanner.nextDouble();
    }

    public double pedirAreaTerreno() {
        System.out.print("Digite a área do terreno (em m²): ");
        return scanner.nextDouble();
    }

    public int pedirVagasGaragem() {
        System.out.print("Digite o número de vagas de garagem: ");
        return scanner.nextInt();
    }

    public int pedirNumeroAndar() {
        System.out.print("Digite o número do andar: ");
        return scanner.nextInt();
    }

    public String pedirZona() {
        System.out.print("Digite o tipo de zona (residencial ou comercial): ");
        scanner.nextLine(); // limpa buffer
        return scanner.nextLine();
    }
}
