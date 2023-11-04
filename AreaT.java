import java.util.*;
public class AreaT {
    public static void main (String []args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho da base: ");
        int base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        int altura = entrada.nextInt();

        int area = (base * altura)/2;
        System.out.println("O resultado da area é: " + area);

    }
}