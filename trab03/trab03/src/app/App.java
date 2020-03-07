package app;
import java.util.Scanner;
import poupancaconta.Poupancaconta;

public class App {
    public static void main(String[] args) throws Exception {
        Poupancaconta conta = new Poupancaconta();
        Scanner sc = new Scanner(System.in);

        double dinheiro = 0.0;

        System.out.println("\t\t[]======================[]");
        System.out.println("\t\t[] Número da conta   []");
        System.out.print("\t\t[]======================[]");
        int numero = sc.nextInt();
        conta.setnumconta(numero);


        
        System.out.println("\t\t[] Informe a operação []");
        System.out.print("\t\t[]======================[]");
        System.out.println("\t\t[]    0: Sair         [] ");
        System.out.print("\t\t[]======================[]");
        System.out.println("\t\t[]    1: Sacar        []");
        System.out.print("\t\t[]======================[]");
        System.out.println("\t\t[]   2: Deposito      []");
        System.out.print("\t\t[]======================[]");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("\t\t---------------------------------------");
                System.out.println("\t\t---------- 1 = SACAR ------------------");
                System.out.println("\t\t---------------------------------------");

                dinheiro = sc.nextDouble();
                conta.sacar(dinheiro);

                break;

            case 2:
                System.out.println("\t\t---------------------------------------");
                System.out.println("\t\t---------- 2 = DEPOSITAR ------------------");
                System.out.println("\t\t---------------------------------------");
                
                dinheiro = sc.nextDouble();
                conta.depositar(dinheiro);

                break;
        
            default:
                System.out.println("\t\t---------------------------------------");
                System.out.println("\t\t---------- 0 = SAIR ------------------");
                System.out.println("\t\t---------------------------------------");

                break;
        }
        
        System.out.println(conta);
        System.out.println("\t\t---------------------------------------");
        System.out.println("\t\t---------- VOCÊ SAIU DE SUA CONTA ------------------");
        System.out.println("\t\t---------------------------------------");

        sc.close();
    }
    
}