/*
  Scrivere un'applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di
  telefonia cellulare.

  Si devono quindi rappresentare i dati relativi ad una carta SIM, e in particolare:
  - il numero di telefono;
  - il credito disponibile in euro
  - la lista delle ultime 5 chiamate effettuate
  Per ciascuna Chiamata deve essere rappresentata la durata in minuti e il numero chiamato

  La classe SIM dovrà fornire le seguenti informazioni:
  - un costruttore che crea una SIM con un numero di telefono passato come parametro, credito a 0 e lista delle chiamate
    vuota
  - una funzione per la stampa dei dati della SIM

  Scrivere un main che crei una istanza di SIM e ne stampi i dati.
*/

package Ex_2;

import java.util.ArrayList;
import java.util.List;

class Chiamata {
    private String numeroChiamato;
    private int durataMinuti;

    public Chiamata(String numeroChiamato, int durataMinuti) {
        this.numeroChiamato = numeroChiamato;
        this.durataMinuti = durataMinuti;
    }

    @Override
    public String toString() {
        return "Numero chiamato: " + numeroChiamato +
                ", Durata: " + durataMinuti + " min";
    }
}

public class SIM {
    private String numberPhone;
    private double credit;
    private List<Chiamata> listaChiamate;

    public SIM(String numberPhone) {
        this.numberPhone = numberPhone;
        this.credit = 0.0;
        this.listaChiamate = new ArrayList<>();
    }

    public void aggiungiChiamata(String numeroChiamato, int durataMinuti) {
        listaChiamate.add(new Chiamata(numeroChiamato, durataMinuti));
    }

    public void stampaSIM() {
        System.out.println("Il numero di cellulare è: " + numberPhone);
        System.out.println("Il credito è di: " + credit + "€");
        System.out.println("\nUltime chiamate:");
        for (Chiamata c : listaChiamate) {
            System.out.println(" - " + c);
        }
    }

    public static void main(String[] args) {
        SIM sim = new SIM("3456789012");

        sim.aggiungiChiamata("3331112222", 3);
        sim.aggiungiChiamata("3205558888", 5);
        sim.aggiungiChiamata("3921234567", 2);
        sim.aggiungiChiamata("3151654864", 7);
        sim.aggiungiChiamata("3598416189", 8);
        sim.stampaSIM();
    }
}
