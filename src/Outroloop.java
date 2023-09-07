import java.util.Scanner;

public class Outroloop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int scoreBulk = 0;

        while (nota != -1) {
            System.out.println("Qual nota você dá ao filme de 0 a 10 ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                scoreBulk++;
            }
        }

        System.out.println("Media de avaliações: " + mediaAvaliacao/scoreBulk);
    }
}
