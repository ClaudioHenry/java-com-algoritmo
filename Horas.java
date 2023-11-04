import java.util.Scanner;

public class Horas {
    public static void main(String[]args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o valor do salario mínimo: ");
        int sal = entrada.nextInt();
        System.out.println("Digite o valor de horas trabalhadas por dia: ");
        int horas = entrada.nextInt();

        int valorHoras = (sal / 2);
        int salbruto = (valorHoras * horas);
        int imp = (salbruto * 3/100);
        int sal_liquido = (salbruto - imp);
        System.out.println("O  valor do salario liquido é: " + sal_liquido);


    }
}
