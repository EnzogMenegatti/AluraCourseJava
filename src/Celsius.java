import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double temperatura = 0;
        double conversao = 0;


        System.out.println("Convertor de temperatura C° para F°.");
        System.out.println("Insira aqui a temperatura em C°: ");
        temperatura = leitura.nextDouble();

        conversao = (temperatura * 1.8) + 32;

        System.out.println("A temperatura em F° é:" + conversao + ".");
    }
}
