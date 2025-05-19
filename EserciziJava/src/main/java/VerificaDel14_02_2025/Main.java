/*Verifica pratica (array di oggetti, eccezioni, file di testo)
Un magazzino gestisce prodotti sportivi, ciascuno caratterizzato da un codice, una descrizione, una quantità massima, un costo unitario, quantità 
effettivamente presente.
Realizzare le seguenti classi, con i metodi pubblici elencati di seguito:
Classe Prodotto:
• un metodo che calcola il costo totale del prodotto (quantità in magazzino ;
• un metodo boolean che restituisce true se la quantità del prodotto è al di sotto di una soglia minima passata come argomento, false altrimenti;
• un metodo che rifornisce di una quantità q passata come argomento un prodotto se non supera la quantità massima del prodotto;
• un metodo di stampa delle informazioni dei prodotti;

Classe Magazzino: (CREARE UN FILE CSV CON BLOCCO NOTE E SALVARE NELLA CARTELLA)
1) metodo che legga da file di testo csv i dati dei prodotti e li memorizzi in un array.
2) metodo che cerca un prodotto in base al codice.
3) un metodo che restituisce un array di prodotti al di sotto di una certa quantità.
4) un metodo che salvi i dati presenti nell’array del punto 3 in un file di testo csv.

Svolgere una classe Main che consenta all’utente di esercitare le funzionalità elencate. Gestire e visualizzare messaggi di errore in caso di 
sollevamento di eccezioni.*/

package VerificaDel14_02_2025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProdotti = 10; // Massimo numero di prodotti nel magazzino
        Magazzino magazzino = new Magazzino(maxProdotti);
        
        // Carica i dati dal file CSV
        magazzino.caricaProdottiDaCSV("prodotti.csv");

        while (true) {
            System.out.println("1. Cerca prodotto per codice");
            System.out.println("2. Verifica prodotti sotto soglia");
            System.out.println("3. Rifornisci prodotto");
            System.out.println("4. Stampa informazioni prodotto");
            System.out.println("5. Salva prodotti sotto soglia in CSV");
            System.out.println("6. Esci");
            System.out.print("Scegli un'opzione: ");
            
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma la newline

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il codice del prodotto: ");
                    String codice = scanner.nextLine();
                    Prodotto prodotto = magazzino.cercaProdottoPerCodice(codice);
                    if (prodotto != null) {
                        prodotto.stampaInformazioni();
                    } else {
                        System.out.println("Prodotto non trovato.");
                    }
                    break;

                case 2:
                    System.out.print("Inserisci la soglia minima di quantità: ");
                    int sogliaMinima = scanner.nextInt();
                    Prodotto[] sottoSoglia = magazzino.prodottiSottoQuantita(sogliaMinima, maxProdotti);
                    boolean trovato = false;
                    for (int i = 0; i < maxProdotti; i++) {
                        if (sottoSoglia[i] != null) {
                            sottoSoglia[i].stampaInformazioni();
                            trovato = true;
                        }
                    }
                    if (!trovato) {
                        System.out.println("Nessun prodotto sotto la soglia.");
                    }
                    break;

                case 3:
                    System.out.print("Inserisci il codice del prodotto da rifornire: ");
                    codice = scanner.nextLine();
                    prodotto = magazzino.cercaProdottoPerCodice(codice);
                    if (prodotto != null) {
                        System.out.print("Inserisci la quantità da rifornire: ");
                        int quantità = scanner.nextInt();
                        if (prodotto.rifornisci(quantità)) {
                            System.out.println("Prodotto rifornito con successo.");
                        } else {
                            System.out.println("Non è possibile rifornire oltre la quantità massima.");
                        }
                    } else {
                        System.out.println("Prodotto non trovato.");
                    }
                    break;

                case 4:
                    System.out.print("Inserisci il codice del prodotto da visualizzare: ");
                    codice = scanner.nextLine();
                    prodotto = magazzino.cercaProdottoPerCodice(codice);
                    if (prodotto != null) {
                        prodotto.stampaInformazioni();
                    } else {
                        System.out.println("Prodotto non trovato.");
                    }
                    break;

                case 5:
                    System.out.print("Inserisci la soglia per salvare i prodotti sotto: ");
                    int sogliaSalvataggio = scanner.nextInt();
                    magazzino.salvaProdottiSottoQuantitaInCSV("prodotti_sotto_soglia.csv", sogliaSalvataggio, maxProdotti);
                    System.out.println("Prodotti sotto la soglia salvati.");
                    break;

                case 6:
                    System.out.println("Uscita dal programma.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opzione non valida.");
            }
        }
    }
}