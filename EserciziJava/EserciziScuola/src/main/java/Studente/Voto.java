package Studente;

public class Voto {
    // Variabili di istanza della classe Voto
    private String materia;
    private float voto;

    // Costruttore per inizializzare le variabili
    public Voto(String materia, float voto) {
        this.materia = materia;
        this.voto = voto;
    }

    // Getter per la materia
    public String getMateria() {
        return materia;
    }

    // Getter per il voto
    public float getVoto() {
        return voto;
    }
}