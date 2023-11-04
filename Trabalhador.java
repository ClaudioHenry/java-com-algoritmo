import java.util.Scanner;

public class Trabalhador {
    public static void main (String[]args){
        Scanner entrada;
        entrada = new Scanner (System.in);
        System.out.println("Informe seu salário: ");
        double salario = entrada.nextInt();
        System.out.println("Informe o cheque 1: ");
        double cheque1 = entrada.nextInt();
        System.out.println("Informe o cheque 2: ");
        double cheque2 = entrada.nextInt();

        double cpmf = (cheque1 * 0.38/100);
        double cpmf1 = (cheque2 * 0.38/100);
        double saldo = (salario - cheque1 - cheque2 - cpmf - cpmf1);

        System.out.println("O seu saldo é " + saldo);


    }
}
