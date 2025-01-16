/*
   Definire un record in linguaggio ava per rappresentare una persona mediante i seguenti dati:
   • nome;
   • cognome;
   • data di nascita.
   Dotare il record di un metodo che consenta di determinare l'età in anni di una persona.
 */
package Persona;

/**
 *
 * @author Lorenzo
 */
import java.time.LocalDate;
import java.time.Period;

class Persona {
    private String nome;
    private String cognome;
    LocalDate dataDiNascita;

    // Costruttore
    public Persona(String nome, String cognome, LocalDate dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    // Metodo per calcolare l'età
    public int calcolaEta() {
        return Period.between(dataDiNascita, LocalDate.now()).getYears();
    }

    // Metodo per stampare le informazioni della persona
    public void stampaInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Data di nascita: " + dataDiNascita);
        System.out.println("Eta': " + calcolaEta() + " anni");
    }

}
