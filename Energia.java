import java.util.Scanner;

public class Energia {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        int salario = entrada.nextInt();
        System.out.println("Digite a quantidade de quilowatts gasto em sua residência: ");
        int quilo = entrada.nextInt();

        int vlr_qui = 264;
        int vlr_reais = (vlr_qui * quilo);
        int desc = (vlr_reais * 15/100);
        int vlr_desc = (vlr_reais - desc);
        int total = (salario - vlr_desc);
        System.out.println("O valor em reais é: " + vlr_reais);
        System.out.println("O valor  do quilowatts é : " + vlr_qui);
        System.out.println("O valor do total com desconto : " + vlr_desc);
        System.out.println("O valor restante depois de pagar é : " + total);
    }
}
