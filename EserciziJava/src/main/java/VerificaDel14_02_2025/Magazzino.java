package VerificaDel14_02_2025;

import java.io.*;

public class Magazzino {
    private Prodotto[] prodotti;
    private int count; // Tiene traccia del numero di prodotti nel magazzino

    public Magazzino(int maxProdotti) {
        prodotti = new Prodotto[maxProdotti]; // Array di prodotti di dimensione fissa
        count = 0; // Inizializza il numero di prodotti a zero
    }

    // Metodo per leggere i prodotti da un file CSV
    public void caricaProdottiDaCSV(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dati = line.split(",");
                String codice = dati[0];
                String descrizione = dati[1];
                int quantitaMassima = Integer.parseInt(dati[2]);
                double costoUnitario = Double.parseDouble(dati[3]);
                int quantitaPresente = Integer.parseInt(dati[4]);

                if (count < prodotti.length) {
                    prodotti[count] = new Prodotto(codice, descrizione, quantitaMassima, costoUnitario, quantitaPresente);
                    count++;
                }
            }
        } catch (IOException e) {
            System.err.println("Errore nella lettura del file: " + e.getMessage());
        }
    }

    // Metodo per cercare un prodotto per codice
    public Prodotto cercaProdottoPerCodice(String codice) {
        for (int i = 0; i < count; i++) {
            if (prodotti[i].getCodice().equals(codice)) {
                return prodotti[i];
            }
        }
        return null; // prodotto non trovato
    }

    // Metodo per restituire i prodotti con quantità inferiore a una certa soglia
    public Prodotto[] prodottiSottoQuantita(int soglia, int maxProdotti) {
        Prodotto[] sottoSoglia = new Prodotto[maxProdotti];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (prodotti[i].getQuantitaPresente() < soglia) {
                sottoSoglia[index] = prodotti[i];
                index++;
            }
        }
        return sottoSoglia;
    }

    // Metodo per salvare i prodotti in un file CSV
    public void salvaProdottiSottoQuantitaInCSV(String filename, int soglia, int maxProdotti) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            Prodotto[] sottoSoglia = prodottiSottoQuantita(soglia, maxProdotti);
            for (int i = 0; i < maxProdotti; i++) {
                if (sottoSoglia[i] != null) {
                    bw.write(sottoSoglia[i].getCodice() + "," + sottoSoglia[i].getQuantitaPresente() + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Errore nel salvataggio del file: " + e.getMessage());
        }
    }
}