package PROIECT.ETAPA1;

public class Recenzie {
    private Utilizator autor;
    private String continut;

    public Recenzie(Utilizator autor, String continut) {
        this.autor = autor;
        this.continut = continut;
    }

    //GET
    public Utilizator getAutor() {
        return autor;
    }

    public String getContinut() {
        return continut;
    }

    //SET
    public void setAutor(Utilizator autor) {
        this.autor = autor;
    }

    public void setContinut(String continut) {
        this.continut = continut;
    }
}
