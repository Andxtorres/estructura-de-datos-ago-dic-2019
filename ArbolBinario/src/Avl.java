
public class Avl<T extends Comparable<T>> {
	
	private Nodo<T> raiz;

	public Nodo<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo<T> raiz) {
		this.raiz = raiz;
	}
	
	public void insertarElemento(T elemento) {
		raiz= insertaRecursivo(elemento,raiz);
	}
	
	public Nodo<T> insertaRecursivo(T elemento,Nodo<T> raiz) {
		if(raiz==null) {
			raiz= new Nodo<T>(elemento);
		}else {
			
		}
	}
	
	
	private Nodo<T> rotacionSimpleALaDerecha(Nodo<T> nodo){
		Nodo<T> temp= nodo.getIzquierdo();
		nodo.setIzquierdo(temp.getDerecho());
		temp.setDerecho(nodo);
		nodo.setAltura(max(altura(nodo.getIzquierdo()),altura(nodo.getDerecho()))+1);
		temp.setAltura(max(altura(temp.getIzquierdo()),altura(nodo.getDerecho()))+1);
		return temp;
	}
	private Nodo<T> rotacionSimpleALaIzquierda(Nodo<T> nodo){
		Nodo<T> temp= nodo.getDerecho();
		nodo.setDerecho(temp.getIzquierdo());
		temp.setIzquierdo(nodo);
		nodo.setAltura(max(altura(nodo.getDerecho()),altura(nodo.getIzquierdo()))+1);
		temp.setAltura(max(altura(temp.getDerecho()),altura(nodo.getIzquierdo()))+1);
		return temp;
	}
	private Nodo<T> rotacionDobleALaDerecha(Nodo<T> nodo){
		nodo.setIzquierdo(rotacionSimpleALaIzquierda(nodo.getDerecho()));
		return rotacionSimpleALaDerecha(nodo);
		
	}
	private Nodo<T> rotacionDobleALaIzquierda(Nodo<T> nodo){
		nodo.setDerecho(rotacionSimpleALaDerecha(nodo.getIzquierdo()));
		return rotacionSimpleALaIzquierda(nodo);
		
	}
	private int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}	
	private int altura(Nodo<T> nodo) {
		if(nodo==null) {
			return -1;
		}else {
			return nodo.getAltura();
		}
	}
}
