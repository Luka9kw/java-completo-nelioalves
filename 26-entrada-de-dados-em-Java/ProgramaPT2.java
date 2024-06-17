import java.util.Scanner;
import java.util.Locale;

public class ProgramaPT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;

        // sc.nextLine(); lê a linha inteira ao inves de somente uma frase como next();

        x = sc.nextInt();
        sc.nextLine(); // Consumir o buffer de quebra da linha /n que sobrou da leitura anterior.
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

           }
}
