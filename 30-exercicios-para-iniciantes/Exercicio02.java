import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextFloat();
        double pi = 3.14159d;
        double area = pi * (raio * raio);

        System.out.printf("A: %.4f", area);
    }


}
