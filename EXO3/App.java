package EXO3;

public class App {

    public static void main(String[] args) {

        Banque uneBanque = new Banque("Crédit agricole");

        System.out.println(uneBanque+" "+uneBanque.getCarteCredit("mastercard").fonction());
        System.out.println(uneBanque+" "+uneBanque.getCarteDebit("visa").fonction());

    }
}
