public class Condicional {
    public static void main(String[] args) {
        int year = 2022;
        boolean planIncluded;
        planIncluded = true;
        Double movieScore = 8.1;
        String planType = "plus";

        if (year >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (planIncluded && planType.equals("plus")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Locação necessaria");
        }
    }
}
