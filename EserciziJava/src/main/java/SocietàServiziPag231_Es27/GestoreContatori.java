package SocietàServiziPag231_Es27;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class GestoreContatori {
    private Contatore[] contatori;
    private int contatoreCount;

    public GestoreContatori(int maxContatori) {
        this.contatori = new Contatore[maxContatori];
        this.contatoreCount = 0;
    }

    public void aggiungiContatore(Contatore contatore) {
        if (contatoreCount < contatori.length) {
            contatori[contatoreCount] = contatore;
            contatoreCount++;
        } else {
            System.out.println("Limite massimo di contatori raggiunto.");
        }
    }

    public void mostraContatori() {
        for (int i = 0; i < contatoreCount; i++) {
            if (contatori[i] != null) {
                System.out.println(contatori[i]);
            }
        }
    }

    public void salvaContatoriSuCSV(String filePath) {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs(); // Crea le directory se non esistono
                file.createNewFile(); // Crea il file
            }

            try (FileWriter writer = new FileWriter(file, false)) { // false per sovrascrivere il file
                writer.append("Matricola,Data Installazione,Ultima Lettura\n");
                for (int i = 0; i < contatoreCount; i++) {
                    if (contatori[i] != null) {
                        writer.append(contatori[i].getMatricola())
                              .append(",")
                              .append(contatori[i].getDataInstallazione().toString())
                              .append(",")
                              .append(contatori[i].getUltimaLettura() != null ? contatori[i].getUltimaLettura().toString() : "N/A")
                              .append("\n");
                    }
                }
                System.out.println("Contatori salvati su " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio su CSV: " + e.getMessage());
        }
    }

    public void leggiContatoriDaCSV(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Il file non esiste. Controlla il nome e riprova.");
            return;
        }

        try (FileReader reader = new FileReader(file)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("\nContenuto visualizzato con successo.");
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
    }
}