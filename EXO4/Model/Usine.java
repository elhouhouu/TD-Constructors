package EXO4.Model;
import java.util.*;

public abstract class Usine {

    private String ville;

    public Usine(String uneVille) {
        ville=uneVille;
    }

    public abstract Avion fabriqueAvion(String modeleAvion, String marqueReacteur);

    public abstract Satellite fabriquerSatellite(String modeleSatellite);

    @Override
    public String toString() {
        return "Usine{" +
                "ville='" + ville + '\'' +
                '}';
    }
}