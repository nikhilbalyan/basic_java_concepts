package graph_questions_practice;

import java.util.LinkedList;

// Java Program to demonstrate adjacency list
// representation of graphs
public class AdjacencyListGraph {
	
	// a user define class to represent a graph.
	// a graph is an array of adjacency lists.
	// size of array will be V ( number of vertices
	// in graph)
	static class Graph {
		int V;
		LinkedList<Integer> adjListArray[];
		// constructor
		Graph(int V) {
			this.V = V;
			
			
			// define the size of array as
			// number of vertices
			adjListArray = new LinkedList[V];
			
			// create a new list for each vertex
			// such that adjacent nodes can be stored
			for(int i = 0; i < V; i++) {
				adjListArray[i] = new LinkedList<>();
			}
		}
	}
	
	
	// Adds an edge to an undirected graph
	static void addEdge(Graph graph, int src, int dest) {
		// add an edge from src to dest.
//		graph.adjListArray[src].addFirst(dest);
		graph.adjListArray[src].add(dest);
		
		// since graph is undirected, add an edge from dest to
		// src also
//		graph.adjListArray[dest].addFirst(src);
		graph.adjListArray[dest].add(src);
	}
	
	// A utility function to print the adjacency list
	// represtnation of graph
	static void printGraph(Graph graph) {
		for(int v = 0; v < graph.V; v++) {
			System.out.println("Adjacency list of vertex"+ v);
			System.out.println("head");
			for(Integer pCrawl : graph.adjListArray[v]) {
				System.out.println(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		// creating the graph
		int V = 5;
		Graph graph = new Graph(V);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		// printing the graph
		printGraph(graph);
	}
}
