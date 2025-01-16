package StrumentiLaboratorioScuolaPag120_Es25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

// Classe principale per gestire l'interfaccia utente
public class Main {
    public static void main(String[] args) {
        GestioneStrumenti gestione = new GestioneStrumenti(); // Crea un'istanza della gestione strumenti
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Per leggere input da console

        while (true) {
            // Stampa il menu delle opzioni
            System.out.println("1. Aggiungi strumento");
            System.out.println("2. Elimina strumento");
            System.out.println("3. Cerca strumento per ID");
            System.out.println("4. Cerca strumento per descrizione");
            System.out.println("5. Valore totale strumenti in un periodo");
            System.out.println("6. Elenco strumenti in garanzia");
            System.out.println("7. Salva strumenti su file");
            System.out.println("8. Ripristina strumenti da file");
            System.out.println("9. Esci");
            System.out.print("Scegli un'opzione: ");

            try {
                int scelta = Integer.parseInt(reader.readLine()); // Legge l'opzione scelta

                switch (scelta) {
                    case 1: // Aggiungi strumento
                        System.out.print("Numero identificativo: ");
                        int id = Integer.parseInt(reader.readLine());
                        System.out.print("Descrizione: ");
                        String descrizione = reader.readLine();
                        System.out.print("Anno di acquisto: ");
                        int annoAcquisto = Integer.parseInt(reader.readLine());
                        System.out.print("Anno di garanzia: ");
                        int annoGaranzia = Integer.parseInt(reader.readLine());
                        Strumento strumento = new Strumento(id, descrizione, annoAcquisto, annoGaranzia);
                        gestione.aggiungiStrumento(strumento); // Aggiunge lo strumento
                        break;

                    case 2: // Elimina strumento
                        System.out.print("Numero identificativo da eliminare: ");
                        int idDaEliminare = Integer.parseInt(reader.readLine());
                        gestione.eliminaStrumento(idDaEliminare); // Elimina lo strumento
                        break;

                    case 3: // Cerca strumento per ID
                        System.out.print("Numero identificativo da cercare: ");
                        int idDaCercare = Integer.parseInt(reader.readLine());
                        Strumento strumentoTrovato = gestione.cercaStrumentoPerID(idDaCercare); // Cerca lo strumento
                        if (strumentoTrovato != null) {
                            System.out.println("Strumento trovato: " + strumentoTrovato.getDescrizione());
                        } else {
                            System.out.println("Strumento non trovato.");
                        }
                        break;

                    case 4: // Cerca strumento per descrizione
                        System.out.print("Descrizione da cercare: ");
                        String descrizioneDaCercare = reader.readLine();
                        List<Strumento> strumentiTrovati = gestione.cercaStrumentoPerDescrizione(descrizioneDaCercare); // Cerca strumenti
                        if (!strumentiTrovati.isEmpty()) {
                            System.out.println("Strumenti trovati: ");
                            strumentiTrovati.forEach(s -> System.out.println(s.getDescrizione()));
                        } else {
                            System.out.println("Nessuno strumento trovato.");
                        }
                        break;

                    case 5: // Valore totale strumenti in un periodo
                        System.out.print("Anno inizio: ");
                        int annoInizio = Integer.parseInt(reader.readLine());
                        System.out.print("Anno fine: ");
                        int annoFine = Integer.parseInt(reader.readLine());
                        int valoreTotale = gestione.valoreTotaleStrumenti(annoInizio, annoFine); // Calcola valore totale
                        System.out.println("Valore totale strumenti: " + valoreTotale);
                        break;

                    case 6: // Elenco strumenti in garanzia
                        System.out.print("Anno corrente: ");
                        int annoCorrente = Integer.parseInt(reader.readLine());
                        List<Strumento> strumentiInGaranzia = gestione.strumentiInGaranzia(annoCorrente); // Ottiene strumenti in garanzia
                        System.out.println("Strumenti in garanzia: ");
                        strumentiInGaranzia.forEach(s -> System.out.println(s.getDescrizione()));
                        break;

                    case 7: // Salva strumenti su file
                        System.out.print("Nome file per salvare: ");
                        String filenameSalvataggio = reader.readLine();
                        gestione.salvaStrumenti(filenameSalvataggio); // Salva strumenti
                        break;

                    case 8: // Ripristina strumenti da file
                        System.out.print("Nome file per ripristinare: ");
                        String filenameRipristino = reader.readLine();
                        gestione.ripristinaStrumenti(filenameRipristino); // Ripristina strumenti
                        break;

                    case 9: // Esci
                        System.out.println("Uscita dal programma.");
                        return;

                    default:
                        System.out.println("Scelta non valida."); // Messaggio di errore per scelta non valida
                }
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage()); // Gestione delle eccezioni
            }
        }
    }
}