package Contatto;

public class Lista {
    private Nodo head;
    private int elementi;

    public Lista() {
        head = null;
        elementi = 1;
    }

    public void inserisci(Contatto info) {
        Nodo nuovo = new Nodo(info);
        nuovo.setLink(head);
        head = nuovo;
        elementi = elementi + 1;
    }

    public void visualizza() {
        Nodo temp = head;
        while (temp != null) {
            System.out.println(temp.getInfo());
            temp = temp.getLink();
        }
    }

    public void eliminaPrimo() {
        if (head != null)
            head = head.getLink();
            elementi--;
    }
}