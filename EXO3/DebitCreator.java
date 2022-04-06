package EXO3;

import java.util.*;

public class DebitCreator {


    public DebitCreator() {
    }

    public static Carte createCarte(String type) {

        Carte carteCredit;

        if(type.equals("visa"))
            carteCredit = new VisaDebit();
        else
            carteCredit = new MasterCardDebit();

        return carteCredit;
    }

}