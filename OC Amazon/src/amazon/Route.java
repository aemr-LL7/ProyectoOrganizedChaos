/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class Route {
    
    private String warehouse;
    private String warehouseAdjacent;
    private int weight;
    private int x;
    private int y;
    
    public Route() {
    }

    public Route(String warehouse, String warehouseAdjacent, int weight, int x, int y) {
        this.warehouse = warehouse;
        this.warehouseAdjacent = warehouseAdjacent;
        this.weight = weight;
        this.x = x;
        this.y = y;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getWarehouseAdjacent() {
        return warehouseAdjacent;
    }

    public void setWarehouseAdjacent(String warehouseAdjacent) {
        this.warehouseAdjacent = warehouseAdjacent;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
