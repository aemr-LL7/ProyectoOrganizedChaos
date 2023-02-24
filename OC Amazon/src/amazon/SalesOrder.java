/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class SalesOrder {
    
    private String nameProduct;
    private int orderNumber;
    private int amount;
    private String warehouse;
    
    public SalesOrder() {
    }

    public SalesOrder(String nameProduct, int orderNumber, int amount, String warehouse) {
        this.nameProduct = nameProduct;
        this.orderNumber = orderNumber;
        this.amount = amount;
        this.warehouse = warehouse;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
    
}
