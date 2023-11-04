import java.util.Scanner;

public class Hora {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as horas atuais: ");
        double hora = entrada.nextDouble();
        double h =  Math.floor(hora);
        double m = (hora - h);
        double conversão = (h * 60) + (m * 100);
        System.out.println("As horas em minutos são: " + conversão);

    }
}
