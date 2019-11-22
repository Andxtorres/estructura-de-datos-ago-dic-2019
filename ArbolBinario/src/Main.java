


public class Main {
	
	public static void main(String args[]) {
		Arbol<Integer> arbol=new Arbol<>();
		arbol.insertar(9);
		arbol.insertar(5);
		arbol.insertar(15);
		arbol.insertar(13);
		arbol.insertar(12);
		arbol.insertar(14);
		arbol.insertar(17);
		arbol.insertar(16);
		//ArbolPrinter printer= new ArbolPrinter();
		//printer.printNodo(arbol.getRaiz());
		arbol.recorreEnOrden();
	}

}
