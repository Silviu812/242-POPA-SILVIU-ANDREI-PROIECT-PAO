package PROIECT.ETAPA1.models;

public class Utilizator {
    private String nume;
    private String email;
    private String parola;

    public Utilizator(String nume, String email, String parola) {
        this.nume = nume;
        this.email = email;
        this.parola = parola;
    }

    // GET
    public String getNume() {
        return nume;
    }
    public String getEmail() {
        return email;
    }
    public String getParola() {
        return parola;
    }

    // SET
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setParola(String parola) {
        this.parola = parola;
    }
}
