/*
Definire una classe in linguaggio Java per la gestione di dati di tipo angolo nella forma G°P' S" 
(G rappresenta i gradi, Pi primi ed S i secondi con 0 ≤ G < 360, 0 ≤ P< 60, 0 ≤ 5 < 60). 
Oltre a un costruttore adeguato e ai metodi di accesso agli attributi, la classe deve prevedere metodi per effettuare le seguenti 
operazioni:
   • restituzione del valore dell'angolo in gradi decimali;
   • somma tra due angoli;
   • differenza tra due angoli.
 */
package Geometria;

public class Angolo {
    private int gradi;
    private int primi;
    private int secondi;

    // Costruttore
    public Angolo(int gradi, int primi, int secondi) {
        if (gradi < 0 || gradi >= 360) {
            throw new IllegalArgumentException("I gradi devono essere tra 0 e 359");
        }
        if (primi < 0 || primi >= 60) {
            throw new IllegalArgumentException("I primi devono essere tra 0 e 59");
        }
        if (secondi < 0 || secondi >= 60) {
            throw new IllegalArgumentException("I secondi devono essere tra 0 e 59");
        }
        this.gradi = gradi;
        this.primi = primi;
        this.secondi = secondi;
    }

    // Metodi di accesso agli attributi
    public int getGradi() {
        return gradi;
    }

    public int getPrimi() {
        return primi;
    }

    public int getSecondi() {
        return secondi;
    }

    // Metodo per restituire il valore dell'angolo in gradi decimali
    public double toGradiDecimali() {
        return gradi + primi / 60.0 + secondi / 3600.0;
    }

    // Metodo per sommare due angoli
    public Angolo somma(Angolo altro) {
        int totSecondi = this.secondi + altro.secondi;
        int totPrimi = this.primi + altro.primi + totSecondi / 60;
        int totGradi = this.gradi + altro.gradi + totPrimi / 60;

        totSecondi %= 60;
        totPrimi %= 60;
        totGradi %= 360;

        return new Angolo(totGradi, totPrimi, totSecondi);
    }

    // Metodo per calcolare la differenza tra due angoli
    public Angolo differenza(Angolo altro) {
        int totSecondi = this.secondi - altro.secondi;
        int totPrimi = this.primi - altro.primi;
        int totGradi = this.gradi - altro.gradi;

        if (totSecondi < 0) {
            totSecondi += 60;
            totPrimi--;
        }
        if (totPrimi < 0) {
            totPrimi += 60;
            totGradi--;
        }
        if (totGradi < 0) {
            totGradi += 360;
        }

        return new Angolo(totGradi, totPrimi, totSecondi);
    }

    // Metodo per stampare le informazioni dell'angolo
    public void stampaInfo() {
        System.out.println(gradi + "° " + primi + "' " + secondi + "\"");
    }

    // Metodo principale per testare la classe
    public static void main(String[] args) {
        // Creazione di due angoli
        Angolo angolo1 = new Angolo(45, 30, 15);
        Angolo angolo2 = new Angolo(30, 45, 50);

        // Calcolo e stampa dei valori in gradi decimali
        System.out.println("Angolo 1 in gradi decimali: " + angolo1.toGradiDecimali());
        System.out.println("Angolo 2 in gradi decimali: " + angolo2.toGradiDecimali());

        // Somma degli angoli
        Angolo somma = angolo1.somma(angolo2);
        System.out.print("Somma degli angoli: ");
        somma.stampaInfo();

        // Differenza degli angoli
        Angolo differenza = angolo1.differenza(angolo2);
        System.out.print("Differenza degli angoli: ");
        differenza.stampaInfo();
    }
}