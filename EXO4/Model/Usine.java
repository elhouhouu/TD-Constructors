package EXO4.Model;
import java.util.*;

public abstract class Usine {

    private String ville;
    private String constructeur;

    public Usine(String uneVille, String unConstructeur) {
        ville=uneVille;
        constructeur = unConstructeur;
    }

    public abstract Avion fabriquerAvion(String modeleAvion, String marqueReacteur);

    public abstract Satellite fabriquerSatellite(String modeleSatellite);

    @Override
    public String toString() {
        return "Usine{" +
                "ville='" + ville + '\'' +
                '}';
    }
}