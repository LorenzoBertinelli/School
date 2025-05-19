/*
Creare un’applicazione che permetta di gestire una società di servizi che intende automatizzare la lettura dei contatori di acqua, luce, gas. 

Ogni contatore, indipendentemente dal tipo, ha un numero di matricola, data, ora dell’ultima lettura, consumo. 

I contatori dell’acqua e del gas devono memorizzare anche il consumo della lettura precedente in modo da fornire la differenza. 

I contatori della luce hanno anche la potenza che li caratterizza. 

Svolgere i metodi: 

-calcolo del consumo sapendo che: 

spesa €/kwh =0,069 (luce) 

spesa €/smc= 0,830 (gas) 

spesa €/m3=0,023911 (acqua). 

-aggiornare i consumi passato come parametro la lettura attuale (esempio i Kwh...) 

 

Realizzare la gerarchia di classi descritta utilizzando correttamente le eccezioni e una classe di gestione dei contatori in cui: 

1)creare una classe gestione di contatori letti da tastiera o da file di testo (csv); 2 punti 

2) calcolare e stampare l'importo totale dei consumi dei contatori. 2 punti 

3) Salvare in un file di testo i dati aggiornati (data e importo calcolato). 2 punti  

Valutare la possibilità di classi astratte. 
*/package Esercizio1Verifica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestioneContatori gestione = new GestioneContatori(10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci tipo di contatore (acqua/gas/luce): ");
            String tipo = scanner.nextLine().toLowerCase();

            System.out.print("Inserisci il numero di matricola: ");
            String matricola = scanner.nextLine();

            System.out.print("Inserisci la data (YYYY-MM-DD): ");
            String data = scanner.nextLine();

            System.out.print("Inserisci l'ora (HH:MM): ");
            String ora = scanner.nextLine();

            System.out.print("Inserisci il consumo attuale: ");
            double consumoAttuale = Double.parseDouble(scanner.nextLine());

            Contatore contatore = null;
            if (tipo.equals("acqua")) {
                System.out.print("Inserisci il consumo precedente: ");
                double consumoPrecedente = Double.parseDouble(scanner.nextLine());
                contatore = new ContatoreAcqua(matricola, data, ora, consumoAttuale, consumoPrecedente);
            } else if (tipo.equals("gas")) {
                System.out.print("Inserisci il consumo precedente: ");
                double consumoPrecedente = Double.parseDouble(scanner.nextLine());
                contatore = new ContatoreGas(matricola, data, ora, consumoAttuale, consumoPrecedente);
            } else if (tipo.equals("luce")) {
                contatore = new ContatoreLuce(matricola, data, ora, consumoAttuale);
            } else {
                System.out.println("Tipo di contatore non valido.");
                i--; // Decrementa l'indice per ripetere l'inserimento
                continue;
            }

            gestione.aggiungiContatore(contatore);
        }

        double importoTotale = gestione.calcolaImportoTotale();
        System.out.printf("Importo totale dei consumi: €%.2f%n", importoTotale);

        gestione.salvaDati("dati_contatori.txt");
        scanner.close();
    }
}