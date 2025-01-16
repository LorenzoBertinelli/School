package Giocatore;

public class Giocatore {

    private String nome;
    private boolean capitano;
    private int goal;
    private int GoalNazionale;

    // Costruttore non parametrizzato di default
    public Giocatore() {
        this.nome = "";
        this.capitano = false;
        this.goal = 0;
        this.GoalNazionale = 0;
    }

    // Costruttore parametrizzato
    public Giocatore(String nome, boolean capitano, int goal, int goalNazionale) {
        this.nome = nome;
        this.capitano = capitano;
        this.goal = goal;
        this.GoalNazionale = goalNazionale;
    }

    // Costruttore di copia
    public Giocatore(Giocatore altroGiocatore) {
        this.nome = altroGiocatore.nome;
        this.capitano = altroGiocatore.capitano;
        this.goal = altroGiocatore.goal;
        this.GoalNazionale = altroGiocatore.GoalNazionale;
    }

    // Getter e Setter per `nome`
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter per `capitano`
    public boolean isCapitano() {  // convenzione per boolean
        return capitano;
    }

    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }

    // Getter e Setter per `goal`
    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    // Getter e Setter per `GoalNazionale`
    public int getGoalNazionale() {
        return GoalNazionale;
    }

    public void setGoalNazionale(int goalNazionale) {
        this.GoalNazionale = goalNazionale;
    }

    // Metodo per calcolare i goal totali
    public int GoalTotali() {
        return this.goal + this.GoalNazionale;
    }

    // Metodo toString
    public String toString() {
        return "Giocatore [nome= " + nome + ", capitano= " + capitano + ", Goal= " + goal + ", Goal nazionale= " + GoalNazionale + "]";
    }
}
