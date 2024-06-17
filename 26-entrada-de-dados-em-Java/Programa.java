import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // x = sc.next(); escreve String
        // x = sc.nextLine(); lê a linha inteira ao inves de somente uma frase como next();
        // x = sc.next().charAt(0); // escreve um char em uma posicão especifica

        // x = sc.nextInt(); escreve numero inteiro
        // x = sc.nextDouble(); escreve numero de ponto flutuante (tem que adaptar para usar o ponto com Locale.US)

        //printf necessário junto do Locale para definir se vai usar pontos ou virgulas (com Locale (.), sem locale (,).


        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();


        System.out.println("Você digitou:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



        sc.close();
    }
}