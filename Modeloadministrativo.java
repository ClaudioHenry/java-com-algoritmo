import java.util.*;

public class Modeloadministrativo {
    public static void main(String[] args){
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário atual: ");
        int sal = entrada.nextInt();

        int cinquenta = (sal * 50/100);
        System.out.println("Esse vai ser o valor no qual você vai usar para despesas obrigatórias: " + cinquenta);

        int trinta = (sal * 30/100);
        System.out.println("Esse vai ser o valor no qual você vai usar para gastos fixos e essenciais: " + trinta);
        
        int vinte = (sal * 20/100);
        System.out.println("Esse vai ser o valor no qual você vai usar para prioridades financeiras e investir: " + vinte);

        int total = (cinquenta + trinta + vinte);
        System.out.println("Valor total: " + total);
    }

}
