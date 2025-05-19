package Esercizio1Verifica;

abstract class Contatore {
    protected String matricola;
    protected String data;
    protected String ora;
    protected double consumoAttuale;

    public Contatore(String matricola, String data, String ora, double consumoAttuale) {
        this.matricola = matricola;
        this.data = data;
        this.ora = ora;
        this.consumoAttuale = consumoAttuale;
    }

    public abstract double calcolaImporto();

    public void aggiornaConsumo(double nuovaLettura) {
        this.consumoAttuale = nuovaLettura;
    }
}