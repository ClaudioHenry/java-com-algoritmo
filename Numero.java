import java.util.Scanner;
import java.util.Locale;

public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Definir o Locale para aceitar ponto como separador decimal

        System.out.println("Digite um número real: ");
        double numero = scanner.nextDouble();

        int parteInteira = (int) numero;
        double parteFracionaria = (numero - parteInteira);
        double parteArrendondada = Math.round(numero);

        System.out.println("Parte inteira: " + parteInteira);
        System.out.println("Parte fracionaria: " + parteFracionaria);
        System.out.println("Parte arredondada: " + parteArrendondada);

        scanner.close();
    }
}
