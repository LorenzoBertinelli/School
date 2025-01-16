package Lampadina;

/**
 *
 * @author Lorenzo
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedere il numero di lampadine da inserire
        System.out.print("Quante lampadine vuoi inserire? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline

        // Creazione dell'array di lampadine
        Lampadina[] lampadine = new Lampadina[n];

        // Inserimento delle lampadine
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci le caratteristiche della lampadina " + (i + 1) + ":");

            System.out.print("Colore: ");
            String colore = scanner.nextLine();

            System.out.print("Potenza (in Watt): ");
            int potenza = scanner.nextInt();

            System.out.print("E' accesa? (true/false): ");
            boolean accesa = scanner.nextBoolean();
            scanner.nextLine(); // Consuma il newline

            // Creazione della lampadina
            lampadine[i] = new Lampadina(colore, potenza, accesa);
        }

        // Stampa delle caratteristiche di tutte le lampadine
        System.out.println("\nCaratteristiche delle lampadine inserite:");
        for (Lampadina lampadina : lampadine) {
            lampadina.stampaCaratteristiche();
        }

        // Contare quante lampadine sono accese
        int acceseCount = 0;
        for (Lampadina lampadina : lampadine) {
            if (lampadina.isAccesa()) {
                acceseCount++;
            }
        }
        System.out.println("\nNumero di lampadine accese: " + acceseCount);

        // Contare quante lampadine sono di un certo colore
        System.out.print("\nInserisci il colore per contare le lampadine: ");
        String coloreDaContare = scanner.nextLine();

        int coloreCount = 0;
        for (Lampadina lampadina : lampadine) {
            if (lampadina.getColore().equalsIgnoreCase(coloreDaContare)) {
                coloreCount++;
            }
        }
        System.out.println("Numero di lampadine di colore " + coloreDaContare + ": " + coloreCount);

        scanner.close();
    }
}