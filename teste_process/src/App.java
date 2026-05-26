public class App {

    public static void main(String[] args) {
        
       /* Exemplo 1
        int x, y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);
        */

        /*  Exemplo 2
        int x;
        double y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);
        */

        /*  Exemplo 3
        double b, B, h, area;

        b = 6f;
        B = 8f;
        h = 5f;

        area = (b + B) / 2f * h;

        Boa prática utilizar f ao invés de .0, não obrigatório porém pode dar problemas em alguns casos

        System.out.println(area);
        */

        /* Exemplo 4

        int a, b;
        double resultado;

        a = 5;
        b = 2;

        // resultado = a / b; o compilador interpreta que é uma divisão de números inteiros e não double
        resultado = (double) a / b;

        System.out.println(resultado);
        */

        // Exemplo 5

        double a;
        int b;

        a = 5.0;
        b = (int) a;

        System.out.println(b);
    }
}
