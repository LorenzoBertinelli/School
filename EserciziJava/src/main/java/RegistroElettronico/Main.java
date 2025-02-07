package RegistroElettronico;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nome del file in cui scrivere: ");
        String nomeFile = scanner.nextLine();
        Disciplina matematica = new Disciplina(10, nomeFile); // Massimo 10 valutazioni

        while (true) {
            System.out.println("Scegli un'operazione:");
            System.out.println("1. Aggiungi valutazione");
            System.out.println("2. Elimina valutazione");
            System.out.println("3. Calcola media per tipologia");
            System.out.println("4. Calcola media totale");
            System.out.println("5. Visualizza tutte le valutazioni");
            System.out.println("6. Esci");
            System.out.print("Opzione: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1: // Aggiungi valutazione
                    System.out.print("Inserisci il voto (0-10): ");
                    double voto = scanner.nextDouble();
                    System.out.print("Inserisci la tipologia (O/S/P): ");
                    char tipologia = scanner.next().charAt(0);
                    System.out.print("Inserisci la data (yyyy-MM-dd): ");
                    String dataString = scanner.next();
                    LocalDate data = LocalDate.parse(dataString); // Usa LocalDate per la conversione
                    scanner.nextLine(); // Consuma il newline
                    System.out.print("Inserisci note: ");
                    String note = scanner.nextLine();

                    try {
                        matematica.aggiungiValutazione(new Valutazione(voto, tipologia, data, note));
                        System.out.println("Valutazione aggiunta con successo.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;

                case 2: // Elimina valutazione
                    System.out.print("Inserisci la tipologia da eliminare (O/S/P): ");
                    char tipologiaElimina = scanner.next().charAt(0);
                    System.out.print("Inserisci la data da eliminare (yyyy-MM-dd): ");
                    String dataEliminaString = scanner.next();
                    LocalDate dataElimina = LocalDate.parse(dataEliminaString); // Usa LocalDate per la conversione

                    matematica.eliminaValutazione(tipologiaElimina, dataElimina);
                    System.out.println("Valutazione eliminata se esisteva.");
                    break;

                case 3: // Calcola media per tipologia
                    System.out.print("Inserisci la tipologia per calcolare la media (O/S/P): ");
                    char tipologiaMedia = scanner.next().charAt(0);
                    double mediaTipologia = matematica.calcolaMediaTipologia(tipologiaMedia);
                    System.out.println("Media per tipologia " + tipologiaMedia + ": " + mediaTipologia);
                    break;

                case 4: // Calcola media totale
                    double mediaTotale = matematica.calcolaMediaTotale();
                    System.out.println("Media totale: " + mediaTotale);
                    break;

                case 5: // Visualizza tutte le valutazioni
                    Valutazione[] tutteLeValutazioni = matematica.estraiValutazioni();
                    System.out.println("Tutte le valutazioni:");
                    for (Valutazione v : tutteLeValutazioni) {
                        System.out.println("Voto: " + v.getVoto() + ", Tipologia: " + v.getTipologia() + ", Data: " + v.getData());
                    }
                    break;

                case 6: // Esci
                    System.out.println("Uscita dal programma.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Operazione non valida. Riprova.");
            }
        }
    }
}