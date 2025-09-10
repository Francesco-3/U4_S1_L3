package Ex_1;

/*
  Creare una classe Rettangolo che permetta di rappresentare dei rettangoli,
  Per ogni rettangolo deve essere possibile specificare altezza e larghezza in fase di costruzione dell'istanza
  e devono essere realizzati i metodi per calcorare perimetro ed area.
  Realizzare un metodo stampaRettangolo che, dato un Rettangolo, stampi a video area e perimetro.
  Realizzare un metodo stampaDueRettangoli che, dati due rettangoli, stampi area e perimetro di ognuno e quindi la somma
  delle aree e dei perimetri.

  Scrivere un main che utilizzi tutte queste funzioni.
*/

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public int area() {
        return altezza * larghezza;
    }

    public int perimetro() {
        return 2 * (altezza + larghezza);
    }

    public void stampaRettangolo() {
        System.out.println("Altezza: " + altezza + ", Larghezza: " + larghezza);
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }

    public static void stampaDueRettangoli(Rettangolo r2, Rettangolo r3) {
        System.out.println("Rettangolo 2:");
        r2.stampaRettangolo();
        System.out.println("\nRettangolo 3:");
        r3.stampaRettangolo();

        int sommaPerimetri = r2.perimetro() + r3.perimetro();
        int sommaAree = r2.area() + r3.area();

        System.out.println("\nSomma dei perimetri (r2, r3): " + sommaPerimetri);
        System.out.println("Somma delle aree (r2, r3): " + sommaAree);
    }

    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(10, 15);
        Rettangolo r2 = new Rettangolo(50, 100);
        Rettangolo r3 = new Rettangolo(5, 8);

        System.out.println("#stampaRettangolo r1:");
        r1.stampaRettangolo();

        System.out.println("\n#stampaDueRettangoli r2 e r3:");
        Rettangolo.stampaDueRettangoli(r2, r3);
    }
}
