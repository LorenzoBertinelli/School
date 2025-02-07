package Palestra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palestra palestra = new Palestra(1000); // Max 1000 attività
        int scelta;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Aggiungi attivita'");
            System.out.println("2. Stampa attività salvate");
            System.out.println("3. Elimina attivita'");
            System.out.println("4. Salva informazioni in CSV");
            System.out.println("5. Esci");
            System.out.print("Seleziona un'opzione: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1:
                    System.out.print("Quante attivita' vuoi aggiungere? ");
                    int numeroAttivita = scanner.nextInt();
                    scanner.nextLine();

                    if (numeroAttivita > 1000) {
                        System.out.println("Non puoi inserire più di 1000 attivita'.");
                        break;
                    }

                    for (int i = 0; i < numeroAttivita; i++) {
                        System.out.println("Inserisci dettagli per l'attivita' " + (i + 1) + ":");
                        System.out.print("Tipo di attivita': ");
                        String tipo = scanner.nextLine();

                        System.out.print("L'attivita' prevede un istruttore? (true/false): ");
                        boolean istruttore = scanner.nextBoolean();

                        System.out.print("Numero massimo di iscritti: ");
                        int maxIscritti = scanner.nextInt();
                        scanner.nextLine(); // Consuma il newline

                        palestra.aggiungi(new Attivita(tipo, istruttore, maxIscritti));
                    }
                    break;

                case 2:
                    System.out.println("Attività salvate:");
                    palestra.stampaAttivita(); // Assicurati di avere il metodo stampaAttivita
                    break;

                case 3:
                    System.out.print("Inserisci il tipo di attivita' da eliminare: ");
                    String tipoDaEliminare = scanner.nextLine();
                    Attivita eliminata = palestra.elimina(tipoDaEliminare);
                    if (eliminata != null) {
                        System.out.println("Attivita' " + tipoDaEliminare + " eliminata.");
                    } else {
                        System.out.println("Nessuna attivita' trovata con il tipo " + tipoDaEliminare + ".");
                    }
                    break;

                case 4:
                    System.out.print("Inserisci il nome del file (es. attivita.csv): ");
                    String nomeFile = scanner.nextLine();
                    palestra.salvaInFile(nomeFile); // Assicurati che il metodo esista
                    break;

                case 5:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        } while (scelta != 5);

        scanner.close();
    }
}