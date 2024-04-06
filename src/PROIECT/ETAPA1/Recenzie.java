package PROIECT.ETAPA1;

public class Recenzie {
    private Utilizator autor;
    private String comentariu;

    public Recenzie(Utilizator autor, String comentariu) {
        this.autor = autor;
        this.comentariu = comentariu;
    }

    // GET
    public Utilizator getAutor() {
        return autor;
    }
    public String getComentariu() {
        return comentariu;
    }

    // SET
    public void setAutor(Utilizator autor) {
        this.autor = autor;
    }
    public void setComentariu(String comentariu) {
        this.comentariu = comentariu;
    }
}
