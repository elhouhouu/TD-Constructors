package EXO4.Model;
import java.util.*;

public class UsineBoeing extends Usine {

    Boeing unAvion;
    SatelliteEspace unSatellite;

    public UsineBoeing(String uneVille) {
        super(uneVille);
    }

    @Override
    public Avion fabriqueAvion(String modeleAvion, String marqueReacteur) {
        unAvion = new Boeing(marqueReacteur, modeleAvion);

        return unAvion;
    }

    @Override
    public Satellite fabriquerSatellite(String modeleSatellite) {
        unSatellite = new SatelliteEspace(modeleSatellite);

        return unSatellite;
    }
}