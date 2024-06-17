import java.util.Locale;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String hellWorld = "Olá Mundo!";
        String name = "Luka";
        int age = 23;
        double ageWithMonth = 23.5454654;

        // println = print line
        // printf = print formated

        // %s = string de texto
        // %n = quebra de linha
        // %d = numero inteiro
        // %f = ponto flutuante

        System.out.println(hellWorld);
        System.out.println("Me chamo " + name + ", tenho " + age + " anos e gostaria de aprender JAVA!!");
        System.out.printf("Me chamo %s, tenho %.2f anos e gostaria de aprender JAVA!!", name, ageWithMonth);


//        System.out.printf("%.2f%n", ageWithMonth);
//        System.out.printf("%.4f%n", ageWithMonth);


    }
}

