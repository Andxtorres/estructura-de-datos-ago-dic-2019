
public class Cola<T> {
	private Nodo<T> inicial;
	
	
	public void enqueue(T elemento) {
		Nodo<T> nodoAInsertar= new Nodo<>(elemento);
		if(inicial==null)
			inicial=nodoAInsertar;
		else {
			Nodo<T> temp=inicial;
			while(temp.getSiguiente()!=null) {
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(nodoAInsertar);
		}
	}
	
	public T dequeue() {
		if(estaVacia()) {
			System.out.println("Nada que sacar");
			return null;
		}else {
			Nodo<T> temp=inicial;
			inicial=inicial.getSiguiente();
			return temp.getElemento();
		}
		
		
	}
	
	public T peek() {
		if(estaVacia()) {
			System.out.println("Nada que sacar");
			return null;
		}else {
			return inicial.getElemento();
		}
		
	}
	
	public boolean estaVacia() {
		return inicial==null;
	}
	public void imprime() {
		if(estaVacia()) {
			System.out.println("Lista vacía");
		}else {
			Nodo<T> temp = inicial;
			while (temp!=null) {
				System.out.println("Nodo: "+ temp.getElemento().toString());
				temp=temp.getSiguiente();
			}
		}
	}

}
