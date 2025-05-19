/*
Consegna
La società di servizi di una città
lancia un progetto di smart-metering con il quale intende automatizzare la lettura dei contatori di gas, elettricità e acqua delle abitazioni private.
Per ogni contatore, indipendentemente dal tipo, sono noti il numero di matricola univoco, la data di installazione e la data/ora dell'ultima lettura 
effettuata; per tutte le tipologie di contatore deve essere possibile da parte del sistema di lettura automatizzato registrare una nuova lettura 
effettuata e acquisire il consumo da fatturare: per i contatori del gas e dell'acqua che hanno un ciclo di misurazione incrementale deve essere 
memorizzata la lettura precedente in modo da poter fornire la differenza, i contatori elettrici hanno invece un ciclo di misurazione che si azzera a 
ogni lettura per cui non è necessario, ma hanno una potenza massima istantanea che li caratterizza.
Progettare mediante un diagramma UML le classi che consentono di rappresentare lo scenario descritto e implementarle in linguaggio
Java prevedendo una classe dotata di un metodo main di test delle funzionalità. */

package SocietàServiziPag231_Es27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestoreContatori gestore = new GestoreContatori(5);
        Scanner scanner = new Scanner(System.in);
        String directoryPath = "C:\\Users\\Lorenzo\\OneDrive\\Desktop\\Documenti\\School\\EserciziJava\\src\\main\\java\\SocietàServiziPag231_Es27";

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi Contatore");
            System.out.println("2. Visualizza Contatori");
            System.out.println("3. Salva Contatori su CSV");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1:
                    // Aggiunta di un nuovo contatore
                    System.out.print("Inserisci il tipo di contatore (Acqua/Gas/Elettrico): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Inserisci la matricola: ");
                    String matricola = scanner.nextLine();
                    System.out.print("Inserisci la data di installazione (gg/mm/aaaa): ");
                    String dataInput = scanner.nextLine();
                    LocalDate dataInstallazione = LocalDate.parse(dataInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    Contatore contatore;
                    switch (tipo.toLowerCase()) {
                        case "acqua":
                            contatore = new ContatoreAcqua(matricola, dataInstallazione);
                            break;
                        case "gas":
                            contatore = new ContatoreGas(matricola, dataInstallazione);
                            break;
                        case "elettrico":
                            System.out.print("Inserisci la potenza massima: ");
                            int potenzaMassima = scanner.nextInt();
                            scanner.nextLine(); // Consuma il newline
                            contatore = new ContatoreElettrico(matricola, dataInstallazione, potenzaMassima);
                            break;
                        default:
                            System.out.println("Tipo di contatore non valido.");
                            continue;
                    }
                    gestore.aggiungiContatore(contatore);
                    System.out.println("Contatore aggiunto con successo.");
                    break;

                case 2:
                    // Chiedere il nome del file da visualizzare
                    System.out.print("Inserisci il nome del file (senza estensione) da visualizzare: ");
                    String fileNameToShow = scanner.nextLine();
                    String filePathToShow = directoryPath + "\\" + fileNameToShow + ".csv";
                    gestore.leggiContatoriDaCSV(filePathToShow);
                    break;

                case 3:
                    // Chiedere il nome del file
                    System.out.print("Inserisci il nome del file (senza estensione): ");
                    String fileName = scanner.nextLine();
                    String filePath = directoryPath + "\\" + fileName + ".csv";
                    gestore.salvaContatoriSuCSV(filePath);
                    break;

                case 4:
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