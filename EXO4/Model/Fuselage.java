package EXO4.Model;

import java.util.*;

public class Fuselage {

    private String marque;
    private int poids;
    private int capacité;
    private int poussée;
    public ArrayList<Réacteur> listReacteurs;

    public Fuselage(String uneMarque, int unPoids, int uneCapa, int unePoussee) {
        marque=uneMarque;
        poids=unPoids;
        capacité=uneCapa;
        poussée=unePoussee;
        listReacteurs= new ArrayList<>();
    }

    public ArrayList<Réacteur> getListReacteurs() {
        return listReacteurs;
    }
}