package EXO4.Model;

import java.util.*;

public class Airbus extends Avion {

    private String marque;

    public Airbus(String uneMarque, String unModele) {
        super(unModele);
        marque=uneMarque;
    }

}