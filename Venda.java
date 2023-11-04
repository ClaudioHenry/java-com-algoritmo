import java.util.Scanner;

public class Venda {
    public static void main (String[]args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o valor do véiculo de fábrica: ");
        double vF = entrada.nextDouble();
        System.out.println("Digite o valor do lucro do distribuidor: ");
        double luD = entrada.nextDouble();
        System.out.println("Digite o valor do percentual de imposto: ");
        double pI = entrada.nextDouble();

        double vD = (vF * luD/100);
        double vI = (vF * pI/100);
        double total = (vF + vD + vI);
        System.out.println("O valor dos impostos é de: " + vI);
        System.out.println("O valor do distribuidor é: " + vD);
        System.out.println("O valor total do veiculo é: " + total);

    }
}
