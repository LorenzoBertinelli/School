/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PianoCartesianoPag77_Es32;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args) {
        // Creazione di un vettore con il costruttore predefinito
        PianoCartesiano vettore1 = new PianoCartesiano();
        System.out.println("Vettore 1 (costruttore predefinito): " + vettore1);
        
        // Creazione di un vettore con il costruttore parametrico
        PianoCartesiano vettore2 = new PianoCartesiano(1.0, 2.0, 3.0, 4.0);
        System.out.println("Vettore 2 (costruttore parametrico): " + vettore2);
        
        // Creazione di un vettore con il costruttore di copia
        PianoCartesiano vettore3 = new PianoCartesiano(vettore2);
        System.out.println("Vettore 3 (costruttore di copia): " + vettore3);
        
        // Modifica delle coordinate del vettore 1
        vettore1.setX0(5.0);
        vettore1.setY0(6.0);
        vettore1.setX1(7.0);
        vettore1.setY1(8.0);
        System.out.println("Vettore 1 dopo la modifica: " + vettore1);
        
        // Verifica dell'uguaglianza tra vettore2 e vettore3
        boolean sonoUguali = vettore2.equals(vettore3);
        System.out.println("Vettore 2 e Vettore 3 sono uguali? " + (sonoUguali ? "Si" : "No"));
        
        // Calcolo della lunghezza del vettore 2
        double lunghezzaVettore2 = vettore2.length();
        System.out.println("Lunghezza del Vettore 2: " + lunghezzaVettore2);
        
        // Rappresentazione stringa del vettore 2
        System.out.println("Rappresentazione di Vettore 2: " + vettore2.toString());
    }
}

