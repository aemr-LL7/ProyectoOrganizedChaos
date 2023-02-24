package amazon;


/**
 *
 * @author andre
 */
public class Grafo {
    
    public static void CreateGrafo(int nodo, int vertice) {
        // Indica si es dirigido o no. 
        boolean dirigido = true;
        // Tamaño máximo de la tabla. 
        int maxNodos = nodo;
        // Número de vértices del grafo. 
        int numVertices = vertice;
        // Matriz de adyacencias del grafo.
        boolean matrizAdy[][];
        matrizAdy = new boolean[maxNodos][numVertices];

        // Linea
        String Linea = null;
        for (int x = 1; x < 5; x++) {
            for (int z = 1; z < 5; z++) {
                System.out.println(x + "  :   " + z);
                matrizAdy[x][z] = false;
            }
        }
        for (int x = 1; x < 5; x++) {
            Linea = "";
            for (int z = 1; z < 5; z++) {
                Linea = "|" + Linea + matrizAdy[x][z] + "|";
            }
            System.out.println(Linea);
        }

    }
    
}
