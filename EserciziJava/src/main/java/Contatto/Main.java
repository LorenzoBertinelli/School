package Contatto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creiamo una lista di contatti
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);

        // Ciclo per inserire contatti
        while (true) {
            System.out.println("Inserisci il nome del contatto (o 'exit' per terminare):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Inserisci il cognome del contatto:");
            String cognome = scanner.nextLine();

            System.out.println("Inserisci l'età del contatto:");
            int eta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline rimasto

            Contatto contatto = new Contatto(nome, cognome, eta);
            lista.inserisci(contatto);
        }

        // Visualizziamo i contatti
        System.out.println("Contatti inseriti:");
        lista.visualizza();

        // Eliminiamo il primo contatto
        lista.eliminaPrimo();

        // Visualizziamo di nuovo la lista
        System.out.println("Contatti dopo eliminazione:");
        lista.visualizza();

        scanner.close();
    }
}