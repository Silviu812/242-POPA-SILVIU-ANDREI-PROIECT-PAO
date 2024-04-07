package PROIECT.ETAPA1.models;

import java.util.HashMap;
import java.util.Map;

public class Stoc {
    private Map<Produs, Integer> stocProduse;

    public Stoc() {
        this.stocProduse = new HashMap<>();
    }

    public void adaugaProdus(Produs produs, int cantitate) {
        int cantitateExistenta = stocProduse.getOrDefault(produs, 0);
        stocProduse.put(produs, cantitateExistenta + cantitate);
    }

    public void eliminaProdus(Produs produs, int cantitate) {
        int cantitateExistenta = stocProduse.getOrDefault(produs, 0);
        if (cantitateExistenta - cantitate <= 0) {
            stocProduse.remove(produs);
        } else {
            stocProduse.put(produs, cantitateExistenta - cantitate);
        }
    }

    public int getCantitateDisponibila(Produs produs) {
        return stocProduse.getOrDefault(produs, 0);
    }

    public Map<Produs, Integer> getStocProduse() {
        return stocProduse;
    }

    public void setStocProduse(Map<Produs, Integer> stocProduse) {
        this.stocProduse = stocProduse;
    }
}
