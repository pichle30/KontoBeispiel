public class Main {
    public static void main(String[] args) {
        Konto konto1 = new Konto();
        konto1.setKontoinhaber("Fabian");
        konto1.einzahlung(100);
        konto1.print();
        konto1.auszahlung(200);
        konto1.print();
    }


}
