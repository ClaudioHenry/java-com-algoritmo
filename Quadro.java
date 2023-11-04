import java.util.Scanner;

public class Quadro {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o tamanho da escada: ");
        int z = entrada.nextInt();
        System.out.println("Digite a altura que você deseja pregar o quadro: ");
        int x = entrada.nextInt();

        int y = (z * z - x * x);
        double y1 = (Math.pow(y , 2));
        System.out.println("A distencia em que deseja ficar a escada: " + y + y1);
    }
}
