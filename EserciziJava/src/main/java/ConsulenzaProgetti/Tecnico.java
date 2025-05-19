package ConsulenzaProgetti;

public abstract class Tecnico extends Persona {
    protected boolean interno;

    public Tecnico(int codice, String nome, String cognome, int annoInizio, boolean interno) {
        super(codice, nome, cognome, annoInizio);
        this.interno = interno;
    }
    
    public boolean isInterno() {
        return interno;
    }
}