public class Main {
    public static void main(String[] args) {
        double a;
        int b;
        int resultado;

        a = 5.0;
        b = (int) a;  // Definir o tipo força o resultado a ser o tipo especificado.

        resultado = (int) a + b;

        System.out.println(b);
        System.out.print(resultado);
    }
}
