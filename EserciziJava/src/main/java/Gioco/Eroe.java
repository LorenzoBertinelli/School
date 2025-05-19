package Gioco;

// Classe che rappresenta un Eroe, un tipo di Umano
public class Eroe implements Umano {
    private int forza = 10;

    @Override
    public void combatti() {
        forza -= 3; // La forza diminuisce di 3 ogni volta che combatte
    }

    @Override
    public String getForza() {
        return "Forza Eroe: " + forza; // Restituisce la forza attuale dell'Eroe
    }
}