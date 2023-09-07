// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int year = 2022;
        System.out.println("ano de lançamento: " + year);
        boolean planIncluded = false;
        Double movieScore = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        int stars = (int) (media /2);


        String synopse = """
                        Filme de aventura com galã dos anos 80
                        Muito bom!
                        Ano de lançamento: %d
                        Estrelas: %d estrelas
                         """.formatted(year, stars);
        System.out.println(synopse);





        //formatação.
        /*String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));*/

        //formatação em text block.
        /*String nome = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(mensagem);*/
    }
}