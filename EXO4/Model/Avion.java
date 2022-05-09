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

    public void setFuselage(Fuselage fuselage) {
        this.fuselage = fuselage;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "Modèle='" + modele + '\'' +
                ", Fuselage=" + fuselage.getPoids() +
                ", Capacité=" + fuselage.getCapacite() +
                ", Nb réacteurs=" + fuselage.getListReacteurs().size() +
                ", Marque=" + fuselage.getListReacteurs().get(0).getMarque() +
                ", Poids=" + fuselage.getPoids() +
                ", Poussée=" + fuselage.getPoussee() +
                '}';
    }
}