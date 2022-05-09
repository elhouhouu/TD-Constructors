package EXO4.Model;
import java.util.*;

public class Immatriculation {

    private static Immatriculation reference = null;
    private static int cptId;

    public Immatriculation() {
    }

    public static Immatriculation getImmatriculation() {
        if(reference==null)
            reference = new Immatriculation();

        return reference;
    }

}