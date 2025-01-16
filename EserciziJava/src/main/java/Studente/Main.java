package Studente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il nome dello studente: ");
        String nomeStudente = scanner.nextLine();
        Studente studente = new Studente(nomeStudente, 10); // Massimo 10 voti

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi Voto");
            System.out.println("2. Calcola Media Voti Orali");
            System.out.println("3. Calcola Media Voti Totali");
            System.out.println("4. Estrai Voti");
            System.out.println("5. Estrai Voti di una Tipologia");
            System.out.println("6. Elimina Voto");
            System.out.println("7. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1:
                    // Aggiunta di un nuovo voto
                    System.out.print("Inserisci il voto (0-10): ");
                    double voto = scanner.nextDouble();
                    scanner.nextLine(); // Consuma il newline
                    System.out.print("Inserisci la tipologia (O/S/P): ");
                    char tipologia = scanner.nextLine().charAt(0);
                    System.out.print("Inserisci la data (gg/mm/aaaa): ");
                    String dataInput = scanner.nextLine();
                    LocalDate data = LocalDate.parse(dataInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    System.out.print("Inserisci note: ");
                    String note = scanner.nextLine();
                    studente.aggiungiVoto(new Voto(voto, tipologia, data, note));
                    break;

                case 2:
                    // Calcolo media voti orali
                    System.out.println("Media Voti Orali: " + studente.calcolaMediaTipologia('O'));
                    break;

                case 3:
                    // Calcolo media voti totali
                    System.out.println("Media Voti Totale: " + studente.calcolaMediaTotale());
                    break;

                case 4:
                    // Estrazione di tutti i voti
                    Voto[] tuttiIVoti = studente.estraiVoti();
                    System.out.println("Tutti i Voti:");
                    for (Voto votoEstratto : tuttiIVoti) {
                        System.out.println("Voto: " + votoEstratto.getVoto() + ", Tipologia: " + votoEstratto.getTipologia() + ", Data: " + votoEstratto.getData());
                    }
                    break;

                case 5:
                    // Estrazione voti di una specifica tipologia
                    System.out.print("Inserisci la tipologia da estrarre (O/S/P): ");
                    char tipologiaEstratta = scanner.nextLine().charAt(0);
                    Voto[] votiTipologia = studente.estraiVotiTipologia(tipologiaEstratta);
                    System.out.println("Voti di tipologia " + tipologiaEstratta + ":");
                    for (Voto votoEstratto : votiTipologia) {
                        System.out.println("Voto: " + votoEstratto.getVoto() + ", Data: " + votoEstratto.getData());
                    }
                    break;

                case 6:
                    // Eliminazione di un voto
                    System.out.print("Inserisci la tipologia del voto da eliminare (O/S/P): ");
                    char tipologiaDaEliminare = scanner.nextLine().charAt(0);
                    System.out.print("Inserisci la data del voto da eliminare (gg/mm/aaaa): ");
                    String dataDaEliminareInput = scanner.nextLine();
                    LocalDate dataDaEliminare = LocalDate.parse(dataDaEliminareInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    studente.eliminaVoto(tipologiaDaEliminare, dataDaEliminare);
                    break;

                case 7:
                    // Uscita
                    System.out.println("Uscita dal programma.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }
    }
}