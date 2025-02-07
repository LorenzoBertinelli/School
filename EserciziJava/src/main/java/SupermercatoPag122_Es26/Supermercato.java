package SupermercatoPag120_Es26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Supermercato {
    private Prodotto[] prodotti;
    private int numeroProdotti;

    public Supermercato(int capacita) {
        prodotti = new Prodotto[capacita];
        numeroProdotti = 0;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        if (numeroProdotti < prodotti.length) {
            prodotti[numeroProdotti++] = prodotto;
            System.out.println("Prodotto aggiunto: " + prodotto.descrizione);
        } else {
            System.out.println("Capacità massima raggiunta.");
        }
    }

    public void rifornimento(String codice, int quantita) {
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].codice.equals(codice)) {
                prodotti[i].quantitaMagazzino += quantita;
                System.out.println("Rifornito " + quantita + " unità di " + prodotti[i].descrizione);
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }

    public void vendita(String codice, int quantita) {
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].codice.equals(codice)) {
                if (prodotti[i].quantitaNegozio >= quantita) {
                    prodotti[i].quantitaNegozio -= quantita;
                    System.out.println("Vendute " + quantita + " unità di " + prodotti[i].descrizione);
                } else {
                    System.out.println("Quantità insufficiente in negozio.");
                }
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }

    public void trasferimento(String codice, int quantita) {
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].codice.equals(codice)) {
                if (prodotti[i].quantitaMagazzino >= quantita) {
                    prodotti[i].quantitaMagazzino -= quantita;
                    System.out.println("Trasferite " + quantita + " unità di " + prodotti[i].descrizione);
                } else {
                    System.out.println("Quantità insufficiente in magazzino.");
                }
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }

    public void elencoScorteInferiori(int soglia) {
        System.out.println("\n--- Prodotti con scorte inferiori a " + soglia + " ---");
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].quantitaNegozio < soglia) {
                System.out.println(prodotti[i].descrizione + " - Quantità in negozio: " + prodotti[i].quantitaNegozio);
            }
        }
    }

    public void mostraMagazzino(String codice) {
        for (int i = 0; i < numeroProdotti; i++) {
            if (prodotti[i].codice.equals(codice)) {
                System.out.println("Codice: " + prodotti[i].codice + 
                                   ", Descrizione: " + prodotti[i].descrizione + 
                                   ", Quantità in Negozio: " + prodotti[i].quantitaNegozio + 
                                   ", Quantità in Magazzino: " + prodotti[i].quantitaMagazzino);
                return;
            }
        }
        System.out.println("Prodotto non trovato.");
    }

    public void mostraTuttiProdotti() {
        if (numeroProdotti == 0) {
            System.out.println("Nessun prodotto disponibile.");
            return;
        }

        System.out.println("\n--- Elenco Prodotti ---");
        for (int i = 0; i < numeroProdotti; i++) {
            Prodotto p = prodotti[i];
            System.out.println("Codice: " + p.codice + 
                               ", Descrizione: " + p.descrizione + 
                               ", Prezzo: " + p.prezzo + 
                               ", Quantità in Negozio: " + p.quantitaNegozio + 
                               ", Quantità in Magazzino: " + p.quantitaMagazzino);
        }
    }

    public void salvaInCSV(String nomeFile) {
        String percorsoCompleto = "C:\\Users\\Lorenzo\\OneDrive\\Desktop\\Documenti\\School\\EserciziJava\\src\\main\\java\\SupermercatoPag120_Es26\\" + nomeFile;
        
        try (FileWriter writer = new FileWriter(percorsoCompleto)) {
            writer.append("Codice,Descrizione,Prezzo,Quantità in Negozio,Quantità in Magazzino\n");
            for (int i = 0; i < numeroProdotti; i++) {
                writer.append(prodotti[i].codice)
                      .append(",")
                      .append(prodotti[i].descrizione)
                      .append(",")
                      .append(String.valueOf(prodotti[i].prezzo))
                      .append(",")
                      .append(String.valueOf(prodotti[i].quantitaNegozio))
                      .append(",")
                      .append(String.valueOf(prodotti[i].quantitaMagazzino))
                      .append("\n");
            }
            System.out.println("File CSV creato con successo: " + percorsoCompleto);
        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file: " + e.getMessage());
        }
    }

    public void leggiDaCSV(String nomeFile) {
        String percorsoCompleto = "C:\\Users\\Lorenzo\\OneDrive\\Desktop\\Documenti\\School\\EserciziJava\\src\\main\\java\\SupermercatoPag120_Es26\\" + nomeFile;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(percorsoCompleto))) {
            String linea;
            reader.readLine(); // Salta l'intestazione
            while ((linea = reader.readLine()) != null) {
                String[] dati = linea.split(",");
                String codice = dati[0];
                String descrizione = dati[1];
                double prezzo = Double.parseDouble(dati[2]);
                int quantitaNegozio = Integer.parseInt(dati[3]);
                int quantitaMagazzino = Integer.parseInt(dati[4]);
                aggiungiProdotto(new Prodotto(codice, descrizione, prezzo, quantitaNegozio, quantitaMagazzino));
            }
            System.out.println("File CSV letto con successo.");
        } catch (IOException e) {
            System.out.println("Errore nella lettura del file: " + e.getMessage());
        }
    }
}