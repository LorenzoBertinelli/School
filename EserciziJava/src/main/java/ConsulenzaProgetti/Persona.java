package ConsulenzaProgetti;

public abstract class Persona {
    protected static final int ANNOATTUALE = 2025;
    protected int codice;
    protected String nome;
    protected String cognome;
    protected int annoInizio;
    
    public Persona(int codice, String nome, String cognome, int annoInizio){
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.annoInizio = annoInizio;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getAnnoInizio() {
        return annoInizio;
    }
    
    public abstract double getCostoC(); //solo firma, no implementazione perchè è astratto
}