package AutonoleggioPag121_Es23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autonoleggio autonoleggio = new Autonoleggio(1000); // Capacità massima di 1000 veicoli
        Scanner scanner = new Scanner(System.in); // Scanner per l'input dell'utente
        boolean running = true; // Variabile per controllare il ciclo principale

        // Ciclo principale per gestire le operazioni dell'autonoleggio
        while (running) {
            // Stampa il menu delle opzioni
            System.out.println("1. Aggiungi veicolo");
            System.out.println("2. Elimina veicolo");
            System.out.println("3. Ricerca veicolo");
            System.out.println("4. Ricerca veicoli per numero posti");
            System.out.println("5. Inventario");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt(); // Leggi la scelta dell'utente
            scanner.nextLine();  // Consuma il newline

            switch (scelta) {
                case 1:
                    // Aggiunta veicolo
                    try {
                        System.out.print("Inserisci targa: ");
                        String targa = scanner.nextLine(); // Leggi la targa
                        System.out.print("Inserisci marca: ");
                        String marca = scanner.nextLine(); // Leggi la marca
                        System.out.print("Inserisci modello: ");
                        String modello = scanner.nextLine(); // Leggi il modello
                        System.out.print("Inserisci numero posti: ");
                        int numeroPosti = scanner.nextInt(); // Leggi il numero di posti
                        autonoleggio.aggiungiVeicolo(targa, marca, modello, numeroPosti); // Aggiungi il veicolo
                        System.out.println("Veicolo aggiunto con successo.");
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage()); // Gestisci eventuali errori
                    }
                    break;

                case 2:
                    // Eliminazione veicolo
                    try {
                        System.out.print("Inserisci codice: ");
                        int codice = scanner.nextInt(); // Leggi il codice del veicolo
                        System.out.print("Inserisci targa: ");
                        String targa = scanner.nextLine(); // Leggi la targa
                        autonoleggio.eliminaVeicolo(codice, targa); // Elimina il veicolo
                        System.out.println("Veicolo eliminato con successo.");
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage()); // Gestisci eventuali errori
                    }
                    break;

                case 3:
                    // Ricerca veicolo
                    try {
                        System.out.print("Inserisci codice: ");
                        int codice = scanner.nextInt(); // Leggi il codice del veicolo
                        System.out.print("Inserisci targa: ");
                        String targa = scanner.nextLine(); // Leggi la targa
                        Veicolo veicolo = autonoleggio.ricercaVeicolo(codice, targa); // Cerca il veicolo
                        System.out.println("Veicolo trovato: " + veicolo); // Stampa il veicolo trovato
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage()); // Gestisci eventuali errori
                    }
                    break;

                case 4:
                    // Ricerca veicoli per numero posti
                    System.out.print("Inserisci numero posti: ");
                    int numeroPosti = scanner.nextInt(); // Leggi il numero di posti
                    Veicolo[] veicoli = autonoleggio.ricercaVeicoliPerPosti(numeroPosti); // Cerca i veicoli
                    System.out.println("Veicoli trovati:");
                    for (Veicolo v : veicoli) {
                        if (v != null) {
                            System.out.println(v); // Stampa i veicoli trovati
                        }
                    }
                    break;

                case 5:
                    // Inventario (da implementare)
                    System.out.println("Funzionalità inventario non implementata.");
                    break;

                case 0:
                    running = false; // Esci dal ciclo
                    break;

                default:
                    System.out.println("Scelta non valida."); // Gestisci scelte non valide
                    break;
            }
        }
        scanner.close(); // Chiudi lo scanner
    }
}