package Automobile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Agenzia {
    private String nome;
    private String indirizzo;
    private Auto[] autoArray;
    private int numeroAuto;

    public Agenzia(String nome, String indirizzo, int capacita) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.autoArray = new Auto[capacita];
        this.numeroAuto = 0;
    }

    public void inserisciAuto(Auto auto) {
        if (numeroAuto < autoArray.length) {
            autoArray[numeroAuto] = auto;
            numeroAuto++;
        } else {
            System.out.println("Capacità massima raggiunta. Non è possibile inserire altre auto.");
        }
    }

    public void salvaInCSV(String nomeFile) {
        BufferedWriter writer = null;
        try {
            // Imposta il percorso completo per il file CSV
            String percorsoCompleto = "C:\\Users\\Lorenzo\\OneDrive\\Desktop\\Documenti\\School\\EserciziJava\\src\\main\\java\\Automobile\\" + nomeFile;
            writer = new BufferedWriter(new FileWriter(percorsoCompleto));

            // Scrittura dell'intestazione
            writer.write("Codice,Modello,Noleggiata,Numero di Noleggi,Costo Noleggio\n");
            for (int i = 0; i < numeroAuto; i++) {
                Auto auto = autoArray[i];
                writer.write(auto.getCodice() + "," + auto.getModello() + "," +
                             (auto.isNoleggiata() ? "V" : "F") + "," +
                             auto.getNumeroNoleggi() + "," +
                             auto.calcolaCostoNoleggio() + "\n");
            }
            System.out.println("Informazioni salvate in " + percorsoCompleto);
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio delle informazioni: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Errore durante la chiusura del writer: " + e.getMessage());
            }
        }
    }
   

    public void stampaAutoNoleggiate() {
        System.out.println("Auto noleggiate:");
        for (int i = 0; i < numeroAuto; i++) {
            Auto auto = autoArray[i];
            if (auto.isNoleggiata()) {
                double costoNoleggio = auto.calcolaCostoNoleggio();
                System.out.println("Codice: " + auto.getCodice() + ", Modello: " + auto.getModello() + ", Numero di Noleggi: " + auto.getNumeroNoleggi() +  ", Costo Noleggio: " + costoNoleggio + " Euro");
            }
        }
    }

    public void cercaAuto(String codice) {
        boolean trovata = false;
        for (int i = 0; i < numeroAuto; i++) {
            Auto auto = autoArray[i];
            if (auto.getCodice().equalsIgnoreCase(codice)) {
                System.out.println("Auto trovata: Codice: " + auto.getCodice() + ", Modello: " + auto.getModello() +
                                   ", Noleggiata: " + (auto.isNoleggiata() ? "V" : "F") +
                                   ", Numero di Noleggi: " + auto.getNumeroNoleggi() +
                                   ", Costo Noleggio: " + auto.calcolaCostoNoleggio() + " Euro");
                trovata = true;
                break;
            }
        }
        if (!trovata) {
            System.out.println("Auto non trovata.");
        }
    }

    public void stampaAutoNonNoleggiate() {
        for (int i = 0; i < numeroAuto; i++) {
            Auto auto = autoArray[i];
            if (!auto.isNoleggiata()) {
                System.out.println("Codice: " + auto.getCodice() + ", Modello: " + auto.getModello());
            }
        }
    }
}