package PROIECT.ETAPA1.models;

import java.util.Date;

public class Promotii {
    private String titlu;
    private String descriere;
    private Date dataInceput;
    private Date dataSfarsit;
    private double discount;

    public Promotii(String titlu, String descriere, Date dataInceput, Date dataSfarsit, double discount) {
        this.titlu = titlu;
        this.descriere = descriere;
        this.dataInceput = dataInceput;
        this.dataSfarsit = dataSfarsit;
        this.discount = discount;
    }

    //GET
    public String getTitlu() {
        return titlu;
    }

    public String getDescriere() {
        return descriere;
    }

    public Date getDataInceput() {
        return dataInceput;
    }

    public Date getDataSfarsit() {
        return dataSfarsit;
    }

    public double getDiscount() {
        return discount;
    }

    //SET
    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setDataInceput(Date dataInceput) {
        this.dataInceput = dataInceput;
    }

    public void setDataSfarsit(Date dataSfarsit) {
        this.dataSfarsit = dataSfarsit;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
