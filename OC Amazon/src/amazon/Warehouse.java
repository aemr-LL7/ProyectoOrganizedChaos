/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

/**
 *
 * @author andre
 */
public class Warehouse {

    private String name;
    private String code;
    private int nodo;

    public Warehouse() {
    }

    public Warehouse(String name, String code, int nodo) {
        this.name = name;
        this.code = code;
        this.nodo = nodo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNodo() {
        return nodo;
    }

    public void setNodo(int nodo) {
        this.nodo = nodo;
    }

}
