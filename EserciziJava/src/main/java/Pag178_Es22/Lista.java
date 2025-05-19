package Pag178_Es22;

public class Lista {
    private Nodo head;

    public Lista() {
        this.head = null;
    }

    public void aggiungiPersona(Persona persona) {
        Nodo nuovoNodo = new Nodo(persona);
        nuovoNodo.next = head;
        head = nuovoNodo;
    }

    public void visualizzaPersone() {
        Nodo current = head;
        while (current != null) {
            System.out.println(current.persona);
            current = current.next;
        }
    }
}