import java.util.Scanner;

public class Ano {
    public static void main (String []args){
        Scanner entrada;
        entrada = new Scanner (System.in);
        System.out.println("Digite o ano atual: ");
        int ano = entrada.nextInt();
        System.out.println("Digite o ano do seu nascimento: ");
        int nascimento = entrada.nextInt();
        

        int idade_atual = (nascimento - ano);
        int idade2050 = (2050 - nascimento);
        System.out.println("Sua idade atual é: " + idade_atual);
        System.out.println("Sua idade quando for 2050 é : " + idade2050);
    }
}
