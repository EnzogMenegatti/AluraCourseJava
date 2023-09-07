import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int tentativas = 0;
        int valorAleatorio = new Random().nextInt(100);
        int guess = 0;
        int playertry = 0;

        System.out.println("tente adivinhar o numero de 1 a 100!");
        System.out.println("Insira um numero pra começar o jogo: ");

        while (guess != valorAleatorio && playertry < 5) {
            guess = leitura.nextInt();
            playertry++;

            if (guess > valorAleatorio) {
                System.out.println("Alto demais!");
            }
            if (guess < valorAleatorio) {
                System.out.println("Baixo demais!");
            }
            if (guess == valorAleatorio) {
                System.out.println("Muito bem! você acertou!");
            }
            if (playertry == 5) {
                System.out.println("Você ultrapassou suas tentativas! boa sorte na proxima :)");
            }
        }
    }
}
