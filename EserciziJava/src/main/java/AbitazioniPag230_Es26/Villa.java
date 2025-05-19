package AbitazioniPag230_Es26;

public class Villa extends Abitazione {
    private int piani;
    private double superficieGiardino;
    private boolean piscina;

    public Villa(int stanze, double superficie, String indirizzo, String citta, int piani, double superficieGiardino, boolean piscina) {
        super(stanze, superficie, indirizzo, citta);
        this.piani = piani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "piani=" + piani +
                ", superficieGiardino=" + superficieGiardino +
                ", piscina=" + piscina +
                ", " + super.toString() +
                '}';
    }
}

