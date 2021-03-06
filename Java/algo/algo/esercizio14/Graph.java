package algo.esercizio14;

import java.util.ArrayList;
import java.util.List;
import algo.esercizio14.SparseGraph.Edge;

/**
 * General interface for Graph abstract data type
 *
 * @param <V> type of vertices
 * @param <E> type of edges
 */
public interface Graph<V, E> {

    /**
     * adds vertex to a graph if it does not exist already.
     *
     * @param vertex to be added
     * @return true if vertex was added
     */
    boolean addVertex(V vertex);

    /**
     * adds edge (v1, v2) to the graph and information info, only if the edge
     * dows not exist.
     *
     * @param v1 First vertex belonging to the edge
     * @param v2 Second vertex belonging to the edge
     * @param info edge extra info. It can be null.
     * @return true if vertex was added, false otherwise
     * @throws IllegalArgumentException if a vertex doest not belong to the
     * graph
     */
    boolean addEdge(V v1, V v2, E info) throws IllegalArgumentException;

    /**
     * adds edge (v1, v2) to the graph, assigning weight and information info,
     * only if the edge dows not exist.
     *
     * @param v1 First vertex belonging to the edge
     * @param v2 Second vertex belonging to the edge
     * @param weight Cost of the edge
     * @param info edge extra info. It can be null.
     * @return true if vertex was added, false otherwise
     * @throws IllegalArgumentException if a vertex doest not belong to the
     * graph
     */
    boolean addEdge(V v1, V v2, double weight, E info) throws IllegalArgumentException;

    /**
     * adds undirected edge (v1, v2), (v2,v1) to the graph, assigning default
     * weight 1 and information info, only if the edge dows not exist.
     *
     * @param v1 First vertex belonging to the edge
     * @param v2 Second vertex belonging to the edge
     * @param info edge extra info. It can be null.
     * @return true if vertex was added, false otherwise
     * @throws IllegalArgumentException if a vertex doest not belong to the
     * graph
     */
    boolean addUndirectedEdge(V v1, V v2, E info) throws IllegalArgumentException;

    /**
     * adds undirected edge (v1, v2) (v2, v1) to the graph, assigning
     * information info, only if the edge dows not exist.
     *
     * @param v1 First vertex belonging to the edge
     * @param v2 Second vertex belonging to the edge
     * @param weight Cost of the edge
     * @param info edge extra info. It can be null.
     * @return true if vertex was added, false otherwise
     * @throws IllegalArgumentException if a vertex doest not belong to the
     * graph
     */
    boolean addUndirectedEdge(V v1, V v2, double weight, E info) throws IllegalArgumentException;

    /**
     * Check for vertex existance
     *
     * @param vertex to be found
     * @return true if vertex exists, false otherwise
     */
    boolean hasVertex(V vertex);

    /**
     * Check for edge existance
     *
     * @param v1
     * @param v2
     * @return true if edge found, false otherwise
     * @throws IllegalArgumentException if vertices not in graph
     *
     */
    boolean hasEdge(V v1, V v2) throws IllegalArgumentException;

    /**
     * Returns weight of a single edge, if the edge is weighted; 1 otherwise
     *
     * @param from origin vertex
     * @param to destination vertes
     * @return edge's weight
     * @throws IllegalArgumentException if vertices or edge not in graph
     */
    double getWeight(V from, V to) throws IllegalArgumentException;

    /**
     * @return list of all vertices in the graph
     */
    ArrayList<V> vertices();

    /**
     * @param vertex
     * @return adjacency list of vertex; null if vertex does not belong to the
     * graph
     */
    ArrayList<V> neighbours(V vertex);

    /**
     * @return all edges of the graph
     */
    List<Edge> edges();

    /**
     * @param v
     * @return all edges incident to node v
     */
    List<Edge> edges(V v);
}
