/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class NodoProduct {
    
    private Product element;
    private NodoProduct next;
    
    public NodoProduct(Product element) {
        this.element = element;
        this.next = null;
    }

    public Product getElement() {
        return element;
    }

    public void setElement(Product element) {
        this.element = element;
    }

    public NodoProduct getNext() {
        return next;
    }

    public void setNext(NodoProduct next) {
        this.next = next;
    }
    
}
