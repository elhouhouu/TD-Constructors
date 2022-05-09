package EXO4.Model;
import java.util.*;

public abstract class Avion {

    private String modele;
    private Fuselage fuselage;

    public Avion(String unModele) {
        modele= unModele;
    }

    public Fuselage getFuselage() {
        return fuselage;
    }
}