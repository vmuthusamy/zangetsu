package com.zangetsu.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.base.Objects;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

/**
 * Created by vm023561 on 9/25/15.
 */
public class Graph
{
    private Multimap<String, String> edges = HashMultimap.create();

    public void addEdge (String src, String dest)
    {
        edges.put(src, dest);
    }

    public Iterable<String> getNeighbors (String vertex)
    {
        return edges.get(vertex);
    }

    @Override public boolean equals (Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Graph graph = (Graph) o;
        return Objects.equal(edges, graph.edges);
    }

    @Override public int hashCode ()
    {
        return Objects.hashCode(edges);
    }

    @Override public String toString ()
    {
        return "Graph{" +
                "edges=" + edges +
                '}';
    }
}
