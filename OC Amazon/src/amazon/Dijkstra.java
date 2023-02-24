/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amazon;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author andre
 * @param <T>
 */
public class Dijkstra<T> {

    public void calculateShortestPath(NodoDijkstra<T> source) {
        source.setDistance(0);
        Set<NodoDijkstra<T>> settledNodes = new HashSet<>();
        Queue<NodoDijkstra<T>> unsettledNodes = new PriorityQueue<>(Collections.singleton(source));
        while (!unsettledNodes.isEmpty()) {
            NodoDijkstra<T> currentNode = unsettledNodes.poll();
            currentNode.getAdjacentNodes()
                    .entrySet().stream()
                    .filter(entry -> !settledNodes.contains(entry.getKey()))
                    .forEach(entry -> {
                        evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode);
                        unsettledNodes.add(entry.getKey());
                    });
            settledNodes.add(currentNode);
        }
    }

    private void evaluateDistanceAndPath(NodoDijkstra<T> adjacentNode, Integer edgeWeight, NodoDijkstra<T> sourceNode) {
        Integer newDistance = sourceNode.getDistance() + edgeWeight;
        if (newDistance < adjacentNode.getDistance()) {
            adjacentNode.setDistance(newDistance);
            adjacentNode.setShortestPath(Stream.concat(sourceNode.getShortestPath().stream(), Stream.of(sourceNode)).toList());
        }
    }
    
    // printPaths(Arrays.asList(nodoA, nodoB, nodoC, nodoD, nodoE)); mostrar el atributo de la ruta mas corta de cada nodo que que le pasa el algoritmo (siempre que sean minimas)  
    public void printPaths(List<NodoDijkstra<T>> nodes) {
        nodes.forEach(node -> {
            String path = node.getShortestPath().stream()
                    .map(NodoDijkstra::getName).map(Objects::toString)
                    .collect(Collectors.joining(" -> "));
            System.out.println((path.isBlank()
                    ? "%s : %s".formatted(node.getName(), node.getDistance())
                    : "%s -> %s : %s".formatted(path, node.getName(), node.getDistance()))
            );
        });
    }

}
