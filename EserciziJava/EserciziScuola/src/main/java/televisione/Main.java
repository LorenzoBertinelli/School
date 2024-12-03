package televisione;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    // Metodo main per testare la classe
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continua = true;

            while (continua) {
                // Inserimento dati da tastiera
                System.out.print("Inserisci il nome della televisione: ");
                String nome = scanner.nextLine();

                System.out.print("Inserisci i pollici della televisione: ");
                int pollici = Integer.parseInt(scanner.nextLine());

                System.out.print("Inserisci la risoluzione della televisione: ");
                String risoluzione = scanner.nextLine();

                System.out.print("Inserisci lo stato della televisione (0=Spento, 1=Acceso, 2=StandBy): ");
                int statoInt = Integer.parseInt(scanner.nextLine());
                StatoTV stato = StatoTV.getStatoFromInt(statoInt);

                System.out.print("Inserisci il volume iniziale: ");
                int volume = Integer.parseInt(scanner.nextLine());

                System.out.print("Inserisci il canale iniziale: ");
                int canale = Integer.parseInt(scanner.nextLine());

                // Creazione dell'oggetto Televisione
                Televisione tv = new Televisione(nome, pollici, risoluzione, stato, volume, canale);

                // Menu interattivo per accensione/spegnimento, cambiare volume e canale
                System.out.println("\nVuoi accendere la televisione? (si/no)");
                String rispostaAccensione = scanner.nextLine();

                if (rispostaAccensione.equalsIgnoreCase("si")) {
                    tv.accensione();
                } else {
                    System.out.println("La televisione rimane nello stato attuale.");
                }

                System.out.println("\nVuoi modificare il volume? (si/no)");
                String rispostaVolume = scanner.nextLine();

                if (rispostaVolume.equalsIgnoreCase("si")) {
                    System.out.print("Inserisci il nuovo volume: ");
                    int nuovoVolume = Integer.parseInt(scanner.nextLine());
                    tv.modificaVolume(nuovoVolume);
                }

                System.out.println("\nVuoi cambiare il canale? (si/no)");
                String rispostaCanale = scanner.nextLine();

                if (rispostaCanale.equalsIgnoreCase("si")) {
                    System.out.print("Inserisci il nuovo canale: ");
                    int nuovoCanale = Integer.parseInt(scanner.nextLine());
                    tv.cambiaCanale(nuovoCanale);
                }

                // Menu per spegnere la televisione
                System.out.println("\nVuoi spegnere la televisione? (si/no)");
                String rispostaSpegnimento = scanner.nextLine();

                if (rispostaSpegnimento.equalsIgnoreCase("si")) {
                    tv.spegnimento();
                }

                // Stampa lo stato attuale della televisione
                System.out.println("\nStato attuale della televisione:");
                System.out.println(tv);

                // Chiedi se si vuole inserire una nuova televisione
                System.out.println("\nVuoi inserire una nuova televisione? (si/no)");
                String rispostaNuovaTV = scanner.nextLine();

                if (!rispostaNuovaTV.equalsIgnoreCase("si")) {
                    continua = false;
                    System.out.println("Programma terminato.");
                }
            }
        }
    }
}