package PROIECT.ETAPA1;

import java.util.ArrayList;
import java.util.List;

public class CosCumparaturi {
    private List<Produs> produse;

    public CosCumparaturi() {
        this.produse = new ArrayList<>();
    }

    public void adaugaProdus(Produs produs) {
        produse.add(produs);
    }

    public void eliminaProdus(Produs produs) {
        produse.remove(produs);
    }

    public void golesteCos() {
        produse.clear();
    }

    public void afiseazaCos() {
        System.out.println("Produsele din coșul de cumpărături:");
        for (Produs produs : produse) {
            System.out.println(produs);
        }
    }

    //GET
    public List<Produs> getProduse() {
        return produse;
    }

    //SET
    public void setProduse(List<Produs> produse) {
        this.produse = produse;
    }
}
