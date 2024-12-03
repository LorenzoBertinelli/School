package PortoTuristicoPag120_es24;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Classe principale che gestisce l'interfaccia utente
public class Main {
    public static void main(String[] args) {
        PostiBarche porto = new PostiBarche(); // Crea un'istanza della classe PostiBarche
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Per leggere input da console

        while (true) {
            // Stampa il menu delle opzioni
            System.out.println("1. Assegna posto");
            System.out.println("2. Libera posto");
            System.out.println("3. Ricerca barca");
            System.out.println("4. Salva stato");
            System.out.println("5. Nomi barche per nazionalità");
            System.out.println("6. Esci");
            System.out.print("Scegli un'opzione: ");

            try {
                int scelta = Integer.parseInt(reader.readLine()); // Legge l'opzione scelta

                switch (scelta) {
                    case 1: // Assegna posto
                        System.out.print("Nome barca: ");
                        String nome = reader.readLine();
                        System.out.print("Nazionalità: ");
                        String nazionalita = reader.readLine();
                        System.out.print("Lunghezza: ");
                        double lunghezza = Double.parseDouble(reader.readLine());
                        System.out.print("Stazza: ");
                        double stazza = Double.parseDouble(reader.readLine());
                        System.out.print("Tipologia (vela/motore): ");
                        String tipologia = reader.readLine();
                        Barca barca = new Barca(nome, nazionalita, lunghezza, stazza, tipologia);
                        porto.assegnaPosto(barca); // Assegna la barca al porto
                        break;

                    case 2: // Libera posto
                        System.out.print("Numero posto: ");
                        int numeroPosto = Integer.parseInt(reader.readLine());
                        System.out.print("Giorni di sosta: ");
                        int giorni = Integer.parseInt(reader.readLine());
                        double costo = porto.liberaPosto(numeroPosto, giorni); // Libera il posto e calcola il costo
                        System.out.println("Costo totale: " + costo + " €");
                        break;

                    case 3: // Ricerca barca
                        System.out.print("Numero posto: ");
                        int postoRicerca = Integer.parseInt(reader.readLine());
                        Barca barcaTrovata = porto.ricercaBarca(postoRicerca); // Cerca la barca nel posto specificato
                        System.out.println("Barca nel posto " + postoRicerca + ": " + barcaTrovata.nome);
                        break;

                    case 4: // Salva stato
                        System.out.print("Nome file per salvare lo stato: ");
                        String filename = reader.readLine();
                        porto.salvaStato(filename); // Salva lo stato del porto nel file
                        System.out.println("Stato salvato.");
                        break;

                    case 5: // Nomi barche per nazionalità
                        System.out.print("Nazionalità da cercare: ");
                        String nazionalitaCercata = reader.readLine();
                        String[] nomi = porto.nomiBarcheNazionalita(nazionalitaCercata); // Ottiene i nomi delle barche
                        System.out.println("Barche di nazionalità " + nazionalitaCercata + ": " + String.join(", ", nomi));
                        break;

                    case 6: // Esci
                        System.out.println("Uscita dal programma.");
                        return;

                    default:
                        System.out.println("Scelta non valida."); // Messaggio di errore per scelta non valida
                }
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage()); // Gestione delle eccezioni
            }
        }
    }
}