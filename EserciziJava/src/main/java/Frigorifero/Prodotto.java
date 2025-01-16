package Frigorifero;

public class Prodotto {
    private int codice;
    private String descrizione;
    private int giorno, mese, anno;
    private int calorie;
    
    public Prodotto(int codice, String descrizione, int giorno, int mese, int anno, int calorie) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.setGiorno(giorno);
        this.setMese(mese);
        this.setAnno(anno);
        this.calorie = calorie;
    }

    public int getCodice() { 
        return codice; 
    }

    public void setCodice(int codice) { 
        this.codice = codice; 
    }

    public String getDescrizione() { 
        return descrizione; 
    } 

    public void setDescrizione(String descrizione) { 
        this.descrizione = descrizione; 
    } 

    public int getGiorno() { 
        return giorno; 
    } 

    public void setGiorno(int giorno) { 
        if (giorno >= 1 && giorno <= 31) { 
            this.giorno = giorno; 
        } else { 
            throw new IllegalArgumentException("Giorno non valido: deve essere compreso tra 1 e 31."); 
        } 
    } 

    public int getMese() { 
        return mese; 
    } 

    public void setMese(int mese) { 
        if (mese >= 1 && mese <= 12) { 
            this.mese = mese;
        } else { 
            throw new IllegalArgumentException("Mese non valido: deve essere compreso tra 1 e 12."); 
        } 
    } 

    public int getAnno() { 
        return anno; 
    }

    public void setAnno(int anno) { 
        if (anno >= 2024) {
            this.anno = anno;
        } else { 
            throw new IllegalArgumentException("Anno non valido: deve essere maggiore o uguale al 2024.");
        } 
    }

    public int getCalorie() { 
        return calorie; 
    } 

    public void setCalorie(int calorie) { 
        this.calorie = calorie; 
    }

    // Metodo per stabilire se un prodotto è scaduto
    public boolean Scaduto(int giornoCorrente, int meseCorrente, int annoCorrente) { 
        return (anno < annoCorrente || (anno == annoCorrente && mese < meseCorrente) 
                || (anno == annoCorrente && mese == meseCorrente && giorno < giornoCorrente));
    }
}