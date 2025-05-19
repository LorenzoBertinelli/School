/*Dopo aver definito un record Persona che rappresenta una persona mediante gli attributi cognome, nome ed età implementare una classe
Lista il cui costruttore a partire dal nome di un file in formato CSV come il seguente
Mario, Rossi, 32
Maria, Verdi, 21
Luca, Bianchi, 42
costruisca la lista nell'ordine in cui i dati delle persone sono letti dal file.*/
package Pag178_Es22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();

        while (true) {
            System.out.println("Inserisci il nome della persona (o 'exit' per terminare):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Inserisci il cognome della persona:");
            String cognome = scanner.nextLine();

            System.out.println("Inserisci l'età della persona:");
            int eta = Integer.parseInt(scanner.nextLine());

            // Aggiungi la persona alla lista
            lista.aggiungiPersona(new Persona(nome, cognome, eta));
        }

        System.out.println("Persone inserite nella lista:");
        lista.visualizzaPersone();

        scanner.close();
    }
}