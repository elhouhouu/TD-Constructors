package EXO4.Model;
import java.util.*;

public class UsineAirbus extends Usine {

    Airbus unAvion;
    SatelliteTerrestre unSatellite;

    public UsineAirbus(String uneVille) {
        super(uneVille, "Airbus");
    }

    @Override
    public Avion fabriquerAvion(String modeleAvion, String marqueReacteur) {
        unAvion = new Airbus(marqueReacteur, modeleAvion);

        return unAvion;
    }

    @Override
    public Satellite fabriquerSatellite(String modeleSatellite) {
        unSatellite = new SatelliteTerrestre(modeleSatellite);

        return unSatellite;
    }
}