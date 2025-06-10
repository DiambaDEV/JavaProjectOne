//Define a classe esta no package util.
package Util; 

//Importa a classe Scanner, usada para ler entradas no console.
import java.util.Scanner; 

//Aqui é criada a classe, onde, entram os atributos e métodos.
//É um modelo do objeto, assim como,um protótipo.
public class InterfaceUsuario {

/*O scanner é um atributo privado da classe.
 Isso permite que todos os métodos usem 
 o mesmo scanner, evitando conflitos.
*/
    private Scanner scanner;

/*QUando um objeto de InterfaceUsuario é criado,
o Scanner é inicializado, pronto para ler dados.
*/
    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        double valor = -1;
        while (valor <= 0) {
            System.out.print("Digite o valor do imóvel (maior que 0): R$ ");
            valor = scanner.nextDouble();
            if (valor <=0) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int prazo =0; 
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
        while (taxa <  0) {
            System.out.println("Digite a taxa de juros anual (ex: 0.05 para 5%): ");
            taxa = scanner.nextDouble();
            if (taxa < 0) {
                System.out.println("Taxa inválida. Tente novamente.");
            }
        }
        return taxa;
    }
}
