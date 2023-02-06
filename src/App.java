import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os numeros:");
        double n1 = Double.parseDouble(sc.nextLine());
        double n2 = Double.parseDouble(sc.nextLine());

        System.out.print("Digite o tipo de operação(Multiplicar, Dividir, Somar, Subtrair):");
        String art = sc.nextLine();

        if(art.equals("Multiplicar")){
            double total = n1 * n2;
            System.out.println(total);
        }
        else if(art.equals("Dividir")){
            double total = n1 / n2;
            System.out.println(total);
        }
        else if(art.equals("Subtrair")){
            double total = n1 - n2;
            System.out.println(total);
        }
        else{
            double total = n1 + n2;
            System.out.println(total);
        }
    }
}
