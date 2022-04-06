package EXO3;

import java.util.*;

public class Banque {


    private String nom;

    public Banque(String nom) {
        this.nom=nom;
    }

    public Carte getCarteCredit(String type) {
        Carte carte = CreditCreator.createCarte(type);
        return carte;
    }

    public Carte getCarteDebit(String type) {
        Carte carte = DebitCreator.createCarte(type);
        return carte;
    }

    @Override
    public String toString() {
        return nom+" : ";
    }
}