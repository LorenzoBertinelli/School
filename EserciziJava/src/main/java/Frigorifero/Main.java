package Frigorifero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Frigorifero frigorifero = new Frigorifero(); 
        int scelta;
        do {
            System.out.println("Menu:");
            System.out.println("1. Aggiungi prodotto");
            System.out.println("2. Preleva prodotto");
            System.out.println("3. Elenca prodotti");
            System.out.println("4. Elenca prodotti scaduti");
            System.out.println("5. Conta prodotti per codice");
            System.out.println("6. Scrivi prodotti su file");
            System.out.println("7. Leggi prodotti da file");
            System.out.println("0. Esci");
            System.out.print("Inserisci la tua scelta: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma la nuova linea dopo l'intero
            switch (scelta) {
                case 1:
                    try {
                        System.out.print("Codice: ");
                        int codice = scanner.nextInt();
                        scanner.nextLine();  
                        System.out.print("Descrizione: ");
                        String descrizione = scanner.nextLine();
                        System.out.print("Data di scadenza (gg/mm/aa): ");
                        String data = scanner.nextLine();
                        String[] dataParts = data.split("/");
                        if (dataParts.length != 3) {
                            throw new IllegalArgumentException("Formato data non valido. Usa gg/mm/aa.");
                        }
                        int giorno = Integer.parseInt(dataParts[0]);
                        int mese = Integer.parseInt(dataParts[1]);
                        int anno = Integer.parseInt(dataParts[2]);
                        System.out.print("Calorie: ");
                        int calorie = scanner.nextInt();
                        Prodotto prodotto = new Prodotto(codice, descrizione, giorno, mese, anno, calorie);
                        frigorifero.aggiungiProdotto(prodotto);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Codice: ");
                    int codice = scanner.nextInt();
                    System.out.print("Data di scadenza (gg/mm/aa): ");
                    String dataPrelievo = scanner.next();
                    String[] dataPrelievoParts = dataPrelievo.split("/");
                    int giornoPrelievo = Integer.parseInt(dataPrelievoParts[0]);
                    int mesePrelievo = Integer.parseInt(dataPrelievoParts[1]);
                    int annoPrelievo = Integer.parseInt(dataPrelievoParts[2]);
                    frigorifero.prelevaProdotto(codice, giornoPrelievo, mesePrelievo, annoPrelievo);
                    break;
                case 3:
                    frigorifero.elencaProdotti();
                    break;
                case 4:
                    System.out.print("Data corrente (gg/mm/aa): ");
                    String dataScadenza = scanner.nextLine();
                    String[] dataScadenzaParts = dataScadenza.split("/");
                    int giornoScadenza = Integer.parseInt(dataScadenzaParts[0]);
                    int meseScadenza = Integer.parseInt(dataScadenzaParts[1]);
                    int annoScadenza = Integer.parseInt(dataScadenzaParts[2]);
                    frigorifero.elencaProdottiScaduti(giornoScadenza, meseScadenza, annoScadenza);
                    break;
                case 5:
                    System.out.print("Codice: ");
                    codice = scanner.nextInt();
                    frigorifero.contaProdotti(codice);
                    break;
                case 6:
                    frigorifero.scriviProdottiSuFile("prodotti.txt");
                    break;
                case 7:
                    frigorifero.leggiProdottiDaFile("prodotti.txt");
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);
        scanner.close(); //non obbligatorio
    }
}