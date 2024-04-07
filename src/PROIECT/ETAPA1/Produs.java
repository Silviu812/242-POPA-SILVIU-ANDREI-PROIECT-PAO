package PROIECT.ETAPA1;

public class Produs {
    private String nume;
    private double pret;
    private String descriere;
    private double discount;

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
    public double getDiscount() {
        return discount;
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
    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
