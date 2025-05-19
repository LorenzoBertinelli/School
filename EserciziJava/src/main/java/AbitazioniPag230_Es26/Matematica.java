package AbitazioniPag230_Es26;

import java.io.*; // Importa per la gestione dei file
import java.time.LocalDate; // Importa per la gestione delle date

public class Matematica {
    private Valutazione[] valutazioni; // Array di valutazioni
    private int count; // Contatore per le valutazioni

    // Costruttore che inizializza l'array di valutazioni
    public Matematica(int size) {
        valutazioni = new Valutazione[size]; // Inizializza l'array
        count = 0; // Imposta il contatore a zero
    }

    // Metodo per aggiungere una valutazione
    public void aggiungiValutazione(Valutazione valutazione) {
        if (count < valutazioni.length) {
            valutazioni[count++] = valutazione; // Aggiunge la valutazione e incrementa il contatore
        } else {
            throw new IllegalArgumentException("Array pieno"); // Lancia un'eccezione se l'array è pieno
        }
    }

    // Metodo per eliminare una valutazione
    public void eliminaValutazione(char tipologia, LocalDate data) {
        for (int i = 0; i < count; i++) {
            if (valutazioni[i].getTipologia() == tipologia && valutazioni[i].getData().equals(data)) {
                valutazioni[i] = valutazioni[--count]; // Sostituisce con l'ultimo elemento
                valutazioni[count] = null; // Rimuove il riferimento
                break; // Esce dal ciclo una volta trovata la valutazione
            }
        }
    }

    // Metodo per calcolare la media delle valutazioni per tipologia
    public double calcolaMediaTipologia(char tipologia) {
        double somma = 0;
        int numero = 0;
        for (int i = 0; i < count; i++) {
            if (valutazioni[i].getTipologia() == tipologia) {
                somma += valutazioni[i].getVoto(); // Somma i voti
                numero++; // Incrementa il conteggio
            }
        }
        return numero > 0 ? somma / numero : 0; // Calcola la media
    }

    // Metodo per calcolare la media totale delle valutazioni
    public double calcolaMediaTotale() {
        double somma = 0;
        for (int i = 0; i < count; i++) {
            somma += valutazioni[i].getVoto(); // Somma i voti
        }
        return count > 0 ? somma / count : 0; // Calcola la media
    }

    // Metodo per estrarre tutte le valutazioni in un array
    public Valutazione[] estraiValutazioni() {
        Valutazione[] risultati = new Valutazione[count]; // Crea un nuovo array
        System.arraycopy(valutazioni, 0, risultati, 0, count); // Copia le valutazioni
        return risultati; // Restituisce l'array delle valutazioni
    }

    // Metodo per salvare le valutazioni su un file CSV
    public void salvaSuFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < count; i++) {
                Valutazione v = valutazioni[i];
                writer.write(v.getVoto() + "," + v.getTipologia() + "," + v.getData() + "," + v.getNote()); // Usa il getter
                writer.newLine(); // Nuova riga per ogni valutazione
            }
        }
    }

    // Metodo per caricare valutazioni da un file CSV
    public void caricaDaFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Divide la riga in parti
                double voto = Double.parseDouble(parts[0]); // Parsing del voto
                char tipologia = parts[1].charAt(0); // Ottiene la tipologia
                LocalDate data = LocalDate.parse(parts[2]); // Parsing della data
                String note = parts[3]; // Ottiene le note
                aggiungiValutazione(new Valutazione(voto, tipologia, data, note)); // Aggiunge la valutazione
            }
        }
    }
}