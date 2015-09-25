package com.zangetsu.graph;

import org.junit.Test;

/**
 * Created by vm023561 on 9/25/15.
 */
public class GraphTest
{

    Graph graph = new Graph();

    @Test
    public void addEdges ()
    {
        graph.addEdge("1", "2");
        graph.addEdge("1", "3");
        graph.addEdge("1", "5");
        graph.addEdge("2", "3");
        graph.addEdge("3", "5");
        System.out.println(graph.toString());
    }
}
