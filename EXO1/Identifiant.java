package EXO1;

public class Identifiant {

    private static Identifiant id;
    private static int cpt;

    Identifiant() {
    }

    public static Identifiant getInstance() {
        if (id == null)
            id = new Identifiant();
        return id;
    }

    public String getTicket() {
        return "id_"+cpt++;
    }


}
