import java.util.Scanner;

public class Teatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do custo do espetáculo: ");
        int custo = entrada.nextInt();
        
        int convite = 0; // Inicializando o valor do convite

        while (convite <= 0) {
            System.out.println("Digite o valor do convite (deve ser maior que zero): ");
            convite = entrada.nextInt();
        }

        int quantidade = custo / convite;
        System.out.println("O número de convites que devem ser vendidos para a peça teatral é: " + quantidade);
    }
}
