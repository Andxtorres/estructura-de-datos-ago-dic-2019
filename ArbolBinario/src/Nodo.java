
public class Nodo <T extends Comparable<T>>{
	private T elemento;
	private Nodo<T> izquierdo;
	private Nodo<T> derecho;
	private int altura;
	
	public Nodo(T elemento) {
		this.elemento=elemento;
	}
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public Nodo<T> getIzquierdo() {
		return izquierdo;
	}
	public void setIzquierdo(Nodo<T> izquierdo) {
		this.izquierdo = izquierdo;
	}
	public Nodo<T> getDerecho() {
		return derecho;
	}
	public void setDerecho(Nodo<T> derecho) {
		this.derecho = derecho;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	

}
