package EXO4.Model;

import java.util.*;

public class Usine {

    private String ville;

    public Usine(String uneVille) {
        ville=uneVille;
    }


    public Avion fabriqueAvion(String modeleAvion, String marqueReacteur) {
        //Avion unAvion = new Avion(modeleAvion, )
        return null;
    }

    public Satellite fabriquerSatellite() {

        return null;
    }


    @Override
    public String toString() {
        return "Usine{" +
                "ville='" + ville + '\'' +
                '}';
    }
}