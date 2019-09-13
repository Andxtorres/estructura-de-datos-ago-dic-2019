
public class Pila<T> {
	
	private Nodo<T> inicial;
	
	public void push(T elemento) {
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
	
	public T pop() {
		if(inicial==null) {
			System.out.println("Nada por sacar");
			return null;
		}else {
			Nodo<T> temp=inicial;
			Nodo<T> penultimo=null;
			if(inicial.getSiguiente()==null) {
				T result=inicial.getElemento();
				inicial=null;
				return result;
			}
			while(temp.getSiguiente()!=null) {
				penultimo=temp;
				temp=temp.getSiguiente();
			}
			
			T result= temp.getElemento();
			penultimo.setSiguiente(null);
			return result;
		}
	}
	public T peek() {
		if(inicial==null) {
			System.out.println("Nada por sacar");
			return null;
		}else {
			Nodo<T> temp=inicial;
			while(temp.getSiguiente()!=null) {
				temp=temp.getSiguiente();
			}
			T result= temp.getElemento();
			return result;
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
