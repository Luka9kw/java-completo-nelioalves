import java.util.Scanner;
import java.util.Locale;

public class Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double triangulo, circulo, trapezio, quadrado, retangulo;
        triangulo = (a * c) / 2;
        circulo = 3.14159 * (c * c);
        trapezio = (a + b) * c / 2;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("TRIANGULO = %.3f%n", triangulo);
        System.out.printf("CIRCULO = %.3f%n", circulo);
        System.out.printf("TRAPEZIO = %.3f%n", trapezio);
        System.out.printf("QUADRADO = %.3f%n", quadrado);
        System.out.printf("RETANGULO = %.3f%n", retangulo);

        sc.close();
    }
}
