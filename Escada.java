import java.util.Scanner;

public class Escada {
    public static void main (String[]args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite a altura da escada: ");
        int altura = entrada.nextInt();
        System.out.println("Digite a altura do degrau: ");
        int degrau = entrada.nextInt();

        int escada = (altura / degrau);
        System.out.println("A quantidade de degrau é: " + escada);

    }
    
}
