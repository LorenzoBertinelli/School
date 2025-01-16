package StrumentiLaboratorioScuolaPag120_Es25;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Classe che gestisce gli strumenti di laboratorio
public class GestioneStrumenti {
    private List<Strumento> strumenti; // Lista di strumenti

    // Costruttore che inizializza la lista degli strumenti
    public GestioneStrumenti() {
        strumenti = new ArrayList<>();
    }

    // Metodo per aggiungere un nuovo strumento
    public void aggiungiStrumento(Strumento strumento) {
        strumenti.add(strumento);
        System.out.println("Strumento aggiunto: " + strumento.getDescrizione());
    }

    // Metodo per eliminare uno strumento tramite numero identificativo
    public void eliminaStrumento(int numeroIdentificativo) {
        strumenti.removeIf(strumento -> strumento.getNumeroIdentificativo() == numeroIdentificativo);
        System.out.println("Strumento con ID " + numeroIdentificativo + " eliminato.");
    }

    // Metodo per cercare uno strumento per numero identificativo
    public Strumento cercaStrumentoPerID(int numeroIdentificativo) {
        return strumenti.stream()
                .filter(strumento -> strumento.getNumeroIdentificativo() == numeroIdentificativo)
                .findFirst()
                .orElse(null);
    }

    // Metodo per cercare uno strumento per descrizione
    public List<Strumento> cercaStrumentoPerDescrizione(String descrizione) {
        return strumenti.stream()
                .filter(strumento -> strumento.getDescrizione().toLowerCase().contains(descrizione.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Metodo per calcolare il valore totale degli strumenti acquistati in un periodo
    public int valoreTotaleStrumenti(int annoInizio, int annoFine) {
        return strumenti.stream()
                .filter(strumento -> strumento.getAnnoAcquisto() >= annoInizio && strumento.getAnnoAcquisto() <= annoFine)
                .mapToInt(strumento -> 1) // Considerando ogni strumento come valore 1
                .sum();
    }

    // Metodo per ottenere un elenco di strumenti ancora in garanzia
    public List<Strumento> strumentiInGaranzia(int annoCorrente) {
        return strumenti.stream()
                .filter(strumento -> strumento.getAnnoGaranzia() >= annoCorrente)
                .collect(Collectors.toList());
    }

    // Metodo per salvare gli strumenti su un file
    public void salvaStrumenti(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Strumento strumento : strumenti) {
                writer.write(strumento.getNumeroIdentificativo() + ";" +
                             strumento.getDescrizione() + ";" +
                             strumento.getAnnoAcquisto() + ";" +
                             strumento.getAnnoGaranzia());
                writer.newLine();
            }
        }
        System.out.println("Strumenti salvati in " + filename);
    }

    // Metodo per ripristinare gli strumenti da un file
    public void ripristinaStrumenti(String filename) throws IOException {
        strumenti.clear(); // Pulisce la lista corrente
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                Strumento strumento = new Strumento(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        Integer.parseInt(parts[2]),
                        Integer.parseInt(parts[3])
                );
                strumenti.add(strumento);
            }
        }
        System.out.println("Strumenti ripristinati da " + filename);
    }
}