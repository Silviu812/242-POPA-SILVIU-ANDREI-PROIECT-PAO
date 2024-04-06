package PROIECT.ETAPA1;

public class Angajat extends Utilizator {
    private String pozitie;
    private int anAngajare;
    private double salariu;

    public Angajat(String nume, String email, String parola, String pozitie, int anAngajare, double salariu) {
        super(nume, email, parola);
        this.pozitie = pozitie;
        this.anAngajare = anAngajare;
        this.salariu = salariu;
    }

    //GET
    public String getPozitie() {
        return pozitie;
    }
    public int getAnAngajare() {
        return anAngajare;
    }
    public double getSalariu() {
        return salariu;
    }

    //SET
    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }
    public void setAnAngajare(int anAngajare) {
        this.anAngajare = anAngajare;
    }
    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }
}
