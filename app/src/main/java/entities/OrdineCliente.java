package entities;

import java.util.LinkedList;

public class OrdineCliente extends OrdineStaff {

    private static OrdineCliente instance = null;

    private OrdineCliente(String tavolo) {
        super(tavolo, new LinkedList<PiattoEffettivo>(), 0);
    }

    public static OrdineCliente getInstance() {
        if(instance == null) {
            String tavolo = ""; // da settare
            instance = new OrdineCliente(tavolo);
        }
        return instance;
    }

    public void addPiatto(PiattoEffettivoCliente piatto) {
        super.getPiatti().add(piatto);
        super.setTotaleCent(
                super.getTotaleCent() + piatto.getPrezzo()
        );
    }
}
