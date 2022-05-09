package EXO4.Model;

import java.util.*;

/**
 * 
 */
public class Réacteur {

    private String marque;
    private String modele;

    public Réacteur(String uneMarque, String unModele, Fuselage unFuselage) {
        marque=uneMarque;
        modele=unModele;
        unFuselage.getListReacteurs().add(this);
    }



}