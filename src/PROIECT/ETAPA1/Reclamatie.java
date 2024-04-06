package PROIECT.ETAPA1;

public class Reclamatie {
    private Client client;
    private String mesaj;

    public Reclamatie(Client client, String mesaj) {
        this.client = client;
        this.mesaj = mesaj;
    }

    //GET
    public Client getClient() {
        return client;
    }
    public String getMesaj() {
        return mesaj;
    }

    //SET
    public void setClient(Client client) {
        this.client = client;
    }
    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
}
