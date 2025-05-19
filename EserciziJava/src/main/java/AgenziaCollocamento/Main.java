package AgenziaCollocamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenzia agenzia = new Agenzia(10); // Inizializza l'agenzia con un array di corsi di dimensione 10

        // Carica i corsi dal file all'avvio
        agenzia.caricaCorsiDaFile();

        int scelta;
        do {
            System.out.println("Seleziona un'opzione:");
            System.out.println("1. Visualizza corsi da file");
            System.out.println("2. Salva corsi in file");
            System.out.println("3. Visualizza corsi con posti liberi");
            System.out.println("4. Iscrivi a un corso");
            System.out.println("5. Elimina iscrizione a un corso");
            System.out.println("6. Crea un nuovo corso");
            System.out.println("0. Esci");
            System.out.print("Inserisci l'opzione: "); // Aggiunta della scritta

            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1:
                    agenzia.visualizzaCorsiDaFile(); // Non serve passare il nome del file
                    break;
                case 2:
                    agenzia.salvaCorsiInFile(); // Anche qui non serve passare il nome del file
                    System.out.println("Corsi salvati in " + Agenzia.NOME_FILE); // Informazione sul salvataggio
                    break;
                case 3:
                    agenzia.visualizzaCorsiConPostiLiberi();
                    break;
                case 4:
                    System.out.print("Inserisci il codice del corso a cui iscriversi: ");
                    String codiceCorsoIscrizione = scanner.nextLine();
                    System.out.print("Inserisci il numero di iscritti: ");
                    int numeroIscritti = scanner.nextInt();
                    agenzia.iscriviACorso(codiceCorsoIscrizione, numeroIscritti);
                    break;
                case 5:
                    System.out.print("Inserisci il codice del corso da cui eliminare l'iscrizione: ");
                    String codiceCorsoEliminazione = scanner.nextLine();
                    System.out.print("Inserisci il numero di iscritti da eliminare: ");
                    int numeroEliminazioni = scanner.nextInt();
                    agenzia.eliminaIscrizione(codiceCorsoEliminazione, numeroEliminazioni);
                    break;
                case 6:
                    System.out.print("Inserisci il codice del nuovo corso: ");
                    String codiceCorso = scanner.nextLine();
                    System.out.print("Inserisci il nome del nuovo corso: ");
                    String nomeCorso = scanner.nextLine();
                    System.out.print("Inserisci il cognome del docente: ");
                    String cognomeDocente = scanner.nextLine();
                    System.out.print("Inserisci il numero di ore: ");
                    int numeroOre = scanner.nextInt();
                    System.out.print("Inserisci il numero massimo di iscritti: ");
                    int numeroMassimoIscritti = scanner.nextInt();
                    scanner.nextLine(); // Consuma il newline

                    agenzia.creaCorso(codiceCorso, nomeCorso, cognomeDocente, numeroOre, numeroMassimoIscritti);
                    break;
                case 0:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        } while (scelta != 0);

        scanner.close();
    }
}