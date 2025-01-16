package RegistroElettronico;

import java.time.LocalDate;

public class Valutazione {
    private double voto;
    private char tipologia; // 'O' per Orale, 'S' per Scritto, 'P' per Pratico
    private LocalDate data;
    private String note;

    // Costruttore della classe Valutazione
    public Valutazione(double voto, char tipologia, LocalDate data, String note) {
        // Controllo per assicurarsi che il voto sia compreso tra 0 (escluso) e 10 (incluso)
        if (voto <= 0 || voto > 10) {
            throw new IllegalArgumentException("Il voto deve essere compreso tra 0 (escluso) e 10 (incluso).");
        }
        this.voto = voto;
        this.tipologia = tipologia;
        this.data = data;
        this.note = note;
    }

    // Getters per accedere ai valori delle proprietà
    public double getVoto() {
        return voto;
    }

    public char getTipologia() {
        return tipologia;
    }

    public LocalDate getData() {
        return data;
    }

    public String getNote() {
        return note;
    }
}