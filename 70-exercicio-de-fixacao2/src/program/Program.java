package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Class;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Class c = new Class();

        System.out.println("Insert your name: ");
        c.name = sc.nextLine();
        System.out.println("Insert your gross salary: ");
        c.grossSalary = sc.nextDouble();
        System.out.println("Insert your salary tax: ");
        c.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee name: " + c);
        System.out.println();
        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        c.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + c);
        sc.close();

    }
}
