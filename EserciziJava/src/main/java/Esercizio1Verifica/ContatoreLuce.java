package Esercizio1Verifica;


class ContatoreLuce extends Contatore {
    private static final double COSTO_PER_KWH = 0.069;

    public ContatoreLuce(String matricola, String data, String ora, double consumoAttuale) {
        super(matricola, data, ora, consumoAttuale);
    }

    @Override
    public double calcolaImporto() {
        return consumoAttuale * COSTO_PER_KWH;
    }
}