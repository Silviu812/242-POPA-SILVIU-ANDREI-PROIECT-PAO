package PROIECT.ETAPA1;

import PROIECT.ETAPA1.models.*;
import PROIECT.ETAPA1.services.StocServices;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CosCumparaturi cosCumparaturi = new CosCumparaturi();
        StocServices stocServices = new StocServices();

        boolean continuare = true;
        while (continuare) {
            System.out.println("Bine ai venit! Ce doresti sa faci?");
            System.out.println("1. Adauga produs in cos");
            System.out.println("2. Afiseaza cosul de cumparaturi");
            System.out.println("3. Afiseaza stocul de produse");
            System.out.println("4. Adauga produs in stoc");
            System.out.println("5. Elimina produs din stoc");
            System.out.println("6. Adauga recenzie pentru un produs");
            System.out.println("7. Adauga reclamatie pentru un client");
            System.out.println("8. Aplica o promotie pentru un produs");
            System.out.println("9. Verifica cantitatea disponibila pentru un produs");
            System.out.println("10. Elimina complet un produs din stoc");
            System.out.println("11. Elimina produs din cos");
            System.out.println("12. Iesire");

            int optiune = scanner.nextInt();
            switch (optiune) {
                case 1:
                    System.out.println("Introdu numele produsului:");
                    String numeProdus = scanner.next();
                    System.out.println("Introdu pretul produsului:");
                    double pretProdus = scanner.nextDouble();
                    System.out.println("Introdu descrierea produsului:");
                    String descriereProdus = scanner.next();

                    Produs produsNou = new Produs(numeProdus, pretProdus, descriereProdus);
                    cosCumparaturi.adaugaProdus(produsNou);
                    System.out.println("Produs adaugat in cos!");
                    break;
                case 2:
                    cosCumparaturi.afiseazaCos();
                    break;
                case 3:
                    for (Map.Entry<Produs, Integer> entry : stocServices.getStocProduse().entrySet()) {
                        System.out.println(entry.getKey().getNume() + ": " + entry.getValue());
                    }
                    break;
                case 4:
                    System.out.println("Introdu numele produsului:");
                    String numeProdusStoc = scanner.next();
                    System.out.println("Introdu cantitatea produsului:");
                    int cantitateProdusStoc = scanner.nextInt();

                    Produs produsStoc = new Produs(numeProdusStoc, 0, "");
                    stocServices.adaugaProdus(produsStoc, cantitateProdusStoc);
                    System.out.println("Produs adaugat in stoc!");
                    break;
                case 5:
                    System.out.println("Introdu numele produsului:");
                    String numeProdusStocEliminare = scanner.next();
                    System.out.println("Introdu cantitatea de eliminat:");
                    int cantitateProdusStocEliminare = scanner.nextInt();

                    Produs produsStocEliminare = new Produs(numeProdusStocEliminare, 0, "");
                    stocServices.eliminaProdus(produsStocEliminare, cantitateProdusStocEliminare);
                    System.out.println("Produs eliminat din stoc!");
                    break;
                case 6:
                    System.out.println("Introdu numele produsului:");
                    String numeProdusRecenzie = scanner.next();
                    System.out.println("Introdu comentariul:");
                    String comentariuRecenzie = scanner.next();

                    Produs produsRecenzie = new Produs(numeProdusRecenzie, 0, "");
                    RecenzieProdus recenzieProdus = new RecenzieProdus(null, comentariuRecenzie, produsRecenzie);
                    System.out.println("Recenzie adaugata pentru produs!");
                    break;
                case 7:
                    System.out.println("Introdu numele clientului:");
                    String numeClientReclamatie = scanner.next();
                    System.out.println("Introdu mesajul de reclamatie:");
                    String mesajReclamatie = scanner.next();

                    Client clientReclamatie = new Client(numeClientReclamatie, "", "", "", "");
                    Reclamatie reclamatie = new Reclamatie(clientReclamatie, mesajReclamatie);
                    System.out.println("Reclamatie adaugata pentru client!");
                    break;
                case 8:
                    System.out.println("Introdu numele produsului pentru aplicarea promotiei:");
                    String numeProdusPromotie = scanner.next();

                    Produs produsPromotie = null;
                    for (Map.Entry<Produs, Integer> entry : stocServices.getStocProduse().entrySet()) {
                        if (entry.getKey().getNume().equals(numeProdusPromotie)) {
                            produsPromotie = entry.getKey();
                            break;
                        }
                    }

                    if (produsPromotie != null) {
                        System.out.println("Introdu discount-ul promotiei (în procente):");
                        double discountPromotie = scanner.nextDouble();
                        produsPromotie.setDiscount(discountPromotie);
                        System.out.println("Promotia aplicata cu succes pentru produsul " + numeProdusPromotie + "!");
                    } else {
                        System.out.println("Produsul " + numeProdusPromotie + " nu exista in stoc!");
                    }
                    break;

                case 9:
                    System.out.println("Introdu numele produsului:");
                    String numeProdusCantitate = scanner.next();
                    Produs produsCantitate = new Produs(numeProdusCantitate, 0, "");
                    int cantitateDisponibila = stocServices.getCantitateDisponibila(produsCantitate);
                    System.out.println("Cantitate disponibila pentru produsul " + numeProdusCantitate + " este: " + cantitateDisponibila);
                    break;
                case 10:
                    System.out.println("Introdu numele produsului de eliminat din cos:");
                    String numeProdusEliminareCos = scanner.next();
                    Produs produsEliminareCos = new Produs(numeProdusEliminareCos, 0, "");
                    cosCumparaturi.eliminaProdus(produsEliminareCos);
                    System.out.println("Produsul eliminat din cos!");
                    break;
                case 11:
                    System.out.println("Introdu numele produsului de eliminat complet din stoc:");
                    String numeProdusEliminareStoc = scanner.next();
                    Produs produsEliminareStoc = new Produs(numeProdusEliminareStoc, 0, "");
                    stocServices.eliminaProdus(produsEliminareStoc, stocServices.getCantitateDisponibila(produsEliminareStoc));
                    System.out.println("Produsul eliminat complet din stoc!");
                    break;

                case 12:
                    continuare = false;
                    break;
                default:
                    System.out.println("Optiune invalida. Te rog sa alegi din nou.");
                    break;
            }
        }
        System.out.println("La revedere!");
        scanner.close();
    }
}
