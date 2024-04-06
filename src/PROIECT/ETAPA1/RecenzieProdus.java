package PROIECT.ETAPA1;

public class RecenzieProdus extends Recenzie {
    private Produs produs;

    public RecenzieProdus(Utilizator autor, String comentariu, Produs produs) {
        super(autor, comentariu);
        this.produs = produs;
    }

    // GET
    public Produs getProdus() {
        return produs;
    }

    // SET
    public void setProdus(Produs produs) {
        this.produs = produs;
    }
}
