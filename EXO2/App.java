package EXO2;

public class App {

    public static void main(String[] args) {

        Imprimante imprimante = new Imprimante();

        imprimante.imprimer(5);
        imprimante.imprimer(15);
        System.out.println(imprimante.getNbPages());

    }
}
