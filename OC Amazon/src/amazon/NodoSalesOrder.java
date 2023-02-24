/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class NodoSalesOrder {

    private SalesOrder element;
    private NodoSalesOrder next;

    public NodoSalesOrder(SalesOrder element) {
        this.element = element;
        this.next = null;
    }

    public SalesOrder getElement() {
        return element;
    }

    public void setElement(SalesOrder element) {
        this.element = element;
    }

    public NodoSalesOrder getNext() {
        return next;
    }

    public void setNext(NodoSalesOrder next) {
        this.next = next;
    }

}
