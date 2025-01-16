package Frigorifero;

import java.io.*;

public class Frigorifero {
    private static final int DIMENSIONE_FRIGORIFERO = 100; 
    private Prodotto prodotti[];
    private int conta; 

    public Frigorifero() {
        prodotti = new Prodotto[DIMENSIONE_FRIGORIFERO];
        conta = 0; //inizializzo la variabile di istanza
    }

    public void aggiungiProdotto(Prodotto p) {
        try {
            if (conta < prodotti.length) {
                prodotti[conta] = p; //aggiungi prodotto all'array
                conta++; //incremento il contatore
            } else {
                System.out.println("Frigorifero pieno, impossibile aggiungere prodotti.");
            }
        } catch (Exception e) {
            System.out.println("Errore durante l'aggiunta del prodotto: " + e.getMessage());
        }
    }

    public void scriviProdottiSuFile(String nomeFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            for (int i = 0; i < conta; i++) {
                Prodotto p = prodotti[i];
                writer.write("Scadenza: " + p.getGiorno() + "/" + p.getMese() + "/" + p.getAnno());
                writer.newLine();
                writer.write("Codice: " + p.getCodice());
                writer.newLine();
                writer.write("Descrizione: " + p.getDescrizione());
                writer.newLine();
                writer.write("Calorie: " + p.getCalorie());
                writer.newLine();
                writer.newLine(); // Aggiungi una riga vuota tra i prodotti
            }
            System.out.println("Prodotti scritti nel file con successo.");
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura nel file: " + e.getMessage());
        }
    }

    public void leggiProdottiDaFile(String nomeFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeFile))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] dati = linea.split(",");
                int codice = Integer.parseInt(dati[0]);
                String descrizione = dati[1];
                int giorno = Integer.parseInt(dati[2]);
                int mese = Integer.parseInt(dati[3]);
                int anno = Integer.parseInt(dati[4]);
                int calorie = Integer.parseInt(dati[5]);
                Prodotto prodotto = new Prodotto(codice, descrizione, giorno, mese, anno, calorie);
                aggiungiProdotto(prodotto);
            }
            System.out.println("Prodotti letti dal file con successo.");
        } catch (IOException e) {
            System.out.println("Errore durante la lettura dal file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Formato dei dati non valido nel file: " + e.getMessage());
        }
    }

    public void elencaProdottiScaduti(int giornoCorrente, int meseCorrente, int annoCorrente) { 
        try {
            boolean scadutiTrovati = false;
            for (int i = 0; i < conta; i++) { 
                if (prodotti[i].Scaduto(giornoCorrente, meseCorrente, annoCorrente)) { 
                    System.out.println("Prodotto scaduto: " + prodotti[i].getDescrizione() + " (Codice: " + prodotti[i].getCodice() + ")"); 
                    scadutiTrovati = true; 
                } 
            } 
            if (!scadutiTrovati) { 
                System.out.println("Nessun prodotto scaduto nel frigorifero.");
            } 
        } catch (Exception e) { 
            System.out.println("Errore durante l'elenco dei prodotti scaduti: " + e.getMessage());
        } 
    }

    public void prelevaProdotto(int codice, int giorno, int mese, int anno) {
        try {
            for (int i = 0; i < conta; i++) {
                if (prodotti[i].getCodice() == codice && prodotti[i].getGiorno() == giorno &&
                    prodotti[i].getMese() == mese && prodotti[i].getAnno() == anno) {
                    prodotti[i] = prodotti[conta - 1]; 
                    prodotti[conta - 1] = null; 
                    conta--; 
                    System.out.println("Prodotto prelevato con successo.");
                    return; // Interrompe il metodo non appena il prodotto è stato trovato
                }
            }
            System.out.println("Prodotto non trovato.");
        } catch (Exception e) {
            System.out.println("Errore durante il prelevamento del prodotto: " + e.getMessage());
        }
    }

    public void elencaProdotti() {
        try {
            if (conta == 0) {
                System.out.println("Nessun prodotto nel frigorifero.");
            } else {
                for (int i = 0; i < conta; i++) {
                    Prodotto p = prodotti[i];
                    System.out.println("Prodotto: " + p.getDescrizione() + " (Codice: " + p.getCodice() + ")");
                }
            }
        } catch (Exception e) {
            System.out.println("Errore durante l'elenco dei prodotti: " + e.getMessage());
        }
    }

    public void contaProdotti(int codice) {
        int count = 0;
        for (int i = 0; i < conta; i++) {
            if (prodotti[i].getCodice() == codice) {
                count++;
            }
        }
        System.out.println("Numero di prodotti con codice " + codice + ": " + count);
    }
}