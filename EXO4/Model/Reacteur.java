package EXO4.Model;

public class Reacteur {

    private String marque;
    private String modele;

    public Reacteur(String uneMarque, String unModele, Fuselage unFuselage) {
        marque=uneMarque;
        modele=unModele;
        unFuselage.getListReacteurs().add(this);
    }



}