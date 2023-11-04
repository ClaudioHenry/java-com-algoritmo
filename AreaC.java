import java.util.*;
public class AreaC {
    public static void main (String []args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Declare o tamanho do raio do circulo: ");
        double raio = entrada.nextDouble();

        double area = Math.PI * Math.pow(raio,2);
        System.out.println("A area do circulo: " + area);

    }
}
