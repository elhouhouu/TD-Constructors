package EXO3;

import java.util.*;

public class CreditCreator {


    public CreditCreator() {
    }

    public static Carte createCarte(String type) {

        Carte carteCredit;

        if(type.equals("visa"))
            carteCredit = new VisaCredit();
        else
            carteCredit = new MasterCardCredit();

        return carteCredit;
    }

}