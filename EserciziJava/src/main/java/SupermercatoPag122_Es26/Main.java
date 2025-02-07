package SupermercatoPag120_Es26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermercato supermercato = new Supermercato(10); // Capacità massima 10 prodotti
        int scelta;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Aggiungi prodotto");
            System.out.println("2. Rifornimento prodotto");
            System.out.println("3. Vendita prodotto");
            System.out.println("4. Trasferimento prodotto");
            System.out.println("5. Elenco scorte inferiori");
            System.out.println("6. Mostra magazzino");
            System.out.println("7. Mostra tutti i prodotti");
            System.out.println("8. Salva prodotti in CSV");
            System.out.println("9. Leggi prodotti da CSV"); // Nuova opzione
            System.out.println("10. Esci");
            System.out.print("Seleziona un'opzione: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci codice prodotto: ");
                    String codice = scanner.nextLine();
                    System.out.print("Inserisci descrizione prodotto: ");
                    String descrizione = scanner.nextLine();
                    System.out.print("Inserisci prezzo prodotto: ");
                    double prezzo = scanner.nextDouble();
                    System.out.print("Inserisci quantità in negozio: ");
                    int quantitaNegozio = scanner.nextInt();
                    System.out.print("Inserisci quantità in magazzino: ");
                    int quantitaMagazzino = scanner.nextInt();
                    supermercato.aggiungiProdotto(new Prodotto(codice, descrizione, prezzo, quantitaNegozio, quantitaMagazzino));
                    break;

                case 2:
                    System.out.print("Inserisci codice prodotto per rifornimento: ");
                    String codiceRifornimento = scanner.nextLine();
                    System.out.print("Inserisci quantità da rifornire: ");
                    int quantitaRifornimento = scanner.nextInt();
                    supermercato.rifornimento(codiceRifornimento, quantitaRifornimento);
                    break;

                case 3:
                    System.out.print("Inserisci codice prodotto per vendita: ");
                    String codiceVendita = scanner.nextLine();
                    System.out.print("Inserisci quantità da vendere: ");
                    int quantitaVendita = scanner.nextInt();
                    supermercato.vendita(codiceVendita, quantitaVendita);
                    break;

                case 4:
                    System.out.print("Inserisci codice prodotto per trasferimento: ");
                    String codiceTrasferimento = scanner.nextLine();
                    System.out.print("Inserisci quantità da trasferire: ");
                    int quantitaTrasferimento = scanner.nextInt();
                    supermercato.trasferimento(codiceTrasferimento, quantitaTrasferimento);
                    break;

                case 5:
                    System.out.print("Inserisci soglia per scorte inferiori: ");
                    int soglia = scanner.nextInt();
                    supermercato.elencoScorteInferiori(soglia);
                    break;

                case 6:
                    System.out.print("Inserisci codice prodotto da mostrare: ");
                    String codiceMostra = scanner.nextLine();
                    supermercato.mostraMagazzino(codiceMostra);
                    break;

                case 7:
                    supermercato.mostraTuttiProdotti();
                    break;

                case 8:
                    System.out.print("Inserisci il nome del file CSV da creare (es. prodotti.csv): ");
                    String nomeFileSalvataggio = scanner.nextLine();
                    supermercato.salvaInCSV(nomeFileSalvataggio);
                    break;

                case 9:
                    System.out.print("Inserisci il nome del file CSV da leggere (es. prodotti.csv): ");
                    String nomeFileLettura = scanner.nextLine();
                    supermercato.leggiDaCSV(nomeFileLettura); // Nuovo metodo per leggere i prodotti
                    supermercato.mostraTuttiProdotti(); // Mostra i prodotti letti
                    break;

                case 10:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        } while (scelta != 10);

        scanner.close();
    }
}