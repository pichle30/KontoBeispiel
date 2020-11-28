public class Konto {
    private int kontostand = 0;
    private String kontoinhaber;

    public void setKontoinhaber(String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public int einzahlung( int betrag) {
        kontostand += betrag;
        return kontostand;
    }

    public int auszahlung( int betrag) {
        kontostand -= betrag;
        return kontostand;
    }

    public void print () {
        System.out.println( "Kontoinhaber: " + kontoinhaber + " Kontostand: " + kontostand);
    }
}
