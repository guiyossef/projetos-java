import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int n1;
        int n2;

        String operaçao = "";
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite uma método ou 'cancelar' para sair.");
        System.out.println(" '+', '-'', '*', '/':");
        operaçao = entrada.nextLine();

        if(operaçao.equals("cancelar")){
            System.out.println("operação cancelada.");
            return;
        }

        System.out.println("Digite o primeiro valor:");
        n1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o primeiro valor:");
        n2 = Integer.parseInt(entrada.nextLine());


        if(operaçao.equals("+")){
            System.out.println("O resultado da soma é:" + (n1 + n2));
        }

        if(operaçao.equals("-")){
            System.out.println("O resultado da subtração é:" + (n1 - n2));
        }

        if(operaçao.equals("*")){
            System.out.println("O resultado da multiplicação é:" + (n1 * n2)); 
        }

        if(operaçao.equals("/")){
            System.out.println("O resultado da divisão é:" + (n1 / n2)); 
        }
    }
}
