package EXO4.Model;
import java.util.*;

public class Fuselage {

    private String marque;
    private int poids;
    private int capacite;
    private int poussee;
    public ArrayList<Reacteur> listReacteurs;

    public Fuselage(String uneMarque, int unPoids, int uneCapa, int unePoussee) {
        marque=uneMarque;
        poids=unPoids;
        capacite=uneCapa;
        poussee=unePoussee;
        listReacteurs= new ArrayList<>();
    }

    public ArrayList<Reacteur> getListReacteurs() {
        return listReacteurs;
    }

    @Override
    public String toString() {
        return "Fuselage{" +
                "marque='" + marque + '\'' +
                ", poids=" + poids +
                ", capacite=" + capacite +
                ", poussee=" + poussee +
                ", Réacteurs=" + listReacteurs.size() +
                '}';
    }
}