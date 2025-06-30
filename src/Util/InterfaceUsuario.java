package Util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {

    private Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        double valor = -1;
        while (valor <= 0) {
            try {
                System.out.print("Digite o valor do imóvel (maior que 0): R$ ");
                valor = scanner.nextDouble();
                if (valor <= 0) {
                    System.out.println("Valor inválido. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor digite um número válido.");
                scanner.nextLine(); // limpar buffer
            }
        }
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int prazo = 0;
        while (prazo < 1) {
            try {
                System.out.print("Digite o prazo do financiamento em anos (mínimo 1): ");
                prazo = scanner.nextInt();
                if (prazo < 1) {
                    System.out.println("Prazo inválido. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor digite um número inteiro.");
                scanner.nextLine();
            }
        }
        return prazo;
    }

    public double pedirTaxaJuros() {
        double taxa = -1;
        while (taxa < 0) {
            try {
                System.out.print("Digite a taxa de juros anual (ex: 0.05 para 5%): ");
                taxa = scanner.nextDouble();
                if (taxa < 0) {
                    System.out.println("Taxa inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor digite um número válido.");
                scanner.nextLine();
            }
        }
        return taxa;
    }

    public int pedirOpcao(int min, int max) {
        int opcao = -1;
        while (opcao < min || opcao > max) {
            try {
                System.out.printf("Escolha uma opção (%d-%d): ", min, max);
                opcao = scanner.nextInt();
                if (opcao < min || opcao > max) {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor digite um número inteiro.");
                scanner.nextLine();
            }
        }
        return opcao;
    }

    public double pedirAreaConstruida() {
        double area = -1;
        while (area <= 0) {
            try {
                System.out.print("Digite a área construída (em m²): ");
                area = scanner.nextDouble();
                if (area <= 0) {
                    System.out.println("Área inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor digite um número válido.");
                scanner.nextLine();
            }
        }
        return area;
    }

    public double pedirAreaTerreno() {
        double area = -1;
        while (area <= 0) {
            try {
                System.out.print("Digite a área do terreno (em m²): ");
                area = scanner.nextDouble();
                if (area <= 0) {
                    System.out.println("Área inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor digite um número válido.");
                scanner.nextLine();
            }
        }
        return area;
    }

    public int pedirVagasGaragem() {
        int vagas = -1;
        while (vagas < 0) {
            try {
                System.out.print("Digite o número de vagas de garagem (0 ou mais): ");
                vagas = scanner.nextInt();
                if (vagas < 0) {
                    System.out.println("Número inválido. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor digite um número inteiro.");
                scanner.nextLine();
            }
        }
        return vagas;
    }

    public int pedirNumeroAndar() {
        int andar = Integer.MIN_VALUE;
        while (andar == Integer.MIN_VALUE) {
            try {
                System.out.print("Digite o número do andar: ");
                andar = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, por favor digite um número inteiro.");
                scanner.nextLine();
            }
        }
        return andar;
    }

    public String pedirZona() {
        String zona = "";
        while (zona.isBlank()) {
            System.out.print("Digite o tipo de zona (residencial ou comercial): ");
            // Limpa buffer antes de ler string, caso venha depois de nextInt/Double
            scanner.nextLine();
            zona = scanner.nextLine().trim().toLowerCase();

            if (!zona.equals("residencial") && !zona.equals("comercial")) {
                System.out.println("Zona inválida. Digite 'residencial' ou 'comercial'.");
                zona = "";
            }
        }
        return zona;
    }
}
