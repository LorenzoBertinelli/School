package ConsulenzaProgetti;

public class EleAut extends Tecnico {
    private static final double COSTO_ORARIO = 60.0;
    private int oreLavorate;

    public EleAut(int oreLavorate, int codice, String nome, String cognome, int annoInizio, boolean interno) {
        super(codice, nome, cognome, annoInizio, interno);
        this.oreLavorate = oreLavorate;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double getCostoC() {
        double costo = oreLavorate*COSTO_ORARIO;
        if(interno){
            costo = costo + oreLavorate*(ANNOATTUALE - annoInizio);
        }
        return costo;
    }    
}