package PROIECT.ETAPA1.services;

import PROIECT.ETAPA1.models.Produs;
import PROIECT.ETAPA1.models.Stoc;
import java.util.Map;

public class StocServices {
    private final Stoc stoc;

    public StocServices() {
        this.stoc = new Stoc();
    }

    public void adaugaProdus(Produs produs, int cantitate) {
        stoc.adaugaProdus(produs, cantitate);
    }

    public void eliminaProdus(Produs produs, int cantitate) {
        stoc.eliminaProdus(produs, cantitate);
    }

    public int getCantitateDisponibila(Produs produs) {
        return stoc.getCantitateDisponibila(produs);
    }

    public Map<Produs, Integer> getStocProduse() {
        return stoc.getStocProduse();
    }

    public void setStocProduse(Map<Produs, Integer> stocProduse) {
        stoc.setStocProduse(stocProduse);
    }
}
