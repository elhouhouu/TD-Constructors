public class Imprimante {

    private static Imprimante imprimante;
    private static int cptId;
    private static int totalPages;

    Imprimante() {
    }

    private static synchronized Imprimante getInstance() {
        if(imprimante == null) {
            imprimante = new Imprimante();
        }
        return imprimante;
    }

    public String getImprimante() {
        return "Imprimante n°"+ cptId++;
    }

    public String getNbPages() {
        return "Nombre de pages imprimées : "+ totalPages;
    }

    public void imprimer(int nbPages) {

        for(int i=0; i<nbPages; i++) {
            System.out.println("page numéro "+i);
            totalPages++;
        }
    }

}
