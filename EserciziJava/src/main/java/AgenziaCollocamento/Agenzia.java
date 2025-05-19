package AgenziaCollocamento;

import java.io.*;

public class Agenzia {
    private Corso[] corsi;
    private int numeroCorsi;
    private static final String DIRECTORY_PATH = "C:\\Users\\Lorenzo\\OneDrive\\Desktop\\Documenti\\School\\EserciziJava\\src\\main\\java\\AgenziaCollocamento\\";
    public static final String NOME_FILE = "corsi.csv"; // Nome del file fisso

    public Agenzia(int maxCorsi) {
        corsi = new Corso[maxCorsi];
        numeroCorsi = 0;
    }

    public void visualizzaCorsiDaFile() {
        String filePath = DIRECTORY_PATH + NOME_FILE;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String linea;
            System.out.println("Contenuto del file " + filePath + ":");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Errore nella lettura del file: " + e.getMessage());
        }
    }

    public void caricaCorsiDaFile() {
        String filePath = DIRECTORY_PATH + NOME_FILE;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] dati = linea.split(",");
                if (dati.length == 5) { // Assicurati che ci siano 5 elementi
                    corsi[numeroCorsi++] = new Corso(dati[0], dati[1], dati[2], Integer.parseInt(dati[3]), Integer.parseInt(dati[4]));
                } else {
                    System.err.println("Formato della riga non valido: " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Errore nella lettura del file: " + e.getMessage());
        }
    }

    public void salvaCorsiInFile() {
        String filePath = DIRECTORY_PATH + NOME_FILE;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < numeroCorsi; i++) {
                Corso corso = corsi[i];
                writer.write(corso.getCodice() + "," + corso.getNome() + "," + corso.getCognomeDocente() + ","
                        + corso.getNumeroOre() + "," + corso.getNumeroMassimoIscritti() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Errore nel salvataggio dei corsi: " + e.getMessage());
        }
    }

    public boolean creaCorso(String codice, String nome, String cognomeDocente, int numeroOre, int numeroMassimoIscritti) {
        if (numeroCorsi < corsi.length) {
            Corso nuovoCorso = new Corso(codice, nome, cognomeDocente, numeroOre, numeroMassimoIscritti);
            corsi[numeroCorsi++] = nuovoCorso;

            try {
                salvaCorsoInFile(nuovoCorso);
                System.out.println("Corso creato e salvato in " + NOME_FILE);
                return true;
            } catch (IOException e) {
                System.err.println("Errore nel salvataggio del corso: " + e.getMessage());
            }
        } else {
            System.out.println("Impossibile creare il corso: numero massimo di corsi raggiunto.");
        }
        return false;
    }

    private void salvaCorsoInFile(Corso corso) throws IOException {
        String filePath = DIRECTORY_PATH + NOME_FILE;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // Aggiungi in append
            writer.write(corso.getCodice() + "," + corso.getNome() + "," + corso.getCognomeDocente() + ","
                    + corso.getNumeroOre() + "," + corso.getNumeroMassimoIscritti() + "\n");
        }
    }

    public void visualizzaCorsiConPostiLiberi() {
        System.out.println("Corsi con posti liberi:");
        boolean trovato = false;
        for (int i = 0; i < numeroCorsi; i++) {
            if (corsi[i].postiDisponibili() > 0) {
                System.out.println("Codice: " + corsi[i].getCodice() + 
                                   ", Nome: " + corsi[i].getNome() + 
                                   ", Posti disponibili: " + corsi[i].postiDisponibili());
                trovato = true;
            }
        }
        if (!trovato) {
            System.out.println("Nessun corso con posti liberi.");
        }
    }

    public void iscriviACorso(String codiceCorso, int numeroIscritti) {
        Corso corso = trovaCorso(codiceCorso);
        if (corso != null) {
            if (corso.postiDisponibili() >= numeroIscritti) {
                corso.aggiungiIscritti(numeroIscritti);
                System.out.println("Iscrizione completata per il corso " + codiceCorso);
            } else {
                System.out.println("Non ci sono posti disponibili per il corso " + codiceCorso);
            }
        } else {
            System.out.println("Corso non trovato con codice " + codiceCorso);
        }
    }

    public void eliminaIscrizione(String codiceCorso, int numeroEliminazioni) {
        Corso corso = trovaCorso(codiceCorso);
        if (corso != null) {
            corso.rimuoviIscritti(numeroEliminazioni);
            System.out.println("Iscrizione eliminata per il corso " + codiceCorso);
        } else {
            System.out.println("Corso non trovato con codice " + codiceCorso);
        }
    }

    private Corso trovaCorso(String codice) {
        for (int i = 0; i < numeroCorsi; i++) {
            if (corsi[i].getCodice().equalsIgnoreCase(codice)) {
                return corsi[i];
            }
        }
        return null;
    }

    public Corso[] getCorsi() {
        return corsi;
    }

    public int getNumeroCorsi() {
        return numeroCorsi;
    }
}