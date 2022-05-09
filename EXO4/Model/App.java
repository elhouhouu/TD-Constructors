package EXO4.Model;

public class App {

    public static void main(String[] args) {

        UsineAirbus airbusToulouse = new UsineAirbus("Toulouse");

        Fuselage unFuselage = new Fuselage("Airbus", 30, 120, 10);
        Reacteur rolls = new Reacteur("Rolls-Roys", "1");
        //Reacteur trent = new Reacteur("Trent", "2", unFuselage);

        unFuselage.getListReacteurs().add(rolls);
        unFuselage.getListReacteurs().add(rolls);

        Avion modele320 = airbusToulouse.fabriquerAvion("320", "Rolls-Roys");

        modele320.setFuselage(unFuselage);

        System.out.println(modele320);

    }
}