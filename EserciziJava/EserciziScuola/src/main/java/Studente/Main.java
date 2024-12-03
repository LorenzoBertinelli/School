package Studente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inserimento del nome e cognome dello studente
        System.out.print("Inserisci il nome dello studente: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci il cognome dello studente: ");
        String cognome = scanner.nextLine();
        
        // Chiedi all'utente quanti voti vuole inserire
        System.out.print("Quanti voti vuoi inserire per lo studente? ");
        int numeroVoti = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline rimasto

        // Creazione dell'oggetto Studente
        Studente studente = new Studente(nome, cognome, numeroVoti);

        // Inserimento dei voti e materie con controlli di integrità
        for (int i = 0; i < numeroVoti; i++) {
            System.out.print("Inserisci la materia del voto " + (i + 1) + ": ");
            String materia = scanner.nextLine();

            float voto;
            while (true) {
                System.out.print("Inserisci il voto per " + materia + " (tra 1 e 10): ");
                String votoInput = scanner.nextLine().replace(',', '.'); // Sostituisce la virgola con il punto
                
                try {
                    voto = Float.parseFloat(votoInput); // Converte la stringa in float
                    if (voto >= 1 && voto <= 10) {
                        break; // Esci dal ciclo se il voto è valido
                    } else {
                        System.out.println("Errore: il voto deve essere compreso tra 1 e 10.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Errore: inserisci un numero valido.");
                }
            }

            // Creazione e aggiunta del voto all'oggetto Studente
            Voto v = new Voto(materia, voto);
            studente.aggiungiVoto(v);
        }

        // Stampa delle informazioni sullo studente
        studente.stampaInfo();

        // Richiesta della materia per visualizzare il voto più alto
        System.out.print("Inserisci il nome della materia per visualizzare il voto piu' alto: ");
        String materiaRichiesta = scanner.nextLine();
        studente.votoPiuAltoMateria(materiaRichiesta);

        // Visualizza il voto/i più alto/i tra tutte le materie
        studente.votoPiuAltoTotale();

        scanner.close();
    }
}