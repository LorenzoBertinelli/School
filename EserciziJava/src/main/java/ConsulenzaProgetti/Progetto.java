package ConsulenzaProgetti;

public class Progetto {
    private static final int MAXMEMBRI = 5;
    private Persona[] membri;
    private int indice; //dimensione effettiva array di oggetti

    public Progetto() {
        membri = new Persona[MAXMEMBRI]; //istanzio array di ogetti di tipo persona
        indice = 0;
    }
    //definisco un'eccezione personalizzata NumeroMassimoMembriExeption
    public void aggiungiMembro(Persona p)throws NumeroMassimoMembriExeption{
        if(indice<membri.length){
            membri[indice] = p;
            indice++;
        }
        else{
            throw new NumeroMassimoMembriExeption("Numero massimo di memnri raggiunta: "+ MAXMEMBRI);
        }
    }
    
    public double calcolaCostoTotale(){
        double costoTotale = 0.0;
        for(int i=0; i<indice;
                i++){
            costoTotale=costoTotale+membri[i].getCostoC();
        }
        return costoTotale;
    }
}