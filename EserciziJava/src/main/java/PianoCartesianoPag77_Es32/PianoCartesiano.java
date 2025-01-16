/*
 Un vettore nel piano cartesiano è un segmento orientato definito dalle coordinate dei due estremi («origine» e «vertice») e dal loro
ordinamento: due vettori con estremi coincidenti diversamente orientati sono sovrapposti, ma diversi!
Implementare in linguaggio Java la classe della figura, definita mediante un diagramma UML e relativa a un vettore nel piano cartesiano.
Inserire nella classe un metodo main che consenta di verificarne tutte le funzionalità.

-x0 : double

-y0 : double

-x1 : double

-y1 : double

+ Vettore()


+Vettore(X0: double, YO: double,

X1 : double, Y1 : double)
+ Vettore(Vettore v)

+setX0(X: double)

+setY0(Y : double)

+setX1(X: double)

+setY1(Y : double)

+getX0() : double

+getY0(): double

+getx1(): double

+getY1(: double

+equals(Vettore v) : bool

+length() : double

+toString() : string
 */
package PianoCartesianoPag77_Es32;

/**
 *
 * @author Lorenzo
 */
public class PianoCartesiano {
    private double x0; // Coordinata x dell'origine
    private double y0; // Coordinata y dell'origine
    private double x1; // Coordinata x del vertice
    private double y1; // Coordinata y del vertice

    // Costruttore predefinito
    public PianoCartesiano() {
        this.x0 = 0.0;
        this.y0 = 0.0;
        this.x1 = 0.0;
        this.y1 = 0.0;
    }

    // Costruttore con parametri
    public PianoCartesiano(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    // Costruttore di copia
    public PianoCartesiano(PianoCartesiano v) {
        this.x0 = v.x0;
        this.y0 = v.y0;
        this.x1 = v.x1;
        this.y1 = v.y1;
    }

    // Getter e Setter per x0
    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    // Getter e Setter per y0
    public double getY0() {
        return y0;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }

    // Getter e Setter per x1
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    // Getter e Setter per y1
    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    // Metodo equals per confrontare due vettori
    public boolean equals(PianoCartesiano v) {
        return this.x0 == v.x0 && this.y0 == v.y0 && this.x1 == v.x1 && this.y1 == v.y1;
    }

    // Metodo per calcolare la lunghezza del vettore
    public double length() {
        return Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
    }

    // Metodo toString per la rappresentazione del vettore
    @Override
    public String toString() {
        return "Vettore[Origine=(" + x0 + ", " + y0 + "), Vertice=(" + x1 + ", " + y1 + ")]";
    }
}

