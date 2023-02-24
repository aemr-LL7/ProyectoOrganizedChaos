/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class ListStock {

    private NodoStock peek;
    private int lenght;

    public ListStock() {
    }

    public ListStock(NodoStock peek) {
        if (peek == null) {
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.peek = peek;
    }

    public NodoStock getPeek() {
        return peek;
    }

    public int getLenght() {
        return lenght;
    }

    public void setPeek(NodoStock peek) {
        this.peek = peek;
    }

    public void insertPrinciple(Stock stock) {
        NodoStock nodo = new NodoStock(stock);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            nodo.setNext(getPeek());
            setPeek(nodo);
        }
        lenght++;
    }

    public void insertEnd(Stock stock) {
        NodoStock nodo = new NodoStock(stock);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            NodoStock pointer = getPeek();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        lenght++;
    }

    public void insertInIndex(int pos, Stock stock) {
        //se le debe restar 1
        pos = pos - 1;
        NodoStock nodo = new NodoStock(stock);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            NodoStock pointer = getPeek();
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

    public Stock getStock(int pos) {
        if (isEmpty()) {
            return null;
        } else {
            NodoStock pointer = getPeek();
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
            NodoStock pointer = getPeek();
            setPeek(pointer.getNext());
            pointer.setNext(null);
            lenght--;
        }
    }

    public void deleteLast() {
        if (!isEmpty()) {
            NodoStock pointer = getPeek();
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(null);
            lenght--;
        }
    }

    public void deleteInIndex(int pos) {
        if (!isEmpty()) {
            NodoStock pointer = getPeek();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            NodoStock temp = pointer.getNext();
            pointer.setNext(temp.getNext());
            temp.setNext(null);
            lenght--;
        }
    }

    public boolean isEmpty() {
        return getPeek() == null;
    }
}
