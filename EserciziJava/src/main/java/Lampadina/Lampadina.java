package Lampadina;


public class Lampadina {
    private String colore;
    private int potenza; // Watt
    private boolean accesa;

    // Costruttore
    public Lampadina(String colore, int potenza, boolean accesa) {
        this.colore = colore;
        this.potenza = potenza;
        this.accesa = accesa;
    }

    // Getter
    public String getColore() {
        return colore;
    }

    public int getPotenza() {
        return potenza;
    }

    public boolean isAccesa() {
        return accesa;
    }

    // Metodo per stampare le caratteristiche della lampadina (metodo toString)
    public void stampaCaratteristiche() {
        System.out.println("Colore: " + colore + ", Potenza: " + potenza + "W, Accesa: " + (accesa ? "Si" : "No"));
    }
}