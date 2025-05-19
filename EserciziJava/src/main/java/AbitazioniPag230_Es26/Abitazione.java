package AbitazioniPag230_Es26;

public abstract class Abitazione {
    protected int stanze;
    protected double superficie;
    protected String indirizzo;
    protected String citta;

    public Abitazione(int stanze, double superficie, String indirizzo, String citta) {
        this.stanze = stanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Abitazione{" +
                "stanze=" + stanze +
                ", superficie=" + superficie +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Abitazione)) return false;
        Abitazione that = (Abitazione) obj;
        return stanze == that.stanze &&
                Double.compare(that.superficie, superficie) == 0 &&
                indirizzo.equals(that.indirizzo) &&
                citta.equals(that.citta);
    }
}
