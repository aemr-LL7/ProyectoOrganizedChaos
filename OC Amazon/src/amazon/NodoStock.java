/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class NodoStock {
    
    private Stock element;
    private NodoStock next;

    public NodoStock(Stock element) {
        this.element = element;
        this.next = null;
    }

    public Stock getElement() {
        return element;
    }

    public void setElement(Stock element) {
        this.element = element;
    }

    public NodoStock getNext() {
        return next;
    }

    public void setNext(NodoStock next) {
        this.next = next;
    }
    
}
