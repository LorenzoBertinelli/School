package Esercizio1Verifica;

class ContatoreGas extends Contatore {
    private double consumoPrecedente;
    private static final double COSTO_PER_SMC = 0.830;

    public ContatoreGas(String matricola, String data, String ora, double consumoAttuale, double consumoPrecedente) {
        super(matricola, data, ora, consumoAttuale);
        this.consumoPrecedente = consumoPrecedente;
    }

    @Override
    public double calcolaImporto() {
        return (consumoAttuale - consumoPrecedente) * COSTO_PER_SMC;
    }
}