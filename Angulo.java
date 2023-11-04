import java.text.DecimalFormat;
import java.util.Scanner;

public class Angulo {
    public static void main (String[]args){
        Scanner entrada;
        DecimalFormat df = new DecimalFormat("0.00"); 
        entrada = new Scanner (System.in);
        System.out.println("Digite a medida do angulo: ");
        double anguloR = entrada.nextDouble();
        double anguloRA = Math.sin(anguloR);
        System.out.println("Digite a altura da escada: ");
        double altura = entrada.nextDouble();

        double radiano = (anguloRA * 3.14 / 180);
        double escada = (altura / Math.toRadians(radiano));
        System.out.println("O comprimento da escada é: " + df.format(escada));
    }
}
