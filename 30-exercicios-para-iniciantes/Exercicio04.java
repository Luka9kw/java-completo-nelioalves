import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        float hours = sc.nextFloat();
        int value = sc.nextInt();


        float salary = value * hours;

        System.out.printf("NUMBER: %d%n", number);
        System.out.printf("SALARY: %.2f%n", salary);
    }
}
