package EXO3;

import java.util.*;

public class Banque {


    public Banque() {
    }

    public Carte getCarteCredit(String type) {
        Carte carte = CreditCreator.createCarte(type);
        return carte;
    }

    public Carte getCarteDebit(String type) {
        Carte carte = DebitCreator.createCarte(type);
        return carte;
    }
}