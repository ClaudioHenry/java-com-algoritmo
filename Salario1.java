import java.util.*;
public class Salario1 {
    public static void main(String []args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o seu sálario: ");
        int salar = entrada.nextInt();

        int grat = (salar * 5/100);
        int imp = (salar * 7/100);
        
        int salareceber = (salar + 50 - imp);
        System.out.println("O sálario com as alteraçoes será de: " + salareceber);


    }
}
