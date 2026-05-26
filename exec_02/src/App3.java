import java.util.Scanner;
import java.util.Locale;

public class App3 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horas * valorHora;

        System.out.printf("Number: %d%n", numero);
        System.out.printf("Salary: U$ %.2f%n", salario);

        sc.close();

    }

}
