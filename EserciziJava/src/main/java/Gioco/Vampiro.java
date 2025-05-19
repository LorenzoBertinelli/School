package Gioco;

// Classe che rappresenta un Vampiro, un tipo di Mostro
public class Vampiro implements Mostro {
    private int forza = 15;

    @Override
    public void azzanna() {
        forza -= 2; // La forza diminuisce di 2 ogni volta che azzanna
    }

    @Override
    public String getForza() {
        return "Forza Vampiro: " + forza; // Restituisce la forza attuale del Vampiro
    }
}