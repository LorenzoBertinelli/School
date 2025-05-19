package AbitazioniPag230_Es26;

public class Negozio extends Abitazione {
    private int piani;
    private int postiAuto;
    private boolean mezziPubblici;

    public Negozio(int stanze, double superficie, String indirizzo, String citta, int piani, int postiAuto, boolean mezziPubblici) {
        super(stanze, superficie, indirizzo, citta);
        this.piani = piani;
        this.postiAuto = postiAuto;
        this.mezziPubblici = mezziPubblici;
    }

    @Override
    public String toString() {
        return "Negozio{" +
                "piani=" + piani +
                ", postiAuto=" + postiAuto +
                ", mezziPubblici=" + mezziPubblici +
                ", " + super.toString() +
                '}';
    }
}