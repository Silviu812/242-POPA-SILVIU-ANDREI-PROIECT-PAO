package PROIECT.ETAPA1;

public class Produs {
    private String nume;
    private double pret;
    private String descriere;

    public Produs(String nume, double pret, String descriere) {
        this.nume = nume;
        this.pret = pret;
        this.descriere = descriere;
    }

    //GET
    public String getNume() {
        return nume;
    }
    public double getPret() {
        return pret;
    }
    public String getDescriere() {
        return descriere;
    }

    //SET
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setPret(double pret) {
        this.pret = pret;
    }
    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
}
