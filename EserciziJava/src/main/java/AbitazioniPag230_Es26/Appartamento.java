package AbitazioniPag230_Es26;

public class Appartamento extends Abitazione {
    private int piano;
    private boolean ascensore;
    private int terrazzi;

    public Appartamento(int stanze, double superficie, String indirizzo, String citta, int piano, boolean ascensore, int terrazzi) {
        super(stanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.ascensore = ascensore;
        this.terrazzi = terrazzi;
    }

    @Override
    public String toString() {
        return "Appartamento{" +
                "piano=" + piano +
                ", ascensore=" + ascensore +
                ", terrazzi=" + terrazzi +
                ", " + super.toString() +
                '}';
    }
}
