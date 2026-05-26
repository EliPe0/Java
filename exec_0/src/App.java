import java.util.Locale; // Importação da classe Locale para configurar a formatação

public class App {
    
    public static void main(String[] args) {

        String product1 = "Computer"; // String nome do produto
        String product2 = "Office desk";

        int age = 30; // int para idade
        int code = 5290;
        char gender = 'F'; // char para o gênero

        double price1 = 2100.0; // double para preço, com ponto para separar o decimal
        double price2 = 650.50;
        double measure = 52.234567;

        System.out.println("Products:"); // Início do programa no console
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US); // Formatação para o padrão americano, onde não usa vírgula para separar decimais
        System.out.printf("US decimal point: %.3f", measure);

    }
}