/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class NodoRoute {
    
    private Route element;
    private NodoRoute next;

    public NodoRoute(Route element) {
        this.element = element;
        this.next = null;
    }

    public Route getElement() {
        return element;
    }

    public void setElement(Route element) {
        this.element = element;
    }

    public NodoRoute getNext() {
        return next;
    }

    public void setNext(NodoRoute next) {
        this.next = next;
    }
    
}
