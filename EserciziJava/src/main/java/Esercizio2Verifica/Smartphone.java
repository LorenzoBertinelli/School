package Esercizio2Verifica;


public class Smartphone implements Dispositivi {
    private String marca;
    private double costo;

    public Smartphone(String marca, double costo) {
        this.marca = marca;
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public boolean uguale(Object X) {
        if (X instanceof Smartphone) {
            Smartphone altroSmartphone = (Smartphone) X;
            return this.marca.equals(altroSmartphone.getMarca());
        }
        return false;
    }
}
