import java.util.Scanner;

public class Saco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso do saco: ");
        int pesoSaco = entrada.nextInt();

        System.out.print("Digite a ração do gato 1: ");
        int racaoGato1 = entrada.nextInt();

        System.out.print("Digite a ração do gato 2: ");
        int racaoGato2 = entrada.nextInt();

        int totalRacaoDiaria = (racaoGato1 + racaoGato2) * 5; // Ração consumida por dia pelos dois gatos durante cinco dias

        int totalRacaoRestante = pesoSaco - totalRacaoDiaria; // Cálculo do total restante no saco após cinco dias

        System.out.println("A quantidade de ração restante após cinco dias é: " + totalRacaoRestante);
    }
}
