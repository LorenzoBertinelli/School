/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package GestioneFrazioni;

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
        GestioneFrazioni frazione1 = new GestioneFrazioni(1, 2);
        GestioneFrazioni frazione2 = new GestioneFrazioni(3, 4);

        // Somma
        GestioneFrazioni somma = frazione1.somma(frazione2);
        System.out.print("Somma: ");
        somma.stampa();

        // Differenza
        GestioneFrazioni differenza = frazione1.differenza(frazione2);
        System.out.print("Differenza: ");
        differenza.stampa();

        // Prodotto
        GestioneFrazioni prodotto = frazione1.prodotto(frazione2);
        System.out.print("Prodotto: ");
        prodotto.stampa();

        // Quoziente
        GestioneFrazioni quoziente = frazione1.quoziente(frazione2);
        System.out.print("Quoziente: ");
        quoziente.stampa();

        // Potenza
        GestioneFrazioni potenza = frazione1.potenza(2);
        System.out.print("Potenza (frazione1 ^ 2): ");
        potenza.stampa();

        // Reciproco
        GestioneFrazioni reciproco = frazione1.reciproco();
        System.out.print("Reciproco di frazione1: ");
        reciproco.stampa();
    }
}
