/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Libro;

/**
 *
 * @author Lorenzo
 */
class Libro {
    private String titolo;
    private String autore;
    private int numeroPagine;
    private final double costoPerPagina = 0.05;

    // Costruttore
    public Libro(String titolo, String autore, int numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    // Metodo per calcolare il costo
    public double calcolaCosto() {
        return numeroPagine * costoPerPagina;
    }

    // Metodo per stampare le informazioni del libro
    public void stampaInfo() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("Numero di pagine: " + numeroPagine);
        System.out.println("Costo: " + calcolaCosto() + " euro");
    }


}