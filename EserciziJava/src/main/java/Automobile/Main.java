package Automobile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenzia agenzia = new Agenzia("Noleggio Auto XYZ", "Via Roma 123", 70);
        int scelta;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Inserisci auto");
            System.out.println("2. Stampa auto noleggiate");
            System.out.println("3. Cerca auto");
            System.out.println("4. Stampa auto non noleggiate");
            System.out.println("5. Salva informazioni in CSV");
            System.out.println("6. Esci");
            System.out.print("Seleziona un'opzione: ");
            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Quante auto vuoi inserire? ");
                    int numeroAuto = scanner.nextInt();
                    scanner.nextLine();

                    if (numeroAuto > 70) {
                        System.out.println("Non puoi inserire più di 70 auto.");
                        break;
                    }

                    for (int i = 0; i < numeroAuto; i++) {
                        System.out.println("Inserisci i dettagli per l'auto " + (i + 1) + ":");

                        System.out.print("Codice: ");
                        String codice = scanner.nextLine();

                        System.out.print("Modello: ");
                        String modello = scanner.nextLine();

                        System.out.print("E' noleggiata? (V/F): ");
                        String noleggiataInput = scanner.nextLine().toUpperCase();
                        boolean noleggiata = noleggiataInput.equals("V");

                        int numNoleggi = 0;
                        if (noleggiata) {
                            System.out.print("Numero di noleggi: ");
                            numNoleggi = scanner.nextInt();
                            scanner.nextLine();
                        }

                        Auto auto = new Auto(codice, modello, noleggiata, numNoleggi);
                        agenzia.inserisciAuto(auto);
                    }
                    break;

                case 2:
                    agenzia.stampaAutoNoleggiate();
                    break;

                case 3:
                    System.out.print("Inserisci il codice dell'auto da cercare: ");
                    String codiceCercato = scanner.nextLine();
                    agenzia.cercaAuto(codiceCercato);
                    break;

                case 4:
                    System.out.println("Auto non noleggiate:");
                    agenzia.stampaAutoNonNoleggiate();
                    break;

                case 5:
                    System.out.print("Inserisci il nome del file (es. auto.csv): ");
                    String nomeFile = scanner.nextLine();
                    agenzia.salvaInCSV(nomeFile);
                    break;

                case 6:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        } while (scelta != 6);

        scanner.close();
    }
}