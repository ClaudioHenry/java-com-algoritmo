import java.util.*;
public class Salario2 {
    public static void main(String[]args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite seu sálario");
        int sal = entrada.nextInt();

        int imp = (sal * 10/100);
        int salreceber = (sal + 50 - imp);
        System.out.println("Seu salario agora sera de: " + salreceber); 
    }
}
