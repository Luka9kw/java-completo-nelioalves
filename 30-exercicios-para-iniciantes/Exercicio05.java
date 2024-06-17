import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1, code2, number1, number2;
        double value1, value2, payValue;

        code1 = sc.nextInt();
        number1 = sc.nextInt();
        value1 = sc.nextDouble();

        code2 = sc.nextInt();
        number2 = sc.nextInt();
        value2 = sc.nextDouble();

        payValue = (double) number1 * value1 + number2 * value2;
        System.out.printf("VALOR A PAGAR: R$ %.2f", payValue);

        sc.close();
    }
}
