package Geometria;

public class Punto {
    // Campi privati
    private double x;
    private double y;
    private double z; // Nuovo campo per il terzo asse

    // Costruttore che accetta tre valori double
    public Punto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Costruttore che accetta un altro oggetto Punto
    public Punto(Punto p) {
        this.x = p.x;
        this.y = p.y;
        this.z = p.z;
    }

    // Metodo per impostare il valore di x
    public void setX(double x) {
        this.x = x;
    }

    // Metodo per impostare il valore di y
    public void setY(double y) {
        this.y = y;
    }

    // Metodo per impostare il valore di z
    public void setZ(double z) {
        this.z = z;
    }

    // Metodo per ottenere il valore di x
    public double getX() {
        return this.x;
    }

    // Metodo per ottenere il valore di y
    public double getY() {
        return this.y;
    }

    // Metodo per ottenere il valore di z
    public double getZ() {
        return this.z;
    }

    // Metodo per calcolare la distanza tra due punti
    public double distanza(Punto p) {
        double deltaX = this.x - p.x;
        double deltaY = this.y - p.y;
        double deltaZ = this.z - p.z;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
    }

    // Metodo equals per confrontare due punti
    public boolean equals(Punto p) {
        return this.x == p.x && this.y == p.y && this.z == p.z;
    }

    // Metodo toString per rappresentare il punto come stringa
    @Override
    public String toString() {
        return "Punto(" + "x=" + x + ", y=" + y + ", z=" + z + ")";
    }

    // Metodo main
    public static void main(String[] args) {
        // Creazione di due punti
        Punto p1 = new Punto(3, 4, 5);
        Punto p2 = new Punto(6, 8, 10);
        
        // Stampa dei punti
        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);
        
        // Calcolo della distanza
        double distanza = p1.distanza(p2);
        System.out.println("Distanza tra Punto 1 e Punto 2: " + distanza);
        
        // Verifica dell'uguaglianza
        boolean sonoUguali = p1.equals(p2);
        System.out.println("Punto 1 e Punto 2 sono uguali? " + sonoUguali);
        
        // Modifica del punto 2
        p2.setX(3);
        p2.setY(4);
        p2.setZ(5);
        System.out.println("Punto 2 modificato: " + p2);
        
        // Verifica dell'uguaglianza dopo la modifica
        sonoUguali = p1.equals(p2);
        System.out.println("Punto 1 e Punto 2 sono uguali dopo la modifica? " + sonoUguali);
    }
}