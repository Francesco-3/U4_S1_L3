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

public class SIM {
    private String numberPhone;
    private double credit;
    private String numeroChiamato;
    private int durataMinuti;

    public SIM(String numberPhone, String numeroChiamato, int durataMinuti) {
        this.numberPhone = numberPhone;
        this.credit = 0.0;
        this.numeroChiamato = numeroChiamato;
        this.durataMinuti = durataMinuti;
    }

    public void stampaSIM() {
        System.out.println("Il numero di cellulare è: " + numberPhone);
        System.out.println("Il credito è di: " + credit + "€");
        System.out.println("Ultime chiamate:");
    }

    public static void main(String[] args) {
        SIM sim = new SIM("3456789012");

        sim.stampaSIM();
    }
}
