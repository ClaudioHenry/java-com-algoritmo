import java.util.*;

public class Depósito {
    public static void main (String []args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        int dep = entrada.nextInt();
        System.out.println("Digite o valor da taxa:" );
        int taxa = entrada.nextInt();

        int rend = (dep * taxa/100);
        int total = (dep + rend);
        System.out.println("O valor do seu rendimento foi de: " + rend);
        System.out.println("O valor do seu total foi de: " + total);
    }
}
