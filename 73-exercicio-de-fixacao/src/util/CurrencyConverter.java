package util;

public class CurrencyConverter {

    public static double dolarCalc(double dolarValue, double dolarQuant) {
        return (dolarValue * 0.06 + dolarValue) * dolarQuant ;
    }

}