package Geometria;

public class Triangolo {

    private Punto a; // Vertice A
    private Punto b; // Vertice B
    private Punto c; // Vertice C

    // Costruttore parametrizzato che accetta tre oggetti Punto
    public Triangolo(Punto a, Punto b, Punto c) {
        setA(a);
        setB(b);
        setC(c);
    }

    // Costruttore di copia
    public Triangolo(Triangolo t) {
        setA(t.getA());
        setB(t.getB());
        setC(t.getC());
    }

    // Metodi setter per i vertici
    public void setA(Punto a) {
        this.a = new Punto(a); // Crea una nuova istanza di Punto
    }

    public void setB(Punto b) {
        this.b = new Punto(b);
    }

    public void setC(Punto c) {
        this.c = new Punto(c);
    }

    // Metodi getter per i vertici
    public Punto getA() {
        return new Punto(a); // Restituisce una copia del punto
    }

    public Punto getB() {
        return new Punto(b);
    }

    public Punto getC() {
        return new Punto(c);
    }

    // Metodo per calcolare il perimetro del triangolo
    public double perimetro() {
        return a.distanza(b) + b.distanza(c) + c.distanza(a);
    }

    // Metodo per calcolare l'area del triangolo usando la formula di Erone
    public double area() {
        double p = perimetro() / 2; // Semiperimetro
        double ab = a.distanza(b);
        double bc = b.distanza(c);
        double ca = c.distanza(a);

        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca)); // Formula di Erone
    }

    // Metodo toString per rappresentare il triangolo come stringa
    @Override
    public String toString() {
        return "Triangolo: A" + a.toString() + ", B" + b.toString() + ", C" + c.toString();
    }

    // Metodo equals per confrontare due triangoli
    public boolean equals(Triangolo t) {
        return (a.equals(t.a) && b.equals(t.b) && c.equals(t.c));
    }

    // Metodo main per testare la classe Triangolo
    public static void main(String[] args) {
        Punto p1 = new Punto(1.0, 1.0, 0.0);
        Punto p2 = new Punto(2.0, 2.0, 0.0);
        Punto p3 = new Punto(2.0, 1.0, 0.0);
        Punto p4 = new Punto(1.0, 4.0, 0.0);

        Triangolo t1 = new Triangolo(p1, p2, p3);
        Triangolo t2 = new Triangolo(p1, p2, p4);
        Triangolo t3 = new Triangolo(t1); // Costruttore di copia

        System.out.println("Triangolo T1: " + t1);
        System.out.println("Perimetro T1: " + t1.perimetro());
        System.out.println("Area T1: " + t1.area());

        System.out.println("Triangolo T2: " + t2);
        System.out.println("Perimetro T2: " + t2.perimetro());
        System.out.println("Area T2: " + t2.area());

        System.out.println("Triangolo T3 (copia di T1): " + t3);
        System.out.println("Perimetro T3: " + t3.perimetro());
        System.out.println("Area T3: " + t3.area());

        // Verifica dell'uguaglianza tra T1 e T3
        if (t1.equals(t3)) {
            System.out.println("I triangoli T1 e T3 sono uguali.");
        } else {
            System.out.println("I triangoli T1 e T3 non sono uguali.");
        }

        // Verifica dell'uguaglianza tra T1 e T2
        if (t1.equals(t2)) {
            System.out.println("I triangoli T1 e T2 sono uguali.");
        } else {
            System.out.println("I triangoli T1 e T2 non sono uguali.");
        }
    }
}