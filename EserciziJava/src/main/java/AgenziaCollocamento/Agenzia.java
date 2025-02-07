package AgenziaCollocamento;

import java.io.*;

public class Agenzia {
    private Corso[] corsi;
    private int numeroCorsi;

    public Agenzia(int maxCorsi) {
        corsi = new Corso[maxCorsi];
        numeroCorsi = 0;
    }

    public void visualizzaCorsiDaFile(String nomeFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nomeFile));
        String linea;
        System.out.println("Contenuto del file " + nomeFile + ":");
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea); // Stampa ogni riga del file
        }
        reader.close();
    }

    public void caricaCorsiDaFile(String nomeFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nomeFile));
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] dati = linea.split(",");
            if (dati.length == 5) { // Assicurati che ci siano 5 elementi
                corsi[numeroCorsi++] = new Corso(dati[0], dati[1], dati[2], Integer.parseInt(dati[3]), Integer.parseInt(dati[4]));
            } else {
                System.err.println("Formato della riga non valido: " + linea);
            }
        }
        reader.close();
    }

    public void salvaCorsiInFile(String nomeFile) throws IOException {
        File file = new File(nomeFile);
        if (!file.exists()) {
            file.createNewFile(); // Crea il file se non esiste
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < numeroCorsi; i++) {
            Corso corso = corsi[i];
            writer.write(corso.getCodice() + "," + corso.getNome() + "," + corso.getCognomeDocente() + ","
                    + corso.getNumeroOre() + "," + corso.getNumeroMassimoIscritti() + "\n");
        }
        writer.close();
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

    public boolean creaCorso(String codice, String nome, String cognomeDocente, int numeroOre, int numeroMassimoIscritti, String nomeFile) {
        if (numeroCorsi < corsi.length) {
            Corso nuovoCorso = new Corso(codice, nome, cognomeDocente, numeroOre, numeroMassimoIscritti);
            corsi[numeroCorsi++] = nuovoCorso;

            try {
                salvaCorsoInFile(nuovoCorso, nomeFile);
                System.out.println("Corso creato e salvato in " + nomeFile);
                return true;
            } catch (IOException e) {
                System.err.println("Errore nel salvataggio del corso: " + e.getMessage());
            }
        } else {
            System.out.println("Impossibile creare il corso: numero massimo di corsi raggiunto.");
        }
        return false;
    }

    private void salvaCorsoInFile(Corso corso, String nomeFile) throws IOException {
        File file = new File(nomeFile);
        if (!file.exists()) {
            file.createNewFile(); // Crea il file se non esiste
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true)); // Aggiungi in append
        writer.write(corso.getCodice() + "," + corso.getNome() + "," + corso.getCognomeDocente() + ","
                + corso.getNumeroOre() + "," + corso.getNumeroMassimoIscritti() + "\n");
        writer.close();
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