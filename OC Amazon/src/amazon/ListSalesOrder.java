/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class ListSalesOrder {

    private NodoSalesOrder peek;
    private int lenght;

    public ListSalesOrder() {
    }

    public ListSalesOrder(NodoSalesOrder peek) {
        if (peek == null) {
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.peek = peek;
    }

    public NodoSalesOrder getPeek() {
        return peek;
    }

    public int getLenght() {
        return lenght;
    }

    public void setPeek(NodoSalesOrder peek) {
        this.peek = peek;
    }

    public void insertPrinciple(SalesOrder salesOrder) {
        NodoSalesOrder nodo = new NodoSalesOrder(salesOrder);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            nodo.setNext(getPeek());
            setPeek(nodo);
        }
        lenght++;
    }

    public void insertEnd(SalesOrder salesOrder) {
        NodoSalesOrder nodo = new NodoSalesOrder(salesOrder);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            NodoSalesOrder pointer = getPeek();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        lenght++;
    }

    public void insertInIndex(int pos, SalesOrder salesOrder) {
        //se le debe restar 1
        pos = pos - 1;
        NodoSalesOrder nodo = new NodoSalesOrder(salesOrder);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            NodoSalesOrder pointer = getPeek();
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

    public SalesOrder getSalesOrder(int pos) {
        if (isEmpty()) {
            return null;
        } else {
            NodoSalesOrder pointer = getPeek();
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
            NodoSalesOrder pointer = getPeek();
            setPeek(pointer.getNext());
            pointer.setNext(null);
            lenght--;
        }
    }

    public void deleteLast() {
        if (!isEmpty()) {
            NodoSalesOrder pointer = getPeek();
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(null);
            lenght--;
        }
    }

    public void deleteInIndex(int pos) {
        if (!isEmpty()) {
            NodoSalesOrder pointer = getPeek();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            NodoSalesOrder temp = pointer.getNext();
            pointer.setNext(temp.getNext());
            temp.setNext(null);
            lenght--;
        }
    }

    public boolean isEmpty() {
        return getPeek() == null;
    }

}
