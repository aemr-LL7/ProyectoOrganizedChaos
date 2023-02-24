/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class ListProduct {

    private NodoProduct peek;
    private int lenght;

    public ListProduct() {
    }

    public ListProduct(NodoProduct peek) {
        if (peek == null) {
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.peek = peek;
    }

    public NodoProduct getPeek() {
        return peek;
    }

    public int getLenght() {
        return lenght;
    }

    public void setPeek(NodoProduct peek) {
        this.peek = peek;
    }

    public void insertPrinciple(Product product) {
        NodoProduct nodo = new NodoProduct(product);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            nodo.setNext(getPeek());
            setPeek(nodo);
        }
        lenght++;
    }

    public void insertEnd(Product product) {
        NodoProduct nodo = new NodoProduct(product);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            NodoProduct pointer = getPeek();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        lenght++;
    }

    public void insertInIndex(int pos, Product product) {
        //se le debe restar 1
        pos = pos - 1;
        NodoProduct nodo = new NodoProduct(product);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            NodoProduct pointer = getPeek();
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

    public Product getProduct(int pos) {
        if (isEmpty()) {
            return null;
        } else {
            NodoProduct pointer = getPeek();
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
            NodoProduct pointer = getPeek();
            setPeek(pointer.getNext());
            pointer.setNext(null);
            lenght--;
        }
    }

    public void deleteLast() {
        if (!isEmpty()) {
            NodoProduct pointer = getPeek();
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(null);
            lenght--;
        }
    }

    public void deleteInIndex(int pos) {
        if (!isEmpty()) {
            NodoProduct pointer = getPeek();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            NodoProduct temp = pointer.getNext();
            pointer.setNext(temp.getNext());
            temp.setNext(null);
            lenght--;
        }
    }

    public boolean isEmpty() {
        return getPeek() == null;
    }

}
