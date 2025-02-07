package Palestra;

import java.io.*;

public class Palestra {
    private Attivita[] attivita;
    private int numeroAttivita;

    public Palestra(int maxAttivita) {
        this.attivita = new Attivita[maxAttivita];
        this.numeroAttivita = 0;
    }

    public boolean aggiungi(Attivita a) {
        if (numeroAttivita < attivita.length) {
            attivita[numeroAttivita++] = a;
            return true;
        }
        return false;
    }

    public Attivita elimina(String tipo) {
        for (int i = 0; i < numeroAttivita; i++) {
            if (attivita[i].dammiTipo().equals(tipo)) {
                Attivita eliminata = attivita[i];
                // Sposta le attività successive
                for (int j = i; j < numeroAttivita - 1; j++) {
                    attivita[j] = attivita[j + 1];
                }
                attivita[--numeroAttivita] = null; // Riduce il contatore
                return eliminata;
            }
        }
        return null;
    }

    public void salvaInFile(String nomeFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            for (int i = 0; i < numeroAttivita; i++) {
                Attivita att = attivita[i];
                writer.write(att.dammiTipo() + "," + att.prevedeIstruttore() + "," + att.postiDisponibili());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Errore durante il salvataggio su file: " + e.getMessage());
        }
    }

    public void caricaDaFile(String nomeFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeFile))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] parti = linea.split(",");
                String tipo = parti[0];
                boolean istruttore = Boolean.parseBoolean(parti[1]);
                int maxIscritti = Integer.parseInt(parti[2]);
                System.out.println("Tipo: " + tipo + ", Istruttore: " + istruttore + ", Max Iscritti: " + maxIscritti);
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura da file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Errore nel formato dei dati: " + e.getMessage());
        }
    }

    // Metodo per stampare le attività nel terminale
    public void stampaAttivita() {
        for (int i = 0; i < numeroAttivita; i++) {
            Attivita att = attivita[i];
            System.out.println("Tipo: " + att.dammiTipo() + ", Istruttore: " + att.prevedeIstruttore() + ", Posti Disponibili: " + att.postiDisponibili());
        }
    }
}