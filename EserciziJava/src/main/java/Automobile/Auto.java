package Automobile;

public class Auto {
    private String codice;
    private String modello;
    private boolean noleggiata;
    private int numeroNoleggi;

    public Auto(String codice, String modello, boolean noleggiata, int numeroNoleggi) {
        this.codice = codice;
        this.modello = modello;
        this.noleggiata = noleggiata;
        this.numeroNoleggi = numeroNoleggi;
    }

    public String getCodice() {
        return codice;
    }

    public String getModello() {
        return modello;
    }

    public boolean isNoleggiata() {
        return noleggiata;
    }

    public int getNumeroNoleggi() {
        return numeroNoleggi;
    }

    public double calcolaCostoNoleggio() {
        if (!noleggiata || numeroNoleggi <= 0) {
            return 0;
        }
        
        // Costo base
        double costo = 50.0; // Costo per il primo giorno

        // Aggiungi 35 euro per ogni giorno successivo
        if (numeroNoleggi > 1) {
            costo += (numeroNoleggi - 1) * 35.0;
        }

        return costo;
    }
}