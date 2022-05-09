package EXO4.Model;

import java.util.*;

public class Boeing extends Avion {

    private String marque;

    public Boeing(String uneMarque, String unModele) {
        super(unModele);
        marque=uneMarque;
    }

}