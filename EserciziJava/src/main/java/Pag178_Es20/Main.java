/*CODING
Scrivere un metodo Java denominato erase per un'ipotetica classe Lista che ricerchi e 
rimuova tutte le occorrenze nella lista dei nodi contenenti l'informazione fornita come parame-tro.
Il metodo deve restituire il numero dei nodi rimossi.*/

package Pag178_Es20;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);

        // Ciclo per inserire nodi
        while (true) {
            System.out.println("Inserisci l'informazione del nodo (o 'exit' per terminare):");
            String informazione = scanner.nextLine();
            if (informazione.equalsIgnoreCase("exit")) {
                break;
            }
            lista.inserisci(informazione);
        }

        System.out.println("Lista originale:");
        lista.visualizza();

        System.out.println("Inserisci l'informazione da rimuovere:");
        String daRimuovere = scanner.nextLine();
        int rimossi = lista.erase(daRimuovere);
        System.out.println("Nodi rimossi: " + rimossi);

        System.out.println("Lista dopo la rimozione:");
        lista.visualizza();

        scanner.close();
    }
}