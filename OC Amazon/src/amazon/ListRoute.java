/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class ListRoute {

    private NodoRoute peek;
    private int lenght;

    public ListRoute() {
    }

    public ListRoute(NodoRoute peek) {
        if (peek == null) {
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.peek = peek;
    }

    public NodoRoute getPeek() {
        return peek;
    }

    public int getLenght() {
        return lenght;
    }

    public void setPeek(NodoRoute peek) {
        this.peek = peek;
    }

    public void insertPrinciple(Route route) {
        NodoRoute nodo = new NodoRoute(route);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            nodo.setNext(getPeek());
            setPeek(nodo);
        }
        lenght++;
    }

    public void insertEnd(Route route) {
        NodoRoute nodo = new NodoRoute(route);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            NodoRoute pointer = getPeek();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        lenght++;
    }

    public void insertInIndex(int pos, Route route) {
        //se le debe restar 1
        pos = pos - 1;
        NodoRoute nodo = new NodoRoute(route);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            NodoRoute pointer = getPeek();
            int cont = 0;
            while (cont < pos && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            nodo.setNext(pointer.getNext());
            pointer.setNext(nodo);
        }
        lenght++;
    }

    public Route getRoute(int pos) {
        if (isEmpty()) {
            return null;
        } else {
            NodoRoute pointer = getPeek();
            int cont = 0;
            while (cont < pos && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            if (cont == pos) {
                return pointer.getElement();
            } else {
                return null;
            }
        }
    }

    public void deletePrinciple() {
        if (!isEmpty()) {
            NodoRoute pointer = getPeek();
            setPeek(pointer.getNext());
            pointer.setNext(null);
            lenght--;
        }
    }

    public void deleteLast() {
        if (!isEmpty()) {
            NodoRoute pointer = getPeek();
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(null);
            lenght--;
        }
    }

    public void deleteInIndex(int pos) {
        if (!isEmpty()) {
            NodoRoute pointer = getPeek();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            NodoRoute temp = pointer.getNext();
            pointer.setNext(temp.getNext());
            temp.setNext(null);
            lenght--;
        }
    }

    public boolean isEmpty() {
        return getPeek() == null;
    }

}
