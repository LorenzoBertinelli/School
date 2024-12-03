package PortoTuristicoPag120_es24;

import java.io.*;
import java.util.Arrays;

// Classe che gestisce i posti-barca
public class PostiBarche {
    private Barca[] postiBarca;  // Array di barche nel porto
    private boolean[] occupati;    // Array che tiene traccia dei posti occupati
    private final int MAX_POSTI = 100; // Numero massimo di posti-barca

    // Costruttore che inizializza gli array
    public PostiBarche() {
        postiBarca = new Barca[MAX_POSTI];
        occupati = new boolean[MAX_POSTI];
    }

    // Metodo per assegnare un posto a una barca
    public void assegnaPosto(Barca barca) throws Exception {
        // Controlla se la barca è troppo lunga per i posti 1-20
        if (barca.lunghezza > 10 && trovaPosto(1, 20)) {
            throw new Exception("Barca troppo lunga per i posti da 1 a 20.");
        }
        
        // Cerca un posto disponibile
        for (int i = 0; i < MAX_POSTI; i++) {
            if (!occupati[i]) {
                // Controlla le restrizioni sui posti
                if (i < 20 && barca.lunghezza > 10) {
                    continue;
                }
                if (barca.tipologia.equalsIgnoreCase("vela") && i < 50) {
                    continue;
                }
                // Assegna il posto alla barca
                postiBarca[i] = barca;
                occupati[i] = true;
                System.out.println("Posto " + (i + 1) + " assegnato a " + barca.nome);
                return;
            }
        }
        throw new Exception("Nessun posto disponibile."); // Errore se non ci sono posti disponibili
    }

    // Metodo per liberare un posto e calcolare il costo
    public double liberaPosto(int numeroPosto, int giorni) throws Exception {
        // Controlla se il posto è valido e occupato
        if (numeroPosto < 1 || numeroPosto > MAX_POSTI || !occupati[numeroPosto - 1]) {
            throw new Exception("Posto non occupato o numero non valido.");
        }
        Barca barca = postiBarca[numeroPosto - 1]; // Recupera la barca dal posto
        double costo = calcolaCosto(barca, giorni); // Calcola il costo dell'affitto
        postiBarca[numeroPosto - 1] = null; // Libera il posto
        occupati[numeroPosto - 1] = false;
        return costo; // Restituisce il costo
    }

    // Metodo per cercare una barca in un dato posto
    public Barca ricercaBarca(int numeroPosto) throws Exception {
        // Controlla se il numero del posto è valido
        if (numeroPosto < 1 || numeroPosto > MAX_POSTI) {
            throw new Exception("Numero posto non valido.");
        }
        if (!occupati[numeroPosto - 1]) {
            throw new Exception("Posto non occupato."); // Errore se il posto non è occupato
        }
        return postiBarca[numeroPosto - 1]; // Restituisce la barca trovata
    }

    // Metodo per salvare lo stato attuale del porto in un file
    public void salvaStato(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < MAX_POSTI; i++) {
                // Scrive solo i posti occupati nel file
                if (occupati[i]) {
                    Barca barca = postiBarca[i];
                    writer.write((i + 1) + ";" + barca.nome + ";" + barca.nazionalita + ";" + barca.lunghezza + ";" + barca.stazza + ";" + barca.tipologia);
                    writer.newLine();
                }
            }
        }
    }

    // Metodo per ottenere i nomi delle barche di una certa nazionalità
    public String[] nomiBarcheNazionalita(String nazionalita) {
        return Arrays.stream(postiBarca)
                .filter(barca -> barca != null && barca.nazionalita.equalsIgnoreCase(nazionalita))
                .map(barca -> barca.nome)
                .toArray(String[]::new); // Restituisce un array di nomi
    }

    // Metodo per calcolare il costo dell'affitto
    private double calcolaCosto(Barca barca, int giorni) {
        if (barca.tipologia.equalsIgnoreCase("vela")) {
            return 10 * barca.lunghezza * giorni; // Costo per barche a vela
        } else {
            return 20 * barca.stazza * giorni; // Costo per barche a motore
        }
    }

    // Metodo per verificare se ci sono posti disponibili in un certo intervallo
    private boolean trovaPosto(int da, int a) {
        for (int i = da - 1; i < a; i++) {
            if (!occupati[i]) {
                return true; // Restituisce true se trova un posto libero
            }
        }
        return false; // Restituisce false se non ci sono posti liberi
    }
}