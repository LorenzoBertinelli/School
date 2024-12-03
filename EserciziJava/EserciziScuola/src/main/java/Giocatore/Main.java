package Giocatore;

public class Main {

    public static void main(String args[]) {
        // Oggetto creato con costruttore non parametrizzato
        Giocatore DelPiero = new Giocatore();
        DelPiero.setNome("Alessandro Del Piero");
        DelPiero.setCapitano(true);
        DelPiero.setGoal(290);
        DelPiero.setGoalNazionale(27);

        // Oggetto di prova
        Giocatore prova = new Giocatore();
        System.out.println("Nome di prova: " + prova.getNome());
        System.out.println("Capitano di prova: " + prova.isCapitano());
        System.out.println("Goal di prova: " + prova.getGoal());
        System.out.println("Goal Nazionale di prova: " + prova.getGoalNazionale());

        // Oggetto copia
        Giocatore giocatore = new Giocatore(prova);

        // Stampa degli oggetti
        System.out.println(DelPiero.toString());
        System.out.println(prova.toString());
        System.out.println(giocatore.toString());

        // Calcola goal totali
        System.out.println("Goal totali di Del Piero: " + DelPiero.GoalTotali());
    }
}

