package Esercizio1Verifica;

class ContatoreAcqua extends Contatore {
    private double consumoPrecedente;
    private static final double COSTO_PER_M3 = 0.023911;

    public ContatoreAcqua(String matricola, String data, String ora, double consumoAttuale, double consumoPrecedente) {
        super(matricola, data, ora, consumoAttuale);
        this.consumoPrecedente = consumoPrecedente;
    }

    @Override
    public double calcolaImporto() {
        return (consumoAttuale - consumoPrecedente) * COSTO_PER_M3;
    }
}