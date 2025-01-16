package RegistroElettronico;

import java.time.LocalDate;

public class Disciplina {
    private Valutazione[] valutazioni; // Array per memorizzare le valutazioni
    private int maxValutazioni; // Numero massimo di valutazioni consentite
    private int numeroValutazioni; // Contatore delle valutazioni attualmente memorizzate

    // Costruttore della classe Disciplina
    public Disciplina(int maxValutazioni) {
        this.valutazioni = new Valutazione[maxValutazioni];
        this.maxValutazioni = maxValutazioni;
        this.numeroValutazioni = 0; // Inizialmente nessuna valutazione
    }

    // Metodo per aggiungere una valutazione
    public void aggiungiValutazione(Valutazione valutazione) {
        // Controllo se il numero massimo di valutazioni è stato raggiunto
        if (numeroValutazioni < maxValutazioni) {
            valutazioni[numeroValutazioni++] = valutazione; // Aggiunge la valutazione e incrementa il contatore
        } else {
            throw new IllegalStateException("Numero massimo di valutazioni raggiunto. Impossibile aggiungere una nuova valutazione.");
        }
    }

    // Metodo per eliminare una valutazione in base a tipologia e data
    public void eliminaValutazione(char tipologia, LocalDate data) {
        for (int i = 0; i < numeroValutazioni; i++) {
            if (valutazioni[i].getTipologia() == tipologia && valutazioni[i].getData().isEqual(data)) {
                // Sposta le valutazioni successive per riempire il vuoto
                for (int j = i; j < numeroValutazioni - 1; j++) {
                    valutazioni[j] = valutazioni[j + 1];
                }
                valutazioni[--numeroValutazioni] = null; // Riduce il contatore e svuota l'ultima posizione
                return;
            }
        }
        System.out.println("Nessuna valutazione trovata con tipologia " + tipologia + " e data " + data + ".");
    }

    // Metodo per calcolare la media delle valutazioni per una tipologia specifica
    public double calcolaMediaTipologia(char tipologia) {
        double somma = 0.0;
        int count = 0;

        for (int i = 0; i < numeroValutazioni; i++) {
            if (valutazioni[i].getTipologia() == tipologia) {
                somma += valutazioni[i].getVoto(); // Somma i voti
                count++;
            }
        }
        return (count > 0) ? (somma / count) : 0.0; // Restituisce la media o 0 se non ci sono valutazioni
    }

    // Metodo per calcolare la media totale delle valutazioni
    public double calcolaMediaTotale() {
        double somma = 0.0;

        for (int i = 0; i < numeroValutazioni; i++) {
            somma += valutazioni[i].getVoto(); // Somma tutti i voti
        }
        return (numeroValutazioni > 0) ? (somma / numeroValutazioni) : 0.0; // Restituisce la media o 0 se non ci sono valutazioni
    }

    // Metodo per estrarre tutte le valutazioni
    public Valutazione[] estraiValutazioni() {
        Valutazione[] risultato = new Valutazione[numeroValutazioni];
        System.arraycopy(valutazioni, 0, risultato, 0, numeroValutazioni); // Copia le valutazioni in un nuovo array
        return risultato; // Restituisce l'array di valutazioni
    }
}