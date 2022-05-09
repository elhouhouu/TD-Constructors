package EXO4.Model;
import java.util.*;

public class UsineAirbus extends Usine {

    Airbus unAvion;
    SatelliteTerrestre unSatellite;

    public UsineAirbus(String uneVille) {
        super(uneVille);
    }

    @Override
    public Avion fabriqueAvion(String modeleAvion, String marqueReacteur) {
        unAvion = new Airbus(marqueReacteur, modeleAvion);

        return unAvion;
    }

    @Override
    public Satellite fabriquerSatellite(String modeleSatellite) {
        unSatellite = new SatelliteTerrestre(modeleSatellite);

        return unSatellite;
    }
}