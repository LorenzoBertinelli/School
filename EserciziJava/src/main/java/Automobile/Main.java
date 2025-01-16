package Automobile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenzia agenzia = new Agenzia("Noleggio Auto XYZ", "Via Roma 123", 10); // Capacità massima di 10 auto

        // Richiesta di informazioni all'utente
        System.out.print("Quante auto vuoi inserire? ");
        int numeroAuto = scanner.nextInt();
        scanner.nextLine(); // Consuma la nuova linea

        for (int i = 0; i < numeroAuto; i++) {
            System.out.println("Inserisci i dettagli per l'auto " + (i + 1) + ":");

            System.out.print("Codice: ");
            String codice = scanner.nextLine();

            System.out.print("Modello: ");
            String modello = scanner.nextLine();

            System.out.print("È noleggiata? (true/false): ");
            boolean noleggiata = scanner.nextBoolean();

            System.out.print("Numero di noleggi: ");
            int numNoleggi = scanner.nextInt();
            scanner.nextLine(); // Consuma la nuova linea

            Auto auto = new Auto(codice, modello, noleggiata, numNoleggi);
            agenzia.inserisciAuto(auto);
        }

        // Stampa delle auto noleggiate
        agenzia.stampaAutoNoleggiate();

        // Ricerca di un'auto
        System.out.print("Inserisci il codice dell'auto da cercare: ");
        String codiceCercato = scanner.nextLine();
        agenzia.cercaAuto(codiceCercato);

        // Stampa delle auto non noleggiate
        System.out.println("Auto non noleggiate:");
        agenzia.stampaAutoNonNoleggiate();
    }
}