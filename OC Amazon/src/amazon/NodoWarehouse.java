/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class NodoWarehouse {
    
    private Warehouse element;
    private NodoWarehouse next;

    public NodoWarehouse(Warehouse element) {
        this.element = element;
        this.next = null;
    }

    public Warehouse getElement() {
        return element;
    }

    public void setElement(Warehouse element) {
        this.element = element;
    }

    public NodoWarehouse getNext() {
        return next;
    }

    public void setNext(NodoWarehouse next) {
        this.next = next;
    }

}
