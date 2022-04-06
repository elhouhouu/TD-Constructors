package EXO3;

public class App {

    public static void main(String[] args) {

        Banque cic = new Banque();

        System.out.println(cic.getCarteCredit("mastercard").fonction());
        System.out.println(cic.getCarteDebit("visa").fonction());

    }
}
