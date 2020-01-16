package entities;

import java.util.ArrayList;

public class PiattoEffettivoCliente extends PiattoEffettivo {

    private int prezzo;

    public PiattoEffettivoCliente(Piatto piatto, int quantita) {
        super(
                piatto.getId(),
                piatto.getNome(),
                quantita,
                new ArrayList<String>(),
                new ArrayList<String>()
        );
        prezzo = piatto.getPrezzoCent();
    }

    public void addIngredienteRimovibile(Ingrediente i) {
        super.getRimozioni().add(i.getNome());
    }

    public void addIngredienteAggiungibile(Ingrediente i) {
        super.getAggiunte().add(i.getNome());
        prezzo += i.getSovrapprezzoCent();
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}
