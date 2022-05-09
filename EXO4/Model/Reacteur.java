package EXO4.Model;

public class Reacteur {

    private String marque;
    private String modele;

    public Reacteur(String uneMarque, String unModele) {
        marque=uneMarque;
        modele=unModele;
    }

    public String getMarque() {
        return marque;
    }

    @Override
    public String toString() {
        return "Reacteur{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                '}';
    }
}