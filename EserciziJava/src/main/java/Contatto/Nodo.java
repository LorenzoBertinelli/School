package Contatto;

public class Nodo {
    private Contatto info;
    private Nodo link;

    public Nodo(Contatto info) {
    	this.info=info;
    	link = null;
    }

    public Contatto getInfo() {
        return info;
    }

    public void setLink(Nodo l) {
        link = l;
    }

    public Nodo getLink() {
        return link;
    }
}