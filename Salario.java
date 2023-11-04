import java.util.Scanner;

public class Salario {
    public static void main(String []args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o sálario:");
        int sal = entrada.nextInt();
        System.out.println("Digite o percentual:");
        int perc = entrada.nextInt();
        int aumento = (sal * perc/100);
        int novosal = (sal + aumento);
        System.out.println("O seu novo sálario é: " + novosal);
    }
}
