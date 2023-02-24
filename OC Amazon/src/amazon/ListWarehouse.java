/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class ListWarehouse {

    private NodoWarehouse peek;
    private int lenght;

    public ListWarehouse() {
    }

    public ListWarehouse(NodoWarehouse peek) {
        if (peek == null) {
            lenght = 0;
        } else {
            lenght = 1;
        }
        this.peek = peek;
    }

    public NodoWarehouse getPeek() {
        return peek;
    }

    public int getLenght() {
        return lenght;
    }

    public void setPeek(NodoWarehouse peek) {
        this.peek = peek;
    }

    public void insertPrinciple(Warehouse warehouse) {
        NodoWarehouse nodo = new NodoWarehouse(warehouse);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            nodo.setNext(getPeek());
            setPeek(nodo);
        }
        lenght++;
    }

    public void insertEnd(Warehouse warehouse) {
        NodoWarehouse nodo = new NodoWarehouse(warehouse);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            NodoWarehouse pointer = getPeek();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        lenght++;
    }

    public void insertInIndex(int pos, Warehouse warehouse) {
        //se le debe restar 1
        pos = pos - 1;
        NodoWarehouse nodo = new NodoWarehouse(warehouse);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            NodoWarehouse pointer = getPeek();
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

    public Warehouse getWarehouse(int pos) {
        if (isEmpty()) {
            return null;
        } else {
            NodoWarehouse pointer = getPeek();
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
            NodoWarehouse pointer = getPeek();
            setPeek(pointer.getNext());
            pointer.setNext(null);
            lenght--;
        }
    }

    public void deleteLast() {
        if (!isEmpty()) {
            NodoWarehouse pointer = getPeek();
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(null);
            lenght--;
        }
    }

    public void deleteInIndex(int pos) {
        if (!isEmpty()) {
            NodoWarehouse pointer = getPeek();
            int cont = 0;
            while (cont < (pos - 1) && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            NodoWarehouse temp = pointer.getNext();
            pointer.setNext(temp.getNext());
            temp.setNext(null);
            lenght--;
        }
    }

    public boolean isEmpty() {
        return getPeek() == null;
    }

}
