package Gioco;

import java.util.Scanner;

public class Main {
    // Metodo principale che viene eseguito all'avvio del programma
    public static void main(String[] args) {
        // Crea un'istanza di Scanner per leggere l'input da console
        Scanner scanner = new Scanner(System.in);

        // Creazione degli oggetti per Eroe, Vampiro e Licantropo
        Eroe eroe = new Eroe(); // Crea un nuovo oggetto Eroe
        Vampiro vampiro = new Vampiro(); // Crea un nuovo oggetto Vampiro
        Licantropo licantropo = new Licantropo(); // Crea un nuovo oggetto Licantropo

        // Input per il numero di combattimenti dell'Eroe
        System.out.print("Quante volte vuoi che l'Eroe combatta? ");
        int combattimentiEroe = scanner.nextInt(); // Legge il numero di combattimenti dall'input dell'utente
        // Esegue un ciclo per combattere il numero di volte specificato
        for (int i = 0; i < combattimentiEroe; i++) {
            eroe.combatti(); // Chiama il metodo combatti sull'oggetto Eroe
        }

        // Input per il numero di azzanni del Vampiro
        System.out.print("Quante volte vuoi che il Vampiro azzanni? ");
        int azzanniVampiro = scanner.nextInt(); // Legge il numero di azzanni dall'input dell'utente
        // Esegue un ciclo per azzannare il numero di volte specificato
        for (int i = 0; i < azzanniVampiro; i++) {
            vampiro.azzanna(); // Chiama il metodo azzanna sull'oggetto Vampiro
        }

        // Input per il numero di combattimenti del Licantropo
        System.out.print("Quante volte vuoi che il Licantropo combatta da Umano? ");
        int combattimentiLicantropoUmano = scanner.nextInt(); // Legge il numero di combattimenti da Umano dall'input dell'utente
        // Esegue un ciclo per combattere da Umano il numero di volte specificato
        for (int i = 0; i < combattimentiLicantropoUmano; i++) {
            licantropo.cambiaForma(false); // Imposta il Licantropo come umano (non è luna piena)
            licantropo.combatti(); // Chiama il metodo combatti sull'oggetto Licantropo
        }

        // Input per il numero di combattimenti del Licantropo da Mostro
        System.out.print("Quante volte vuoi che il Licantropo combatta da Mostro? ");
        int combattimentiLicantropoMostro = scanner.nextInt(); // Legge il numero di combattimenti da Mostro dall'input dell'utente
        // Esegue un ciclo per combattere da Mostro il numero di volte specificato
        for (int i = 0; i < combattimentiLicantropoMostro; i++) {
            licantropo.cambiaForma(true); // Imposta il Licantropo come mostro (è luna piena)
            licantropo.combatti(); // Chiama il metodo combatti sull'oggetto Licantropo
        }

        // Stampa le forze rimanenti per ciascun personaggio
        System.out.println(eroe.getForza()); // Stampa la forza attuale dell'Eroe
        System.out.println(vampiro.getForza()); // Stampa la forza attuale del Vampiro
        System.out.println(licantropo.getForza()); // Stampa la forza attuale del Licantropo

        // Chiusura dello scanner per liberare risorse
        scanner.close(); // Chiude l'istanza di Scanner
    }
}