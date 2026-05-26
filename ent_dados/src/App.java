import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Lê uma String 
        String x;
        x = sc.next();
        */

        /* Lê um inteiro
        int x;
        x = sc.nextInt(); 
        */

        /* Lê um número double 
        double x;
        x = sc.nextDouble();
        */

        /* Lê um char 
        char x;
        x = sc.next().charAt(0);
        */

        /* Lê vários dados na mesma linha */
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }

}
