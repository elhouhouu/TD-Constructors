public class App {

    public static void main(String[] args) {

        /*
        for(int i=0; i<40; i++) {
            Identifiant id = new Identifiant();
            System.out.println(id.getTicket());
        }
        */

        Imprimante imprimante = new Imprimante();

        imprimante.imprimer(5);
        imprimante.imprimer(15);
        System.out.println(imprimante.getNbPages());

    }
}
