package application;

import util.CurrencyConverter;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dolarCalc(price, quantity));

        sc.close();
    }
}
