package RegistroElettronico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Disciplina {
    private Valutazione[] valutazioni; // Array per memorizzare le valutazioni
    private int maxValutazioni; // Numero massimo di valutazioni consentite
    private int numeroValutazioni; // Contatore delle valutazioni attualmente memorizzate
    private String nomeFile; // Nome del file CSV

    // Costruttore della classe Disciplina
    public Disciplina(int maxValutazioni, String nomeFile) {
        this.valutazioni = new Valutazione[maxValutazioni];
        this.maxValutazioni = maxValutazioni;
        this.numeroValutazioni = 0; // Inizialmente nessuna valutazione
        this.nomeFile = nomeFile;
        leggiValutazioniDaFile(); // Legge le valutazioni dal file all'inizio
    }

    // Metodo per aggiungere una valutazione
    public void aggiungiValutazione(Valutazione valutazione) {
        // Controllo se il numero massimo di valutazioni è stato raggiunto
        if (numeroValutazioni < maxValutazioni) {
            valutazioni[numeroValutazioni++] = valutazione; // Aggiunge la valutazione e incrementa il contatore
            scriviValutazioniSuFile(); // Scrive le valutazioni aggiornate nel file
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
                scriviValutazioniSuFile(); // Scrive le valutazioni aggiornate nel file
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

    // Metodo per scrivere le valutazioni su un file
    private void scriviValutazioniSuFile() {
        String percorso = "C:\\Users\\Lorenzo\\OneDrive\\Desktop\\Documenti\\School\\EserciziJava\\src\\main\\java\\RegistroElettronico\\" + nomeFile;
        File file = new File(percorso);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) { // Scrittura completa
            // Se il file non esiste, verrà creato
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File creato: " + nomeFile);
            }

            for (int i = 0; i < numeroValutazioni; i++) {
                Valutazione v = valutazioni[i];
                writer.write(v.getVoto() + "," + v.getTipologia() + "," + v.getData() + "," + v.getNote());
                writer.newLine();
            }
            System.out.println("Valutazioni scritte con successo in " + nomeFile);
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura su file: " + e.getMessage());
        }
    }

    // Metodo per leggere le valutazioni da un file
    private void leggiValutazioniDaFile() {
        String percorso = "C:\\Users\\Lorenzo\\OneDrive\\Desktop\\Documenti\\School\\EserciziJava\\src\\main\\java\\RegistroElettronico\\" + nomeFile;
        try (BufferedReader reader = new BufferedReader(new FileReader(percorso))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] parti = linea.split(",");
                if (parti.length == 4) {
                    double voto;
                    try {
                        voto = Double.parseDouble(parti[0]);
                    } catch (NumberFormatException e) {
                        System.err.println("Voto non valido: " + parti[0]);
                        continue; // Salta a questa iterazione se il voto non è valido
                    }
                    char tipologia = parti[1].charAt(0);
                    LocalDate data = LocalDate.parse(parti[2]);
                    String note = parti[3];

                    Valutazione valutazione = new Valutazione(voto, tipologia, data, note);
                    aggiungiValutazione(valutazione); // Aggiunge la valutazione all'array
                } else {
                    System.err.println("Formato della riga non valido: " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura da file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Errore durante l'elaborazione delle valutazioni: " + e.getMessage());
        }
    }
}