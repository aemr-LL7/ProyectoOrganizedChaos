/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author andre
 * @param <T>
 */
public class NodoDijkstra<T> implements Comparable<NodoDijkstra> {

    private T name;
    private Integer distance = Integer.MAX_VALUE;
    private List<NodoDijkstra> shortestPath = new LinkedList<>();
    private Map<NodoDijkstra, Integer> adjacentNodes = new HashMap<>();

    public void addAdjacentNode(NodoDijkstra node, int weight) {
        getAdjacentNodes().put(node, weight);
    }
    // cola de prioridad para extraer el nodo no resuelto con la distancia mas pequeña

    @Override
    public int compareTo(NodoDijkstra node) {
        return Integer.compare(this.getDistance(), node.getDistance());
    }

    /**
     * @return the name
     */
    public T getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(T name) {
        this.name = name;
    }

    /**
     * @return the distance
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * @return the shortestPath
     */
    public List<NodoDijkstra> getShortestPath() {
        return shortestPath;
    }

    /**
     * @param shortestPath the shortestPath to set
     */
    public void setShortestPath(List<NodoDijkstra> shortestPath) {
        this.shortestPath = shortestPath;
    }

    /**
     * @return the adjacentNodes
     */
    public Map<NodoDijkstra, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    /**
     * @param adjacentNodes the adjacentNodes to set
     */
    public void setAdjacentNodes(Map<NodoDijkstra, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    
    
    
 

}
