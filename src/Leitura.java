import java.sql.SQLOutput;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = leitura.nextLine();
        System.out.println("Qual o ano de lançamento: ");
        int realeaseYear = leitura.nextInt();
        System.out.println("Qual nota você dá ao filme de 0 a 10: ");
        double movieScore = leitura.nextDouble();
        
        System.out.println(realeaseYear);
        System.out.println(filmeFavorito);
        System.out.println(movieScore);
    }
}
