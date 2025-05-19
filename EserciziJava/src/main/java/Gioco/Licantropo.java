package Gioco;

// Classe che rappresenta un Licantropo, che può essere sia Umano che Mostro
public class Licantropo implements Umano, Mostro {
    private int forzaUmano = 10;
    private int forzaMostro = 15;
    private boolean isUomo = true; // Inizialmente è umano

    public void cambiaForma(boolean lunaPiena) {
        isUomo = !lunaPiena; // Cambia forma in base al valore di lunaPiena
    }

    @Override
    public void combatti() {
        if (isUomo) {
            forzaUmano -= 3; // Diminuisce di 3 se è umano
        } else {
            forzaMostro -= 2; // Diminuisce di 2 se è mostro
        }
    }

    @Override
    public void azzanna() {
        if (!isUomo) {
            forzaMostro -= 2; // Diminuisce di 2 se è mostro
        }
    }

    @Override
    public String getForza() {
        if (isUomo) {
            return "Forza Licantropo Umano: " + forzaUmano; // Restituisce la forza da Umano
        } else {
            return "Forza Licantropo Mostro: " + forzaMostro; // Restituisce la forza da Mostro
        }
    }
}