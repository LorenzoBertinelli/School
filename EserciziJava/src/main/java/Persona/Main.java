/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Persona;

import java.time.LocalDate;

/**
 *
 * @author Lorenzo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    // Metodo main per testare la classe
    public static void main(String[] args) {
        // Creazione di due persone
        Persona persona1 = new Persona("Mario", "Rossi", LocalDate.of(1990, 5, 15));
        Persona persona2 = new Persona("Luisa", "Bianchi", LocalDate.of(1985, 10, 3));

        // Stampa delle informazioni di ogni persona
        persona1.stampaInfo();
        System.out.println(); // Riga vuota per separare i due output
        persona2.stampaInfo();
        System.out.println(); // Riga vuota per separare i due output

        // Controllo se le due persone sono nate lo stesso giorno
        if (persona1.dataDiNascita.equals(persona2.dataDiNascita)) {
            System.out.println("Le due persone sono nate nello stesso giorno.");
        } else {
            System.out.println("Le due persone non sono nate nello stesso giorno.");
        }
    }
}
