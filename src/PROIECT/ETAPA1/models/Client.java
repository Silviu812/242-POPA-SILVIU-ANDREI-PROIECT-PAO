package PROIECT.ETAPA1.models;

public class Client extends Utilizator {
    private String telefon;
    private String adresa;

    public Client(String nume, String email, String parola, String telefon, String adresa) {
        super(nume, email, parola);
        this.telefon = telefon;
        this.adresa = adresa;
    }

    //GET
    public String getTelefon() {
        return telefon;
    }
    public String getAdresa() {
        return adresa;
    }

    //SET
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
