
public class Main {
	
	public static void main(String args[]) throws VerticesNotFoundException {
		Grafo<String> g= new Grafo<>();
		g.agregarVertice("A");
		g.agregarVertice("S");
		g.agregarVertice("B");
		g.agregarVertice("C");
		g.agregarVertice("D");
		g.agregarVertice("E");
		g.agregarVertice("F");
		g.agregarVertice("G");
		g.agregarVertice("H");
		g.agregarArista("A", "S");
		g.agregarArista("A", "B");
		g.agregarArista("S", "G");
		g.agregarArista("S", "C");
		g.agregarArista("F", "G");
		g.agregarArista("C", "F");
		g.agregarArista("C", "E");
		g.agregarArista("C", "D");
		g.agregarArista("E", "H");
		g.agregarArista("G", "H");
		g.recorreEnAnchura();
		g.recorreEnProfundidad();
	}

}
