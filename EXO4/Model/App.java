package EXO4.Model;

public class App {

    public static void main(String[] args) {

        Fuselage unFuselage = new Fuselage("fu", 30, 120, 10);
        Reacteur rolls = new Reacteur("Rolls-Roys", "1", unFuselage);
        Reacteur trent = new Reacteur("Trent", "2", unFuselage);

        UsineAirbus airbusToulouse = new UsineAirbus("Toulouse");

        Avion modele320 = airbusToulouse.fabriqueAvion("320", "Rolls-Roys");




    }
}