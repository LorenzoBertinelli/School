package ConsulenzaProgetti;

public class Senior extends Funzionario{
    private static final double COSTO_ORARIO = 85.0;
    private int oreLavorate;

    public Senior(int oreLavorate, int codice, String nome, String cognome, int annoInizio) {
        super(codice, nome, cognome, annoInizio);
        this.oreLavorate = oreLavorate;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }
    
    //override del metodo astratto
    public double getCostoC(){
        return oreLavorate*COSTO_ORARIO;
    }
}
