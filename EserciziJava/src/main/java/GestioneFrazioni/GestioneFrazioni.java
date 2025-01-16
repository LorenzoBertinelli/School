/*
   Definire una classe in linguaggio Java per la gestione di frazioni che, oltre a permettere di impostare e recuperare i valori del numeratore e del denominatore, implementi le seguenti ope-razioni:
   • inverso;
   • reciproco;
   • somma;
   • differenza;
   • prodotto;
   • quoziente;
   • potenza.
 */
package GestioneFrazioni;

/**
 *
 * @author Lorenzo
 */

public class GestioneFrazioni {
    private int numeratore;
    private int denominatore;

    // Costruttore
    public GestioneFrazioni(int numeratore, int denominatore) {
        if (denominatore == 0) {
            throw new IllegalArgumentException("Il denominatore non può essere zero.");
        }
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    // Metodo per ottenere il reciproco della frazione
    public GestioneFrazioni reciproco() {
        return new GestioneFrazioni(denominatore, numeratore);
    }

    // Metodo per sommare due frazioni
    public GestioneFrazioni somma(GestioneFrazioni altra) {
        int nuovoNumeratore = this.numeratore * altra.denominatore + altra.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altra.denominatore;
        return new GestioneFrazioni(nuovoNumeratore, nuovoDenominatore).semplifica();
    }

    // Metodo per calcolare la differenza tra due frazioni
    public GestioneFrazioni differenza(GestioneFrazioni altra) {
        int nuovoNumeratore = this.numeratore * altra.denominatore - altra.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altra.denominatore;
        return new GestioneFrazioni(nuovoNumeratore, nuovoDenominatore).semplifica();
    }

    // Metodo per moltiplicare due frazioni
    public GestioneFrazioni prodotto(GestioneFrazioni altra) {
        int nuovoNumeratore = this.numeratore * altra.numeratore;
        int nuovoDenominatore = this.denominatore * altra.denominatore;
        return new GestioneFrazioni(nuovoNumeratore, nuovoDenominatore).semplifica();
    }

    // Metodo per dividere due frazioni
    public GestioneFrazioni quoziente(GestioneFrazioni altra) {
        return this.prodotto(altra.reciproco());
    }

    // Metodo per calcolare la potenza di una frazione
    public GestioneFrazioni potenza(int esponente) {
        int nuovoNumeratore = (int) Math.pow(this.numeratore, esponente);
        int nuovoDenominatore = (int) Math.pow(this.denominatore, esponente);
        return new GestioneFrazioni(nuovoNumeratore, nuovoDenominatore).semplifica();
    }

    // Metodo per semplificare la frazione
    private GestioneFrazioni semplifica() {
        int mcd = mcd(numeratore, denominatore);
        return new GestioneFrazioni(numeratore / mcd, denominatore / mcd);
    }

    // Metodo per calcolare il massimo comune divisore
    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    // Metodi getter per numeratore e denominatore
    public int getNumeratore() {
        return numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }

    // Metodo per stampare la frazione
    public void stampa() {
        System.out.println(numeratore + "/" + denominatore);
    }

    
}